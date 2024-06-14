package br.edu.up.daos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.edu.up.models.Cliente;
import br.edu.up.models.Funcionario;
import br.edu.up.models.Livro;
import br.edu.up.models.LivroAcao;
import br.edu.up.models.LivroComedia;
import br.edu.up.models.LivroRomance;
import br.edu.up.models.LivroTerror;

public class GerenciadorDeArquivos {

    private final String LIVROS_FILE = "livros.csv";
    private final String CLIENTES_FILE = "clientes.csv";
    private final String FUNCIONARIOS_FILE = "funcionarios.csv";

    public List<Livro> getLivros() {
        return lerLivrosDoArquivo(LIVROS_FILE);
    }

    public List<Cliente> getClientes() {
        return lerClientesDoArquivo(CLIENTES_FILE);
    }

    public List<Funcionario> getFuncionarios() {
        return lerFuncionariosDoArquivo(FUNCIONARIOS_FILE);
    }

    public boolean gravar(List<Livro> livros, List<Cliente> clientes, List<Funcionario> funcionarios) {
        return gravarLivrosNoArquivo(livros, LIVROS_FILE) &&
               gravarClientesNoArquivo(clientes, CLIENTES_FILE) &&
               gravarFuncionariosNoArquivo(funcionarios, FUNCIONARIOS_FILE);
    }

    private List<Livro> lerLivrosDoArquivo(String fileName) {
        List<Livro> livros = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(",");
                if (campos.length == 5) {
                    int id = Integer.parseInt(campos[0]);
                    String nome = campos[1];
                    String genero = campos[2];
                    int lancamento = Integer.parseInt(campos[3]);
                    String autor = campos[4];
                    Livro livro = null;
                    switch (genero.toLowerCase()) {
                        case "ação":
                            livro = new LivroAcao(id, nome, genero, lancamento, autor);
                            break;
                        case "comédia":
                            livro = new LivroComedia(id, nome, genero, lancamento, autor);
                            break;
                        case "romance":
                            livro = new LivroRomance(id, nome, genero, lancamento, autor);
                            break;
                        case "terror":
                            livro = new LivroTerror(id, nome, genero, lancamento, autor);
                            break;
                    }
                    if (livro != null) {
                        livros.add(livro);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return livros;
    }

    private List<Cliente> lerClientesDoArquivo(String fileName) {
        List<Cliente> clientes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(",");
                if (campos.length == 4) {
                    String nome = campos[0];
                    String cpf = campos[1];
                    String telefone = campos[2];
                    String endereco = campos[3];
                    Cliente cliente = new Cliente(nome, cpf, telefone, endereco);
                    clientes.add(cliente);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clientes;
    }

    private List<Funcionario> lerFuncionariosDoArquivo(String fileName) {
        List<Funcionario> funcionarios = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(",");
                if (campos.length == 4) {
                    String nome = campos[0];
                    String cpf = campos[1];
                    String telefone = campos[2];
                    String registro = campos[3];
                    Funcionario funcionario = new Funcionario(nome, cpf, telefone, registro);
                    funcionarios.add(funcionario);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return funcionarios;
    }

    private boolean gravarLivrosNoArquivo(List<Livro> livros, String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Livro livro : livros) {
                bw.write(String.format("%d,%s,%s,%d,%s\n", livro.getId(), livro.getNome(), livro.getGenero(), livro.getLancamento(), livro.getAutor()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private boolean gravarClientesNoArquivo(List<Cliente> clientes, String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Cliente cliente : clientes) {
                bw.write(String.format("%s,%s,%s,%s\n", cliente.getNome(), cliente.getCPF(), cliente.getTelefone(), cliente.getEndereco()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private boolean gravarFuncionariosNoArquivo(List<Funcionario> funcionarios, String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Funcionario funcionario : funcionarios) {
                bw.write(String.format("%s,%s,%s,%s\n", funcionario.getNome(), funcionario.getCPF(), funcionario.getTelefone(), funcionario.getRegistro()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
