package br.edu.up.controller;

import java.util.List;
import java.util.ArrayList;

import br.edu.up.daos.GerenciadorDeArquivos;
import br.edu.up.models.Livro;
import br.edu.up.models.Cliente;
import br.edu.up.models.Funcionario;

public class ControleDeClasses {

    private GerenciadorDeArquivos gArquivos = new GerenciadorDeArquivos();

    private List<Livro> livros;
    private List<Cliente> clientes;
    private List<Funcionario> funcionarios;

    public ControleDeClasses() {
        this.livros = gArquivos.getLivros();
        this.clientes = gArquivos.getClientes(); // Inicializa clientes a partir do CSV
        this.funcionarios = gArquivos.getFuncionarios(); // Inicializa funcionários a partir do CSV
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
        gravarDados(); // Salvar após adicionar livro
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
        gravarDados(); // Salvar após adicionar cliente
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
        gravarDados(); // Salvar após adicionar funcionário
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    // public Livro getLivroPorNome(String titulo) {
    //     for (Livro livro : livros) {
    //         if (livro.getNome().equals(titulo)) {
    //             return livro;
    //         }
    //     }
    //     return null;
    // }

    public Livro getLivroPorId(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }

    public Cliente getClientePorCPF(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCPF().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    public Funcionario getFuncionarioPorRegistro(String registro) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getRegistro().equals(registro)) {
                return funcionario;
            }
        }
        return null;
    }

    public boolean gravarDados() {
        return gArquivos.gravar(livros, clientes, funcionarios);
    }
}