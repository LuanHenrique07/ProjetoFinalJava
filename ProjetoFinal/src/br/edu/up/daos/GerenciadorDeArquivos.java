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

public class GerenciadorDeArquivos {

    private String header = "Nome;CPF;Telefone;Endereco"; // Defina seu cabeçalho CSV
    private String nomeDoArquivo = "C:\\Users\\autologon\\Desktop\\livros.csv";

    public List<Cliente> getClientes() {

        List<Cliente> listaDeClientes = new ArrayList<>();
        List<Funcionario> listaDeFuncionarios = new ArrayList<>();

        try {
            // LER UM ARQUIVO DE TEXTO
            File arquivoLeitura = new File(nomeDoArquivo);
            Scanner leitor = new Scanner(arquivoLeitura);

            // Armazeno cabeçalho
            if (leitor.hasNextLine()) {
                header = leitor.nextLine();
            }

            // Enquanto tiver linha no arquivo
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] dados = linha.split(";");

                if (dados.length == 4) {
                    // Cliente
                    String nome = dados[0];
                    String cpf = dados[1];
                    String telefone = dados[2];
                    String endereco = dados[3];

                    Cliente cliente = new Cliente(nome, cpf, telefone, endereco);
                    listaDeClientes.add(cliente);
                } else if (dados.length == 4) {
                    // Funcionario
                    String nome = dados[0];
                    String cpf = dados[1];
                    String telefone = dados[2];
                    String registro = dados[3];

                    Funcionario funcionario = new Funcionario(nome, cpf, telefone, registro);
                    listaDeFuncionarios.add(funcionario);
                }
            }

            leitor.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado! " + e.getMessage());
        }

        return listaDeClientes; // Ajuste conforme necessário
    }

    public boolean gravar(List<Cliente> clientes, List<Funcionario> funcionarios) {

        try {
            // GRAVAR UM ARQUIVO DE TEXTO
            FileWriter arquivoGravar = new FileWriter(nomeDoArquivo);
            PrintWriter gravador = new PrintWriter(arquivoGravar);

            gravador.println(header);

            for (Cliente cliente : clientes) {
                gravador.println(cliente.toCSV());
            }

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
