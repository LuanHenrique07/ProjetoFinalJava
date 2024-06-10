package br.edu.up.models;

public class LivroAcao extends Livro {

    public LivroAcao(String nome, int id, String genero, int lancamento, String Autor) {
        super(id,nome, genero, lancamento, Autor);
    }

    @Override
    public String toString() {
        return "Livro de Açao [Nome = " + Nome + ", Genero = " + Genero + ", Lançamento = " + Lancamento + ", Autor = "
                + Autor;
    }


    @Override
    public String toCSV() {
        return Nome + ";" + Genero + ";" + Lancamento + ";" + Autor;
    }


}
