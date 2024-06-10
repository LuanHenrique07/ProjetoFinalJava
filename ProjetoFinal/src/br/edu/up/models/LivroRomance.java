package br.edu.up.models;

public class LivroRomance extends Livro {

    public LivroRomance(String nome, int id, String genero, int lancamento, String Autor) {
        super(id,nome, genero, lancamento, Autor);
    }

    @Override
    public String toString() {
        return "Livro de Romance [nome=" + Nome + ", Genero=" + Genero + ", Lancamento=" + Lancamento + ", Autor="
                + Autor;
    }
    
    @Override
    public String toCSV() {
        return Nome + ";" + Genero + ";" + Lancamento + ";" + Autor;
    }

}
