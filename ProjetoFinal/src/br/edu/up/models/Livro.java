package br.edu.up.models;

public abstract class Livro {
    protected int Id;
    protected String Nome;
    protected String Genero;
    protected int Lancamento;
    protected String Autor;

    public Livro(int id, String nome, String genero, int lancamento, String autor) {
        Id = id;
        Nome = nome;
        Genero = genero;
        Lancamento = lancamento;
        Autor = autor;
    }

    public abstract String toCSV();

    @Override
    public String toString() {
        return "Livro [Id = " + Id + ", Nome = " + Nome + ", Genero = " + Genero + ", Lancamento = " + Lancamento
                + ", Autor = "
                + Autor + "]";
    }
}