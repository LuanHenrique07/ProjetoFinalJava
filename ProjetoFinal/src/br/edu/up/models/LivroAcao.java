package br.edu.up.models;

public class LivroAcao extends Livro {

    public LivroAcao(String nome, int iD, String genero, int lancamento, String Autor) {
        super(nome, genero, lancamento, Autor);
    }

    @Override
    public String toString() {
        return "LivroAcao [nome=" + Nome + ", Genero=" + Genero + ", Lancamento=" + Lancamento + ", Autor="
                + Autor;
    }


    @Override
    public String toCSV() {
        return Nome + ";" + Genero + ";" + Lancamento + ";" + Autor;
    }


}
