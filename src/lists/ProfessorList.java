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
    public boolean createUser(String name, String cpf) {
        int nextProfessorCode = (professorList.isEmpty()) ? 101 : professorList.getLast().getCode() + 1;
        return professorList.add(new Professor(name, cpf, nextProfessorCode));
    }

    public boolean deleteUser(int uCode) {
        return professorList.removeIf(p -> p.getCode() == uCode); 
    }

    public Person searchInList(int uCode) throws Exception{
        for (Person person : professorList)
            if (person.getCode() == uCode)
                return person;
        throw new Exception("Professor nao encontrado");
    }

    public String toStringList(int i) throws Exception {
        String sb = UI.CLEAR
        +"+-------------------------------------------+"
		+"|            LISTA DE PROFESSORES           |"
		+"+-------------------------------------------+";

        if (!professorList.isEmpty())
            if(i == professorList.size() -1)
                return sb + (professorList.getLast().toString());
            else {
                return sb += professorList.get(i).toString() + toStringList(++i);
            }
        throw new Exception("\nLista vazia");
    }
}