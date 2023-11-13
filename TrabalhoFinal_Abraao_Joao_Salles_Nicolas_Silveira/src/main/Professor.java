package main;

import java.util.Arrays;

public class Professor extends Pessoa{
    
    private int codFuncionario;
    private int limiteTurmas = 2;
    private Turma[] turmas = new Turma[limiteTurmas];

    
    public Professor(String name, String cpf, int codFuncionario) {
        super(name, cpf);
        this.codFuncionario = codFuncionario;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }
    public int getLimiteTurmas() {
        return limiteTurmas;
    }
    public Turma[] getTurmas() {
        return turmas;
    }
    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }
    public void setLimiteTurmas(int limiteTurmas) {
        this.limiteTurmas = limiteTurmas;
    }
    public void setTurmas(Turma[] turmas) {
        this.turmas = turmas;
    }

    @Override
    public String toString() {
        return codFuncionario + "  |  " + getName();
    }
}