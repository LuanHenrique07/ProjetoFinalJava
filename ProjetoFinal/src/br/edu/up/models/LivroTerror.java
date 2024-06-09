package br.edu.up.models;

import java.sql.Date;

public class LivroTerror extends Livro {

    public LivroTerror(String nome, int iD, String genero, Date lancamento, String Autor) {
        super(nome, genero, lancamento, Autor);

    }

    @Override
    public String toCSV() {
        throw new UnsupportedOperationException("Unimplemented method 'toCSV'");
    }

}
