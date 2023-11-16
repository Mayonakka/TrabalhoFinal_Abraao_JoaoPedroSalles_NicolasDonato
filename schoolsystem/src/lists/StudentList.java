package lists;

import java.util.LinkedList;

import main.Person;
import main.Student;
import userinterface.UI;

public class StudentList implements UserLists {

    private LinkedList<Person> studentList = new LinkedList();

    
    public LinkedList<Person> getStudenttList() {
        return studentList;
    }
    public void setStudentList(LinkedList<Person> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean createUser(String name, String cpf) {
        int nextStudentCode = (studentList.isEmpty()) ? 10001 : studentList.getLast().getCode() + 1;
        return studentList.add(new Student(name, cpf, nextStudentCode));
    }

    @Override
    public boolean removeUser(int codeUser) {
        return studentList.removeIf(a -> a.getCode() == codeUser);
    }

    @Override
    public String toStringList(int index) throws Exception {
        if(studentList.isEmpty())
            throw new Exception(UI.RED + "\nLista vazia" + UI.RESET);
        else if (index == studentList.size() -1)
            return studentList.getLast().toString();
        else 
            return studentList.get(index).toString() + "\n" + toStringList(++index);
    }

    @Override
    public Person searchList(int code) {
        for (Person person : studentList) {
            if (person.getCode() == code){
                return person;
            }
        }
        return null;
    }
}
