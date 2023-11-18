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
    public void setProfessorList(LinkedList<Professor> professorList) {
        this.professorList = professorList;
    }
    

    @Override
    public boolean createUser(String name, String cpf) {
        int nextProfessorCode = (professorList.isEmpty()) ? 101 : professorList.getLast().getCode() + 1;
        return professorList.add(new Professor(name, cpf, nextProfessorCode));
    }

    @Override
    public boolean removeUser(int Code) {
        return professorList.removeIf(p -> p.getCode() == Code); 
    }

    @Override
    public Person searchList(int code) {
        for (Person person : professorList) {
            if (person.getCode() == code){
                return person;
            }
        }
        return null;
    }

    @Override
    public String toStringList(int index) throws Exception{
        if(professorList.isEmpty())
            throw new Exception("\nLista vazia");
        else if (index == professorList.size() -1)
            return professorList.getLast().toString();
        else 
            return professorList.get(index).toString() + "\n" + toStringList(++index);
    }
}