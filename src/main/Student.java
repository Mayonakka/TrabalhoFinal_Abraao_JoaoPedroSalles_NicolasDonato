package main;

import java.util.LinkedList;

public class Student extends Person {

    private LinkedList<Course> courses = new LinkedList<Course>();

    public Student(String name, String cpf, int code) {
        super(name, cpf, code);
    }

    public LinkedList<Course> getCourse() {
        return courses;
    }
    public void setCourse(LinkedList<Course> course) {
        this.courses = course;
    }

    public boolean addNewCourse(Course course) throws Exception{
        if(!courses.contains(course))
            return courses.add(course);
        throw new Exception("Aluno ja matriculado nesta disciplina");
    }

    public boolean removeCourse(String n) throws Exception{
        return courses.removeIf(c -> c.getName() == n);
    }

    public String studentRecord(){
        String sr = toString() +"\n";
        for (Course course : courses) {
            sr += course.toString();
        }
        return sr;
    }

    @Override
    public String toString() {
        return getCode() + "  |  " + getName() + "\n";
    }
}