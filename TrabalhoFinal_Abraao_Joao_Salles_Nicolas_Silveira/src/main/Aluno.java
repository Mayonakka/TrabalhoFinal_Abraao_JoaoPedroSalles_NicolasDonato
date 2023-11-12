package main;

import java.util.ArrayList;

public class Aluno extends Pessoa{

    private int matricula;
    private ArrayList<Disciplina> disciplinas = new ArrayList();

    public Aluno(String name, String cpf, int matricula) {
        super(name, cpf);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", disciplinas=" + disciplinas + "]";
    }
}
