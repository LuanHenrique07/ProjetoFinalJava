package br.edu.up.view;

import br.edu.up.models.*;

import java.util.List;

import br.edu.up.Prompt;

public class TelaPrincipal {

    public void mostrarMenuPrincipal() {

        int op = 0;

        do {

            Prompt.limparConsole();
            Prompt.separador();
            Prompt.imprimir("MENU PRINCIPAL");
            Prompt.separador();

            Prompt.imprimir("1. Incluir LIVROS");
            Prompt.imprimir("2. Incluir cliente empresa");
            Prompt.imprimir("3. Mostrar dados cliente pessoa");
            Prompt.imprimir("4. Mostrar dados cliente empresa");
            Prompt.imprimir("5. Mostrar todos os clientes");
            Prompt.imprimir("6. Emprestar");
            Prompt.imprimir("7. Devolver");
            Prompt.imprimir("8. Sair");

            op = Prompt.lerInteiro();

            switch (op) {
                case 1:
                    IncluirLivros();
                    break;
            }
            //     case 3:
                    
            //     case 5:
            //         // 5. Mostrar todos os clientes
            //         Prompt.separador();
            //         Prompt.imprimir("LISTA DE CLIENTES");
            //         List<Cliente> clientes = controle.getClientes();
            //         for (Cliente cliente : clientes) {
            //             Prompt.imprimir(cliente);
            //         }
            //         Prompt.pressionarEnter();
            //         break;
            //     case 6:
            //         // 6. Emprestar
            //         menuEmprestar();
            //         break;
            // }

            } while (op != 8);

    }

    private void IncluirLivros(){
        int op1 = 0;

        Prompt.imprimir("1. Incluir Livro de Ação");
            Prompt.imprimir("2. Incluir Livro de Comédia");
            Prompt.imprimir("3. Incluir Livro de Romance");
            Prompt.imprimir("4. Incluir Livro de Terror");
            

            op1 = Prompt.lerInteiro();

        switch (op1) {
            case 1:
                IncluirLivrosAcao();
                break;
            case 2:
                IncluirLivrosComedia();
                break;
            case 3:
                IncluirLivrosRomance();
                break;
            case 4:
                IncluirLivrosTerror();
                break;
        }
    }


    private void IncluirLivrosTerror() {

        Prompt.separador();
        Prompt.imprimir("MENU INCLUIR LIVRO TERROR");
        Prompt.separador();

        Prompt.imprimir("Digite o ID:");
        int ID = Prompt.lerInteiro();

        Prompt.imprimir("Digite o nome do livro;");
        String Nome = Prompt.lerLinha();

        Prompt.imprimir("Digite o genero:");
        String Genero = Prompt.lerLinha();

        Prompt.imprimir("Digite o Lancamento:");
        int Lancamento = Prompt.lerInteiro();

        Prompt.imprimir("Digite o Autor:");
        String Autor = Prompt.lerLinha();

        Livro livro = new LivroTerror(Nome, ID, Genero, Lancamento, Autor);
    }

    private void IncluirLivrosAcao() {

        Prompt.separador();
        Prompt.imprimir("MENU INCLUIR LIVRO ACAO");
        Prompt.separador();

        Prompt.imprimir("Digite o ID:");
        int ID = Prompt.lerInteiro();

        Prompt.imprimir("Digite o nome do livro;");
        String Nome = Prompt.lerLinha();

        Prompt.imprimir("Digite o genero:");
        String Genero = Prompt.lerLinha();

        Prompt.imprimir("Digite o Lancamento:");
        int Lancamento = Prompt.lerInteiro();

        Prompt.imprimir("Digite o Autor:");
        String Autor = Prompt.lerLinha();

        Livro livro = new LivroAcao(Nome, ID, Genero, Lancamento, Autor);
    }

    private void IncluirLivrosComedia() {

        Prompt.separador();
        Prompt.imprimir("MENU INCLUIR LIVRO COMEDIA");
        Prompt.separador();

        Prompt.imprimir("Digite o ID:");
        int ID = Prompt.lerInteiro();

        Prompt.imprimir("Digite o nome do livro;");
        String Nome = Prompt.lerLinha();

        Prompt.imprimir("Digite o genero:");
        String Genero = Prompt.lerLinha();

        Prompt.imprimir("Digite o Lancamento:");
        int Lancamento = Prompt.lerInteiro();

        Prompt.imprimir("Digite o Autor:");
        String Autor = Prompt.lerLinha();

        Livro livro = new LivroComedia(Nome, ID, Genero, Lancamento, Autor);
    }

    private void IncluirLivrosRomance() {

        Prompt.separador();
        Prompt.imprimir("MENU INCLUIR LIVRO ROMANCE");
        Prompt.separador();

        Prompt.imprimir("Digite o ID:");
        int ID = Prompt.lerInteiro();

        Prompt.imprimir("Digite o nome do livro;");
        String Nome = Prompt.lerLinha();

        Prompt.imprimir("Digite o genero:");
        String Genero = Prompt.lerLinha();

        Prompt.imprimir("Digite o Lancamento:");
        int Lancamento = Prompt.lerInteiro();

        Prompt.imprimir("Digite o Autor:");
        String Autor = Prompt.lerLinha();

        Livro livro = new LivroRomance(Nome, ID, Genero, Lancamento, Autor);
    }
}
