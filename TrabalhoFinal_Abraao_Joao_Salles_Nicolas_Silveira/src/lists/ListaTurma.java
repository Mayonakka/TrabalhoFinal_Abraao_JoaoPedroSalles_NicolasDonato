package lists;

import java.util.LinkedList;
import main.Turma;

public class ListaTurma {
 
    private LinkedList<Turma> listaTurma = new LinkedList();

    public LinkedList<Turma> getListaTurma() {
        return listaTurma;
    }

    public void setListaTurma(LinkedList<Turma> listaTurma) {
        this.listaTurma = listaTurma;
    }
}
