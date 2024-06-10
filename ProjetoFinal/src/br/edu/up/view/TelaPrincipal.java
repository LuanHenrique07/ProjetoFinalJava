package br.edu.up.view;

import br.edu.up.Prompt;
import br.edu.up.models.*;

public class TelaPrincipal {

    public void mostrarMenuPrincipal() {
        int op = 0;

        do {
            Prompt.limparConsole();
            Prompt.separador();
            Prompt.imprimir("MENU PRINCIPAL");
            Prompt.separador();

            Prompt.imprimir("1. Incluir Livros");
            Prompt.imprimir("2. Listar Livros");
            Prompt.imprimir("3. Sair");

            op = Prompt.lerInteiro();

            switch (op) {
                case 1:
                    incluirLivro();
                    Prompt.imprimir("Livro incluído com sucesso!");
                    break;
                case 2:
                    listarLivros();
                    break;
            }

        } while (op != 3);

        Prompt.imprimir("Saindo...");
    }

    private void listarLivros() {
        // TODO Auto-generated method stub
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
                    break;
                case 2:
                    incluirLivroComedia();
                    break;
                case 3:
                    incluirLivroRomance();
                    break;
                case 4:
                    incluirLivroTerror();
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
        String genero = "Ação";
        int lancamento = Prompt.lerInteiro("Digite o ano de lançamento:");
        String autor = Prompt.lerLinha("Digite o autor:");

        Livro livro = new LivroAcao(nome, id, genero, lancamento, autor);
        // Adicionar livro à lista de livros (você precisa implementar essa lógica)
    }

    private void incluirLivroComedia() {
        Prompt.limparConsole();
        Prompt.separador();
        Prompt.imprimir("INCLUIR LIVRO DE COMÉDIA");
        Prompt.separador();

        int id = Prompt.lerInteiro("Digite o ID:");
        String nome = Prompt.lerLinha("Digite o nome do livro:");
        String genero = "Comédia";
        int lancamento = Prompt.lerInteiro("Digite o ano de lançamento:");
        String autor = Prompt.lerLinha("Digite o autor:");

        Livro livro = new LivroComedia(nome, id, genero, lancamento, autor);
        // Adicionar livro à lista de livros (você precisa implementar essa lógica)
    }

    private void incluirLivroRomance() {
        Prompt.limparConsole();
        Prompt.separador();
        Prompt.imprimir("INCLUIR LIVRO DE ROMANCE");
        Prompt.separador();

        int id = Prompt.lerInteiro("Digite o ID:");
        String nome = Prompt.lerLinha("Digite o nome do livro:");
        String genero = "Romance";
        int lancamento = Prompt.lerInteiro("Digite o ano de lançamento:");
        String autor = Prompt.lerLinha("Digite o autor:");

        Livro livro = new LivroRomance(nome, id, genero, lancamento, autor);
        // Adicionar livro à lista de livros (você precisa implementar essa lógica)
    }

    private void incluirLivroTerror() {
        Prompt.limparConsole();
        Prompt.separador();
        Prompt.imprimir("INCLUIR LIVRO DE TERROR");
        Prompt.separador();

        int id = Prompt.lerInteiro("Digite o ID:");
        String nome = Prompt.lerLinha("Digite o nome do livro:");
        String genero = "Terror";
        int lancamento = Prompt.lerInteiro("Digite o ano de lançamento:");
        String autor = Prompt.lerLinha("Digite o autor:");

        Livro livro = new LivroTerror(nome, id, genero, lancamento, autor);
        // Adicionar livro
    }
}