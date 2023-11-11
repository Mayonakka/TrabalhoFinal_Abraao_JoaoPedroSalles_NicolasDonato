package main;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    private int matricula;
    private ArrayList<Disciplina> disciplinas = new ArrayList();

    public Aluno(String name, String cpf, String dataNasc, int matricula) {
        super(name, cpf, dataNasc);
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

    public void setDisciplinas(Disciplina disciplina) throws RuntimeException {
        if (disciplinas.contains(disciplina)) {
            throw new RuntimeException("Disciplina já existente");
        } else {
            disciplinas.add(disciplina);
        }
    }
       
}
