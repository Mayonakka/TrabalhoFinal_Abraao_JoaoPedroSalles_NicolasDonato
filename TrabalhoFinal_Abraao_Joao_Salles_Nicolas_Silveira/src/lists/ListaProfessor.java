package lists;

import java.util.LinkedList;
import main.Professor;

public class ListaProfessor {

    private LinkedList<Professor> listaProfessor = new LinkedList();

    public LinkedList<Professor> getListaProfessor() {
        return listaProfessor;
    }

    public void setListaProfessor(LinkedList<Professor> listaProfessor) {
        this.listaProfessor = listaProfessor;
    }
}
