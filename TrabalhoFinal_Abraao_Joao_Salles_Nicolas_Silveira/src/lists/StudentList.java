package lists;

import java.util.LinkedList;
import main.Student;

public class StudentList {

    private LinkedList<Student> studentList = new LinkedList();

    public LinkedList<Student> getStudentList() {
        return studentList;
    }
    public void setStudentList(LinkedList<Student> studentList) {
        this.studentList = studentList;
    }

    public void createStudent(String name, String cpf) {
        int nextStudentCode = (studentList.isEmpty()) ? 0001 : studentList.getLast().getStudentCode() + 1;
        studentList.add(new Student(name, cpf, nextStudentCode));
    }
    public void removeStudent(int codeStudent) {
        studentList.removeIf(a -> a.getStudentCode() == codeStudent);
    }

    public String getStudentList(int index) throws Exception {
        if(studentList.isEmpty())
            throw new Exception("Lista vazia");
        else if (index == studentList.size() -1)
            return studentList.getLast().toString();
        else 
            return studentList.get(index).toString() + "\n" + getStudentList(index + 1);
    }
}
