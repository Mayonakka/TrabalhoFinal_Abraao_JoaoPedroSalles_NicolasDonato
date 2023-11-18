package main;

public class Professor extends Person {

    public Professor(String name, String cpf, int code) {
        super(name, cpf, code);
    }

    @Override
    public String toString() {
        return getCode() +"  |  "+ getName() +"\n";
    }
}