package br.edu.up.models;

public class Funcionario extends Pessoa {
    protected String Telefone;
    protected String Registro;

    public Funcionario(String nome, String cpf, String telefone, String registro) {
        super(nome, cpf);
        this.Telefone = telefone;
        this.Registro = registro;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getRegistro() {
        return Registro;
    }

    public void setRegistro(String registro) {
        Registro = registro;
    }

    @Override
    public String toString() {
        return "Funcionario [Nome = " + Nome + ", Telefone = " + Telefone + ", CPF = " + CPF + ", Registro = " + Registro + "]";
    }

    @Override
    public String toCSV() {
        return Nome + ";" + CPF + ";" + Telefone + ";" + Registro;
    }
}
