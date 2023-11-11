package main;

public abstract class Pessoa {

    private String name;
    private String cpf;
    private String dataNasc;

    public Pessoa(String name, String cpf, String dataNasc) {
        this.name = name;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }
    
    public String getName() {
        return name;
    }
    public String getCpf() {
        return cpf;
    }
    public String getDataNasc() {
        return dataNasc;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }    

}