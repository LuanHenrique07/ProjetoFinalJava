package br.edu.up.models;

public class Livro {
    protected int Id;
    protected String Nome;
    protected String Genero;
    protected int Lancamento;
    protected String Autor;

    public Livro() {
    }

    public Livro(int id, String nome, String genero, int lancamento, String autor) {
        Id = id;
        Nome = nome;
        Genero = genero;
        Lancamento = lancamento;
        Autor = autor;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public int getLancamento() {
        return Lancamento;
    }

    public void setLancamento(int lancamento) {
        Lancamento = lancamento;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String toCSV() {
        return Id + ";" + Nome + ";" + Genero + ";" + Lancamento + ";" + Autor;
    }

    @Override
    public String toString() {
        return "Livro [Id = " + Id + ", Nome = " + Nome + ", Genero = " + Genero + ", Lancamento = " + Lancamento
                + ", Autor = " + Autor + "]";
    }
}
