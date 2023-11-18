package lists;

import java.util.LinkedList;
import main.Person;
import main.Professor;

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

    public String toStringList(int i) throws Exception{
        if(professorList.isEmpty())
            throw new Exception("\nLista vazia");
        else if (i == professorList.size() -1)
            return professorList.getLast().toString();
        else 
            return professorList.get(i).toString() + toStringList(++i);
    }
}