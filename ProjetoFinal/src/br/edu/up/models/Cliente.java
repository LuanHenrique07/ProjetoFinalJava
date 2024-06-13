package br.edu.up.models;

public class Cliente extends Pessoa {
    protected String telefone;
    protected String endereco;

    public Cliente(String nome, String cpf, String telefone, String endereco) {
        super(nome, cpf);
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente [Nome = " + Nome + ", CPF = " + CPF + ", Telefone = " + telefone + ", Endereço = " + endereco + "]";
    }

    @Override
    public String toCSV() {
        return CPF + ";" + Nome + ";" + telefone + ";" + endereco;
    }
}
