package main;
import java.util.LinkedList;

public class ListaTurma {
 
    private LinkedList<Turma> listaTurma = new LinkedList();

    public LinkedList<Turma> getListaTurma() {
        return listaTurma;
    }

    public void setListaTurma(LinkedList<Turma> listaTurma) {
        this.listaTurma = listaTurma;
    }

}
