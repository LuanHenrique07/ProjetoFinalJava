package br.edu.up.daos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.up.models.Livro;
import br.edu.up.models.LivroAcao;
import br.edu.up.models.LivroComedia;
import br.edu.up.models.LivroTerror;
import br.edu.up.models.LivroRomance;

public class LivroCsvDAO implements LivroDAO {

    private String header = "";
    private String nomeDoArquivo = "C:\\Users\\autologon\\Desktop";

    public LivroCsvDAO(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    @Override
    public List<Livro> getAll() {
        List<Livro> listaDeLivros = new ArrayList<>();

        try {
            File arquivoLeitura = new File(nomeDoArquivo);
            Scanner leitor = new Scanner(arquivoLeitura);

            header = leitor.nextLine();

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] dados = linha.split(";");

                int id = Integer.parseInt(dados[0]);
                String nome = dados[1];
                String genero = dados[2];
                int lancamento = Integer.parseInt(dados[3]);
                String autor = dados[4];

                // Verifica o gênero do livro para instanciar a classe correta
                Livro livro;
                switch (genero) {
                    case "Ação":
                        livro = new LivroAcao(nome, id, genero, lancamento, autor);
                        break;
                    case "Comédia":
                        livro = new LivroComedia(nome, id, genero, lancamento, autor);
                        break;
                    case "Terror":
                        livro = new LivroTerror(nome, id, genero, lancamento, autor);
                        break;
                    case "Romance":
                        livro = new LivroRomance(nome, id, genero, lancamento, autor);
                        break;
                    default:
                        throw new IllegalArgumentException("Gênero de livro inválido: " + genero);
                }

                listaDeLivros.add(livro);
            }
            leitor.close();
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado! " + e.getMessage());
        }

        return listaDeLivros;
    }

    @Override
    public boolean saveAll(List<Livro> livros) {
        try (PrintWriter gravador = new PrintWriter(new FileWriter(nomeDoArquivo))) {
            gravador.println(header);

            for (Livro livro : livros) {
                gravador.println(livro.toCSV());
            }

            return true;
        } catch (IOException e) {
            System.out.println("Não foi possível gravar o arquivo! " + e.getMessage());
        }
        return false;
    }
}
