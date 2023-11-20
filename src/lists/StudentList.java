package lists;

import java.util.LinkedList;
import components.Person;
import components.Student;
import userinterface.UI;

public class StudentList implements UserLists{

    private LinkedList<Student> studentList;

    @Override
    public boolean createUser(String name) {
        int nextStudentCode = (studentList.isEmpty()) ? 1001 : studentList.getLast().getCode() + 1;
        return studentList.add(new Student(name, nextStudentCode));
    }

    public boolean deleteUser(int uCode) {
        return studentList.removeIf(a -> a.getCode() == uCode);
    }
    
    public Person searchInList(int uCode) throws Exception{
        for (Person person : studentList)
            if (person.getCode() == uCode)
                return person;
        throw new Exception("\nAluno nao encontrado");
    }

    // toStrings
    public String toStringStudentRecord(int uCode) throws Exception{
        Student s = (Student) searchInList(uCode);
        return s.toStringRecord();
    }
    
    public String toStringList() throws Exception{
        String sb = UI.CLEAR
        +"\n\n+-------------------------------------------+"
		  +"\n|              LISTA DE ALUNOS              |"
		  +"\n+-------------------------------------------+\n";
          return sb + toStringList(0);
    }
    
    public String toStringList(int i) throws Exception {
        if (!studentList.isEmpty())
            if(i == studentList.size() -1)
                return (studentList.getLast().toString());
            else {
                return studentList.get(i).toString() + toStringList(++i);
            }
        throw new Exception("\nNao ha alunos cadastrados");
    }
}