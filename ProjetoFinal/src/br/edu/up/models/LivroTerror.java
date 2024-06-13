package br.edu.up.models;

public class LivroTerror extends Livro {

    public LivroTerror(String nome, int id, String genero, int lancamento, String autor) {
        super(id, nome, genero, lancamento, autor);
    }

    @Override
    public String toCSV() {
        return Id + ";" + Nome + ";" + Genero + ";" + Lancamento + ";" + Autor;
    }

}
