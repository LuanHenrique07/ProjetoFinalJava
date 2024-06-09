package br.edu.up.models;

public abstract class Livro {
    protected String Nome;
    protected int ID;
    protected String Genero;
    protected int Lancamento;
    protected String Autor;

    
    public Livro(String nome, String genero, int lancamento, String autor) {
        Nome = nome;
        Genero = genero;
        Lancamento = lancamento;
        Autor = autor;
    }


    public abstract String toCSV();
}
