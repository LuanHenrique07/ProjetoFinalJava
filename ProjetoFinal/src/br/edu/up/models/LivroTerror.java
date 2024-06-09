package br.edu.up.models;

public class LivroTerror extends Livro {

    public LivroTerror(String nome, int id, String genero, int lancamento, String Autor) {
        super(id,nome, genero, lancamento, Autor);
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
