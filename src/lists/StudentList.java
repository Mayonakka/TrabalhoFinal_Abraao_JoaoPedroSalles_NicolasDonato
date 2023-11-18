package lists;

import java.util.LinkedList;
import main.Person;
import main.Student;

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

    public boolean deleteUser(int uCode) {
        return studentList.removeIf(a -> a.getCode() == uCode);
    }
    
    public Person searchInList(int uCode) throws Exception{
        for (Person person : studentList)
            if (person.getCode() == uCode)
                return person;
        throw new Exception("Aluno nao encontrado");
    }

    public String showStudentRecord(int uCode) throws Exception{
        Student s = (Student) searchInList(uCode);
        return s.studentRecord();
    }

    public String toStringList(int i) throws Exception {
        if(studentList.isEmpty())
            throw new Exception("\nLista vazia");
        else if (i == studentList.size() -1)
            return studentList.getLast().toString();
        else 
            return studentList.get(i).toString() + toStringList(++i);
    }
}