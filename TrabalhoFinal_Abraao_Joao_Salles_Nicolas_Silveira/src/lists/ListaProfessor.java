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

    public boolean createProfessor(String name, String cpf){
        try {
            int nextCodFuncionario = (listaProfessor.isEmpty()) ? 0001 : listaProfessor.getLast().getCodFuncionario() + 1;
            listaProfessor.add(new Professor(name, cpf, nextCodFuncionario));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
