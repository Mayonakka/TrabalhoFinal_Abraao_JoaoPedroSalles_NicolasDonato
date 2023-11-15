package lists;

import java.util.LinkedList;
import main.Student;
import userinterface.UI;

public class StudentList implements Lists {

    private LinkedList<Student> studentList = new LinkedList();

    
    public LinkedList<Student> getStudentList() {
        return studentList;
    }
    public void setStudentList(LinkedList<Student> studentList) {
        this.studentList = studentList;
    }


    public boolean createUser(String name, String cpf) {
        int nextStudentCode = (studentList.isEmpty()) ? 10001 : studentList.getLast().getStudentCode() + 1;
        return studentList.add(new Student(name, cpf, nextStudentCode));
    }

    public boolean removeUser(int codeStudent) {
        return studentList.removeIf(a -> a.getStudentCode() == codeStudent);
    }

    public String getUserList(int index) throws Exception {
        if(studentList.isEmpty())
            throw new Exception(UI.RED + "\nLista vazia" + UI.RESET);
        else if (index == studentList.size() -1)
            return studentList.getLast().toString();
        else 
            return studentList.get(index).toString() + "\n" + getUserList(++index);
    }
}
