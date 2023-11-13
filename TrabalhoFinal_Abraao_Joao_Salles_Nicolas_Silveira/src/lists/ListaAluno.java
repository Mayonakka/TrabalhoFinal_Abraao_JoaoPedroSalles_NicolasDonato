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

    public void createStudent(String name, String cpf) {
        int nextMatricula = (listaAluno.isEmpty()) ? 0001 : listaAluno.getLast().getMatricula() + 1;
        listaAluno.add(new Aluno(name, cpf, nextMatricula));
    }

    public void removeStudent(int codeStudent) {
        listaAluno.removeIf(a -> a.getMatricula() == codeStudent);
    }

    @Override
    public String toString() {
        for (Aluno aluno : listaAluno) {
            return aluno.toString();
        }
        return null;
    }
}
