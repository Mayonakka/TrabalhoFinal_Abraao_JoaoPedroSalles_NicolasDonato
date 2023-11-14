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

    public void createProfessor(String name, String cpf) {
        int nextCodFuncionario = (listaProfessor.isEmpty()) ? 0001 : listaProfessor.getLast().getCodFuncionario() + 1;
        listaProfessor.add(new Professor(name, cpf, nextCodFuncionario));
    }

    public void removeProfessor(int codeProfessor) {
        listaProfessor.removeIf(p -> p.getCodFuncionario() == codeProfessor);
    }

    public String getProfessorList(int index) throws Exception{
        if(listaProfessor.isEmpty())
            throw new Exception("Lista vazia");
        else if (index == listaProfessor.size() -1)
            return listaProfessor.getLast().toString();
        else 
            return listaProfessor.get(index).toString() + "\n" + getProfessorList(index + 1);
    }
}
