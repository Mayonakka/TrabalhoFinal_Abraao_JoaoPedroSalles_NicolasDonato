package lists;

import java.util.LinkedList;
import main.Aluno;

public class ListaAluno {

    private LinkedList<Aluno> listaAluno = new LinkedList();


    public LinkedList<Aluno> getListaAluno() {
        return listaAluno;
    }
    public void setListaAluno(LinkedList<Aluno> listaAluno) {
        this.listaAluno = listaAluno;
    }

    public boolean createStudent(String name, String cpf){
        try {
            int nextMatricula = (listaAluno.isEmpty()) ? 0001 : listaAluno.getLast().getMatricula() + 1;
            listaAluno.add(new Aluno(name, cpf, nextMatricula));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
