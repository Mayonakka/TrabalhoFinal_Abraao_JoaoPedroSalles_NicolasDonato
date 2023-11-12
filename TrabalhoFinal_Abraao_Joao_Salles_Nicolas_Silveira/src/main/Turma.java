package main;

import java.util.ArrayList;

public class Turma {
    
    private String disciplina;
    private int numTurma;
    private String semAno;
    private Professor professor;
    private int tamanhoTurma;
    private ArrayList<Aluno> alunos = new ArrayList();

    public Turma(String disciplina, int numTurma, String semAno, Professor professor, int tamanhoTurma) {
        this.disciplina = disciplina;
        this.numTurma = numTurma;
        this.semAno = semAno;
        this.professor = professor;
        this.tamanhoTurma = tamanhoTurma;
    }

    public String getDisciplina() {
        return disciplina;
    }
    public int getNumTurma() {
        return numTurma;
    }
    public String getSemAno() {
        return semAno;
    }
    public Professor getProfessor() {
        return professor;
    }
    public int getTamanhoTurma() {
        return tamanhoTurma;
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public void setNumTurma(int numTurma) {
        this.numTurma = numTurma;
    }
    public void setSemAno(String semAno) {
        this.semAno = semAno;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public void setTamanhoTurma(int tamanhoTurma) {
        this.tamanhoTurma = tamanhoTurma;
    }
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Turma(String disciplina, int numTurma, String semAno, Professor professor, int tamanhoTurma,
            ArrayList<Aluno> alunos) {
        this.disciplina = disciplina;
        this.numTurma = numTurma;
        this.semAno = semAno;
        this.professor = professor;
        this.tamanhoTurma = tamanhoTurma;
        this.alunos = alunos;
    }
}