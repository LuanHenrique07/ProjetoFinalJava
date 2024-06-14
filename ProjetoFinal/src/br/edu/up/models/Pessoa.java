package br.edu.up.models;

public abstract class Pessoa {
    protected String Nome;
    protected String CPF;

    public Pessoa(String nome, String cpf) {
        Nome = nome;
        CPF = cpf;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cpf) {
        CPF = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa [Nome = " + Nome + ", CPF = " + CPF + "]";
    }

    public abstract String toCSV();
}
