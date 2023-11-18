package main;

import java.util.ArrayList;

public class Student extends Person {

    private ArrayList<Course> course = new ArrayList();

    public Student(String name, String cpf, int code) {
        super(name, cpf, code);
    }

    public ArrayList<Course> getCourse() {
        return course;
    }
    public void setCourse(ArrayList<Course> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return getCode() + "  |  " + getName() + "\n";
    }
}