package main;

import java.util.Arrays;

public class Professor extends Person{
    
    private int professorCode;
    private int limit = 2;
    private Classroom[] turmas = new Classroom[limit];

    
    public Professor(String name, String cpf, int professorCode) {
        super(name, cpf);
        this.professorCode = professorCode;
    }

    public int getProfessorCode() {
        return professorCode;
    }
    public int getLimit() {
        return limit;
    }
    public Classroom[] getTurmas() {
        return turmas;
    }
    public void setProfessorCode(int professorCode) {
        this.professorCode = professorCode;
    }
    public void setLimit(int limit) {
        this.limit = limit;
    }
    public void setTurmas(Classroom[] turmas) {
        this.turmas = turmas;
    }

    @Override
    public String toString() {
        return professorCode + "  |  " + getName();
    }
}