package br.edu.up.models;

public class Cliente extends Pessoa {
    protected String telefone;
    protected String endereco;

    public Cliente(String nome, String cpf, String telefone, String endereco) {
        super(nome, cpf);
        this.telefone = telefone;
        this.endereco = endereco;
    }

    @Override
    public String toCSV() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toCSV'");
    }
}
