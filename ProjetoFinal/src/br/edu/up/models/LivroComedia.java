package br.edu.up.models;

import java.sql.Date;

public class LivroComedia extends Livro {

    public LivroComedia(String nome, int iD, String genero, Date lancamento) {
        super(nome, iD, genero, lancamento);
    }

    @Override
    public String toCSV() {
        throw new UnsupportedOperationException("Unimplemented method 'toCSV'");
    }

}
