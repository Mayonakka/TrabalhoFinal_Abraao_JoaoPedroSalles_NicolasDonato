package main;

import java.util.ArrayList;

public class Turma {
    
    private String course;
    private int numTurma;
    private String semAno;
    private Professor professor;
    private int tamanhoTurma;
    private ArrayList<Student> students = new ArrayList();

    public Turma(String course, int numTurma, String semAno, Professor professor, int tamanhoTurma) {
        this.course = course;
        this.numTurma = numTurma;
        this.semAno = semAno;
        this.professor = professor;
        this.tamanhoTurma = tamanhoTurma;
    }

    public String getCourse() {
        return course;
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
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void setCourse(String course) {
        this.course = course;
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
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Turma(String course, int numTurma, String semAno, Professor professor, int tamanhoTurma,
            ArrayList<Student> students) {
        this.course = course;
        this.numTurma = numTurma;
        this.semAno = semAno;
        this.professor = professor;
        this.tamanhoTurma = tamanhoTurma;
        this.students = students;
    }
}