package main;
import java.util.LinkedList;

public class ListaAluno {

    private LinkedList<Aluno> listaAluno = new LinkedList();

    public LinkedList<Aluno> getListaAluno() {
        return listaAluno;
    }

    public void setListaAluno(LinkedList<Aluno> listaAluno) {
        this.listaAluno = listaAluno;
    }

}
