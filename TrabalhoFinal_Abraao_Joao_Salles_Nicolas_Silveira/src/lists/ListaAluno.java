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

    public String getStudentList(int index) throws Exception {
        if(listaAluno.isEmpty())
            throw new Exception("Lista vazia");
        else if (index == listaAluno.size() -1)
            return listaAluno.getLast().toString();
        else 
            return listaAluno.get(index).toString() + "\n" + getStudentList(index + 1);
    }
}
