package br.edu.up.controller;

import java.util.List;
import java.util.ArrayList;

import br.edu.up.daos.GerenciadorDeArquivos;
import br.edu.up.models.Cliente;
import br.edu.up.models.Funcionario;

public class ControleDeClientes {

    private GerenciadorDeArquivos gArquivos = new GerenciadorDeArquivos();

    private List<Cliente> clientes;
    private List<Funcionario> funcionarios;

    public ControleDeClientes() {
        this.clientes = gArquivos.getClientes();
        this.funcionarios = new ArrayList<>(); // Inicializa a lista de funcionários
    }

    public void incluirCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void incluirFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public Cliente getClientePorCpf(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCPF().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    public Funcionario getFuncionarioPorCpf(String cpf) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCPF().equals(cpf)) {
                return funcionario;
            }
        }
        return null;
    }

    public boolean gravarDados() {
        return gArquivos.gravar(clientes, funcionarios);
    }

}
