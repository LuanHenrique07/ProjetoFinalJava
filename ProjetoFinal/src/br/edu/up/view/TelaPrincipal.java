package br.edu.up.view;

import java.util.List;

import br.edu.up.Prompt;
import br.edu.up.controller.ControleDeClasses;
import br.edu.up.models.Cliente;
import br.edu.up.models.Funcionario;
import br.edu.up.models.Livro;
import br.edu.up.models.LivroAcao;
import br.edu.up.models.LivroComedia;
import br.edu.up.models.LivroRomance;
import br.edu.up.models.LivroTerror;

public class TelaPrincipal {

    private ControleDeClasses controleDeClasses = new ControleDeClasses();

    public void mostrarMenuPrincipal() {
        int op = 0;

        do {
            Prompt.limparConsole();
            Prompt.separador();
            Prompt.imprimir("MENU PRINCIPAL");
            Prompt.separador();

            Prompt.imprimir("1. Incluir Livros");
            Prompt.imprimir("2. Listar Livros");
            Prompt.imprimir("3. Adicionar Cliente");
            Prompt.imprimir("4. Listar Clientes");
            Prompt.imprimir("5. Adicionar Funcionário");
            Prompt.imprimir("6. Listar Funcionários");
            Prompt.imprimir("7. Sair");

            op = Prompt.lerInteiro();

            switch (op) {
                case 1:
                    incluirLivro();
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    adicionarCliente();
                    break;
                case 4:
                    listarClientes();
                    break;
                case 5:
                    adicionarFuncionario();
                    break;
                case 6:
                    listarFuncionarios();
                    break;
            }

        } while (op != 7);

        Prompt.imprimir("Saindo...");
    }

    private void incluirLivro() {
        int opcao = 0;

        do {
            Prompt.limparConsole();
            Prompt.separador();
            Prompt.imprimir("INCLUIR LIVRO");
            Prompt.separador();

            Prompt.imprimir("Selecione o gênero do livro:");
            Prompt.imprimir("1. Ação");
            Prompt.imprimir("2. Comédia");
            Prompt.imprimir("3. Romance");
            Prompt.imprimir("4. Terror");
            Prompt.imprimir("5. Voltar");

            opcao = Prompt.lerInteiro();

            switch (opcao) {
                case 1:
                    incluirLivroAcao();
                    Prompt.imprimir("Livro de Ação incluído com sucesso!");
                    Prompt.pressionarEnter();
                    break;
                case 2:
                    incluirLivroComedia();
                    Prompt.imprimir("Livro de Comédia incluído com sucesso!");
                    Prompt.pressionarEnter();
                    break;
                case 3:
                    incluirLivroRomance();
                    Prompt.imprimir("Livro de Romance incluído com sucesso!");
                    Prompt.pressionarEnter();
                    break;
                case 4:
                    incluirLivroTerror();
                    Prompt.imprimir("Livro de Terror incluído com sucesso!");
                    Prompt.pressionarEnter();
                    break;
            }

        } while (opcao != 5);
    }

    private void incluirLivroAcao() {
        Prompt.limparConsole();
        Prompt.separador();
        Prompt.imprimir("INCLUIR LIVRO DE AÇÃO");
        Prompt.separador();

        int id = Prompt.lerInteiro("Digite o ID:");
        String nome = Prompt.lerLinha("Digite o nome do livro:");
        int lancamento = Prompt.lerInteiro("Digite o ano de lançamento:");
        String autor = Prompt.lerLinha("Digite o autor:");

        Livro livro = new LivroAcao(id, nome, "Ação", lancamento, autor);
        controleDeClasses.adicionarLivro(livro);
    }

    private void incluirLivroComedia() {
        Prompt.limparConsole();
        Prompt.separador();
        Prompt.imprimir("INCLUIR LIVRO DE COMÉDIA");
        Prompt.separador();

        int id = Prompt.lerInteiro("Digite o ID:");
        String nome = Prompt.lerLinha("Digite o nome do livro:");
        int lancamento = Prompt.lerInteiro("Digite o ano de lançamento:");
        String autor = Prompt.lerLinha("Digite o autor:");

        Livro livro = new LivroComedia(id, nome, "Comédia", lancamento, autor);
        controleDeClasses.adicionarLivro(livro);
    }

