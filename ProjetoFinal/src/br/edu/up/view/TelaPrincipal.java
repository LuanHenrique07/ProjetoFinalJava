package br.edu.up.view;

import br.edu.up.models.*;
import br.edu.up.Prompt;

public class TelaPrincipal {

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
