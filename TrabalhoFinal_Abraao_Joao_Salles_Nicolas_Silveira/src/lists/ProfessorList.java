package lists;

import java.util.LinkedList;
import main.Professor;

public class ProfessorList implements Lists{

    private LinkedList<Professor> professorList = new LinkedList();

    public LinkedList<Professor> getProfessorList() {
        return professorList;
    }
    public void setProfessorList(LinkedList<Professor> professorList) {
        this.professorList = professorList;
    }


    public void createUser(String name, String cpf) {
        int nextProfessorCode = (professorList.isEmpty()) ? 0001 : professorList.getLast().getProfessorCode() + 1;
        professorList.add(new Professor(name, cpf, nextProfessorCode));
    }

    public void removeUser(int professorCode) {
        professorList.removeIf(p -> p.getProfessorCode() == professorCode);
    }

    public String getUserList(int index) throws Exception{
        if(professorList.isEmpty())
            throw new Exception("Lista vazia");
        else if (index == professorList.size() -1)
            return professorList.getLast().toString();
        else 
            return professorList.get(index).toString() + "\n" + getUserList(++index);
    }
}