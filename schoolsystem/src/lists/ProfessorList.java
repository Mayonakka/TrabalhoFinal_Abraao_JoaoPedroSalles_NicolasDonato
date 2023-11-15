package lists;

import java.util.LinkedList;
import main.Professor;
import userinterface.UI;

public class ProfessorList implements Lists{

    private LinkedList<Professor> professorList = new LinkedList();

    
    public LinkedList<Professor> getProfessorList() {
        return professorList;
    }
    public void setProfessorList(LinkedList<Professor> professorList) {
        this.professorList = professorList;
    }

    
    public boolean createUser(String name, String cpf) {
        int nextProfessorCode = (professorList.isEmpty()) ? 10001 : professorList.getLast().getProfessorCode() + 1;
        return professorList.add(new Professor(name, cpf, nextProfessorCode));
    }

    public boolean removeUser(int professorCode) {
        return professorList.removeIf(p -> p.getProfessorCode() == professorCode); 
    }

    public String getUserList(int index) throws Exception{
        if(professorList.isEmpty())
            throw new Exception(UI.RED + "\nLista vazia" + UI.RESET);
        else if (index == professorList.size() -1)
            return professorList.getLast().toString();
        else 
            return professorList.get(index).toString() + "\n" + getUserList(++index);
    }
}
