package lists;

import java.util.LinkedList;
import main.Person;
import main.Student;
import userinterface.UI;

public class StudentList implements UserLists {

    private LinkedList<Student> studentList = new LinkedList();

    
    public LinkedList<Student> getStudenttList() {
        return studentList;
    }
    public void setStudentList(LinkedList<Student> studentList) {
        this.studentList = studentList;
    }

    
    @Override
    public boolean createUser(String name, String cpf) {
        int nextStudentCode = (studentList.isEmpty()) ? 1001 : studentList.getLast().getCode() + 1;
        return studentList.add(new Student(name, cpf, nextStudentCode));
    }

    @Override
    public boolean removeUser(int codeUser) {
        return studentList.removeIf(a -> a.getCode() == codeUser);
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

    @Override
    public String toStringList(int index) throws Exception {
        if(studentList.isEmpty())
            throw new Exception("\nLista vazia");
        else if (index == studentList.size() -1)
            return studentList.getLast().toString();
        else 
            return studentList.get(index).toString() + "\n" + toStringList(++index);
    }
}