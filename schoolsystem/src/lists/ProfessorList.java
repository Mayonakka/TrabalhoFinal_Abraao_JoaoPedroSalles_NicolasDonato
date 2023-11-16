package lists;

import java.util.LinkedList;

import main.Person;
import main.Professor;
import userinterface.UI;

public class ProfessorList implements UserLists{

    private LinkedList<Person> professorList = new LinkedList();

    
    public LinkedList<Person> getProfessorList() {
        return professorList;
    }
    public void setProfessorList(LinkedList<Person> professorList) {
        this.professorList = professorList;
    }

    @Override
    public boolean createUser(String name, String cpf) {
        int nextProfessorCode = (professorList.isEmpty()) ? 10001 : professorList.getLast().getCode() + 1;
        return professorList.add(new Professor(name, cpf, nextProfessorCode));
    }

    @Override
    public boolean removeUser(int Code) {
        return professorList.removeIf(p -> p.getCode() == Code); 
    }

    @Override
    public String toStringList(int index) throws Exception{
        if(professorList.isEmpty())
            throw new Exception(UI.RED + "\nLista vazia" + UI.RESET);
        else if (index == professorList.size() -1)
            return professorList.getLast().toString();
        else 
            return professorList.get(index).toString() + "\n" + toStringList(++index);
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
}
