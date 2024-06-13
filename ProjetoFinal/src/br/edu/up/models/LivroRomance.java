package br.edu.up.models;

public class LivroRomance extends Livro {

    public LivroRomance(String nome, int id, String genero, int lancamento, String Autor) {
        super(id, nome, genero, lancamento, Autor);
    }

    @Override
    public String toCSV() {
        return Id + ";" + Nome + ";" + Genero + ";" + Lancamento + ";" + Autor;
    }

}