    private void incluirLivroRomance() {
        Prompt.limparConsole();
        Prompt.separador();
        Prompt.imprimir("INCLUIR LIVRO DE ROMANCE");
        Prompt.separador();

        int id = Prompt.lerInteiro("Digite o ID:");
        String nome = Prompt.lerLinha("Digite o nome do livro:");
        int lancamento = Prompt.lerInteiro("Digite o ano de lançamento:");
        String autor = Prompt.lerLinha("Digite o autor:");

        Livro livro = new LivroRomance(id, nome, "Romance", lancamento, autor);
        controleDeClasses.adicionarLivro(livro);
    }

    private void incluirLivroTerror() {
        Prompt.limparConsole();
        Prompt.separador();
        Prompt.imprimir("INCLUIR LIVRO DE TERROR");
        Prompt.separador();

        int id = Prompt.lerInteiro("Digite o ID:");
        String nome = Prompt.lerLinha("Digite o nome do livro:");
        int lancamento = Prompt.lerInteiro("Digite o ano de lançamento:");
        String autor = Prompt.lerLinha("Digite o autor:");

        Livro livro = new LivroTerror(id, nome, "Terror", lancamento, autor);
        controleDeClasses.adicionarLivro(livro);
    }

    private void adicionarCliente() {
        Prompt.limparConsole();
        Prompt.separador();
        Prompt.imprimir("ADICIONAR CLIENTE");
        Prompt.separador();

        String nome = Prompt.lerLinha("Digite o nome do cliente:");
        String cpf = Prompt.lerLinha("Digite o CPF do cliente:");
        String telefone = Prompt.lerLinha("Digite o telefone do cliente:");
        String endereco = Prompt.lerLinha("Digite o endereço do cliente:");

        Cliente cliente = new Cliente(nome, cpf, telefone, endereco);
        controleDeClasses.adicionarCliente(cliente);
    }

    private void adicionarFuncionario() {
        Prompt.limparConsole();
        Prompt.separador();
        Prompt.imprimir("ADICIONAR FUNCIONÁRIO");
        Prompt.separador();

        String nome = Prompt.lerLinha("Digite o nome do funcionário:");
        String cpf = Prompt.lerLinha("Digite o CPF do funcionário:");
        String telefone = Prompt.lerLinha("Digite o telefone do funcionário:");
        String registro = Prompt.lerLinha("Digite o registro do funcionário:");

        Funcionario funcionario = new Funcionario(nome, cpf, telefone, registro);
        controleDeClasses.adicionarFuncionario(funcionario);
    }

    private void listarLivros() {
        List<Livro> livros = controleDeClasses.getLivros();
        Prompt.limparConsole();
        Prompt.separador();
        Prompt.imprimir("LISTA DE LIVROS");
        Prompt.separador();
        for (Livro livro : livros) {
            Prompt.imprimir(livro.toString());
        }
        Prompt.pressionarEnter();
    }

    private void listarClientes() {
        List<Cliente> clientes = controleDeClasses.getClientes();
        Prompt.limparConsole();
        Prompt.separador();
        Prompt.imprimir("LISTA DE CLIENTES");
        Prompt.separador();
        for (Cliente cliente : clientes) {
            Prompt.imprimir(cliente.toString());
        }
        Prompt.pressionarEnter();
    }

    private void listarFuncionarios() {
        List<Funcionario> funcionarios = controleDeClasses.getFuncionarios();
        Prompt.limparConsole();
        Prompt.separador();
        Prompt.imprimir("LISTA DE FUNCIONÁRIOS");
        Prompt.separador();
        for (Funcionario funcionario : funcionarios) {
            Prompt.imprimir(funcionario.toString());
        }
        Prompt.pressionarEnter();
    }
}
