package br.edu.up.controller;

import java.util.List;
import java.util.ArrayList;

import br.edu.up.daos.GerenciadorDeArquivos;
import br.edu.up.models.Livro;
import br.edu.up.models.Cliente;
import br.edu.up.models.Funcionario;

public class ControleDeClientes {

    private GerenciadorDeArquivos gArquivos = new GerenciadorDeArquivos();

    private List<Livro> livros;
    private List<Cliente> clientes;
    private List<Funcionario> funcionarios;

    public ControleDeClientes() {
        this.livros = gArquivos.getLivros();
        this.clientes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public void incluirLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void incluirCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void incluirFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
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

    public Livro getLivroPorNome(String titulo) {
        for (Livro livro : livros) {
            if (livro.getNome().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public boolean gravarDados() {
        return gArquivos.gravar(livros, clientes, funcionarios);
    }

}
