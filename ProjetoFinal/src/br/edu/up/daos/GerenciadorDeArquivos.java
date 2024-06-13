package br.edu.up.daos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.up.models.Cliente;
import br.edu.up.models.Funcionario;
import br.edu.up.models.Livro;

public class GerenciadorDeArquivos {

    private String header = ""; // Defina seu cabeçalho CSV
    private String nomeDoArquivoLivros = "C:\\Users\\Gabriel\\Desktop\\ProjetoFinalJava";
    private String nomeDoArquivoClientes = "C:\\Users\\Gabriel\\Desktop\\ProjetoFinalJava";
    private String nomeDoArquivoFuncionarios = "C:\\Users\\Gabriel\\Desktop\\ProjetoFinalJava";

    public List<Cliente> getClientes() {

        List<Cliente> listaDeClientes = new ArrayList<>();

        try {
            // LER UM ARQUIVO DE TEXTO
            File arquivoLeitura = new File(nomeDoArquivoClientes);
            Scanner leitor = new Scanner(arquivoLeitura);

            // Armazeno cabeçalho
            if (leitor.hasNextLine()) {
                header = leitor.nextLine();
            }

            // Enquanto tiver linha no arquivo
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] dados = linha.split(";");
                String nome = dados[0];
                String cpf = dados[1];
                String telefone = dados[2];
                String endereco = dados[3];

                Cliente cliente = new Cliente(nome, cpf, telefone, endereco);
                listaDeClientes.add(cliente);
            }

            leitor.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de clientes não encontrado! " + e.getMessage());
        }

        return listaDeClientes;
    }

    public List<Funcionario> getFuncionarios() {

        List<Funcionario> listaDeFuncionarios = new ArrayList<>();

        try {
            // LER UM ARQUIVO DE TEXTO
            File arquivoLeitura = new File(nomeDoArquivoFuncionarios);
            Scanner leitor = new Scanner(arquivoLeitura);

            // Armazeno cabeçalho
            if (leitor.hasNextLine()) {
                header = leitor.nextLine();
            }

            // Enquanto tiver linha no arquivo
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] dados = linha.split(";");
                String nome = dados[0];
                String cpf = dados[1];
                String telefone = dados[2];
                String registro = dados[3];

                Funcionario funcionario = new Funcionario(nome, cpf, telefone, registro);
                listaDeFuncionarios.add(funcionario);
            }

            leitor.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de funcionários não encontrado! " + e.getMessage());
        }

        return listaDeFuncionarios;
    }

    public List<Livro> getLivros() {

        List<Livro> listaDeLivros = new ArrayList<>();

        try {
            // LER UM ARQUIVO DE TEXTO
            File arquivoLeitura = new File(nomeDoArquivoLivros);
            Scanner leitor = new Scanner(arquivoLeitura);

            // Armazeno cabeçalho
            if (leitor.hasNextLine()) {
                header = leitor.nextLine();
            }

            // Enquanto tiver linha no arquivo
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] dados = linha.split(";");
                int id = Integer.parseInt(dados[0]);
                String nome = dados[1];
                String genero = dados[2];
                int lancamento = Integer.parseInt(dados[3]);
                String autor = dados[4];

                Livro livro = new Livro(id, nome, genero, lancamento, autor);
                listaDeLivros.add(livro);
            }

            leitor.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de livros não encontrado! " + e.getMessage());
        }

        return listaDeLivros;
    }

    public boolean gravar(List<Livro> livros, List<Cliente> clientes, List<Funcionario> funcionarios) {
        try {
            // GRAVAR ARQUIVO DE LIVROS
            FileWriter arquivoGravar = new FileWriter(nomeDoArquivoLivros);
            PrintWriter gravador = new PrintWriter(arquivoGravar);

            gravador.println(header);

            for (Livro livro : livros) {
                gravador.println(livro.toCSV());
            }

            gravador.close();

            // GRAVAR ARQUIVO DE CLIENTES
            arquivoGravar = new FileWriter(nomeDoArquivoClientes);
            gravador = new PrintWriter(arquivoGravar);

            gravador.println(header);

            for (Cliente cliente : clientes) {
                gravador.println(cliente.toCSV());
            }

            gravador.close();

            // GRAVAR ARQUIVO DE FUNCIONARIOS
            arquivoGravar = new FileWriter(nomeDoArquivoFuncionarios);
            gravador = new PrintWriter(arquivoGravar);

            gravador.println(header);

            for (Funcionario funcionario : funcionarios) {
                gravador.println(funcionario.toCSV());
            }

            gravador.close();

            return true;

        } catch (IOException e) {
            System.out.println("Não foi possível gravar o arquivo! " + e.getMessage());
        }

        return false;
    }

}
