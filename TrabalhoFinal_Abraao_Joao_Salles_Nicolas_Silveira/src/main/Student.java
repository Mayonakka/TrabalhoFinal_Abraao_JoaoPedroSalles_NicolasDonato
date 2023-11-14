package main;

import java.util.ArrayList;

public class Student extends Person{

    private int studentCode;
    private ArrayList<Course> course = new ArrayList();

    public Student(String name, String cpf, int codeStudent) {
        super(name, cpf);
        this.studentCode = studentCode;
    }

    public int getStudentCode() {
        return studentCode;
    }
    public ArrayList<Course> getCourse() {
        return course;
    }
    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }
    public void setCourse(ArrayList<Course> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return course + "  |  " + getName();
    }
}
