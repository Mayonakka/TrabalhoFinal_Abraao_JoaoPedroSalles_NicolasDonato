package lists;

import java.util.LinkedList;
import main.Person;
import main.Professor;
import userinterface.UI;

public class ProfessorList implements UserLists{

    private LinkedList<Professor> professorList = new LinkedList();

    public LinkedList<Professor> getProfessorList() {
        return professorList;
    }
    public void setProfessorList(LinkedList<Professor> pList) {
        this.professorList = pList;
    }
    

    @Override
    public boolean createUser(String name) {
        int nextProfessorCode = (professorList.isEmpty()) ? 1001 : professorList.getLast().getCode() + 1;
        return professorList.add(new Professor(name, nextProfessorCode));
    }

    public boolean deleteUser(int uCode) {
        return professorList.removeIf(p -> p.getCode() == uCode); 
    }

    public Person searchInList(int uCode) throws Exception{
        for (Person person : professorList)
            if (person.getCode() == uCode)
                return person;
        throw new Exception("\nProfessor nao encontrado");
    }

    public String toStringList() throws Exception{
        String sb = UI.CLEAR
        +"\n\n+-------------------------------------------+"
		  +"\n|            LISTA DE PROFESSORES           |"
		  +"\n+-------------------------------------------+\n";
          return sb + toStringList(0);
    }
    
    public String toStringList(int i) throws Exception {
        if (!professorList.isEmpty())
            if(i == professorList.size() -1)
                return (professorList.getLast().toString());
            else {
                return professorList.get(i).toString() + toStringList(++i);
            }
        throw new Exception("\nNao ha professores cadastrados");
    }
}