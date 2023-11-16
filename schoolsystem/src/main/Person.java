package main;

public class Person {

    private String name;
    private String cpf;
    private int code;

    public Person(String name, String cpf, int code) {
        this.name = name;
        this.cpf = cpf;
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
}