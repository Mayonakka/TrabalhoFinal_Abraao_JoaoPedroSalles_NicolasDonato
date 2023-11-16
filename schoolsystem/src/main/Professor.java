package main;

import java.util.Arrays;

public class Professor extends Person {

    private int limit = 2;
    private Classroom[] turmas = new Classroom[limit];

    public Professor(String name, String cpf, int code) {
        super(name, cpf, code);
    }

    public int getLimit() {
        return limit;
    }
    public void setLimit(int limit) {
        this.limit = limit;
    }
    public Classroom[] getTurmas() {
        return turmas;
    }
    public void setTurmas(Classroom[] turmas) {
        this.turmas = turmas;
    }


    @Override
    public String toString() {
        return getCode() + "  |  " + getName();
    }
}