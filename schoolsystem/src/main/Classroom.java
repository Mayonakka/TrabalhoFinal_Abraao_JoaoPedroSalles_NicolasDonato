package main;

import java.util.ArrayList;

public class Classroom {

    private String course;
    private int classroomCode;
    private String semesterYear;
    private Professor professor;
    private int classroomSize;
    private ArrayList<Person> students = new ArrayList();

    public Classroom(String course, String semesterYear, int classroomSize, int classroomCode) {
        this.course = course;
        this.semesterYear = semesterYear;
        this.classroomSize = classroomSize;
        this.classroomCode = classroomCode;
    }

    public String getCourse() {
        return course;
    }

    public int getClassroomCode() {
        return classroomCode;
    }

    public String getSemesterYear() {
        return semesterYear;
    }

    public Professor getProfessor() {
        return professor;
    }

    public int getClassroomSize() {
        return classroomSize;
    }

    public ArrayList<Person> getStudents() {
        return students;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setclassroomCode(int classroomCode) {
        this.classroomCode = classroomCode;
    }

    public void setsemesterYear(String semesterYear) {
        this.semesterYear = semesterYear;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setTamanhoTurma(int classroomSize) {
        this.classroomSize = classroomSize;
    }

    public boolean addUser(Person user) {
        return this.students.add(user);
    }

    public boolean removeUser(Person user) {
        return this.students.remove(user);
    }

    @Override
    public String toString() {
        return classroomCode + " | " + semesterYear + " | " + course;
    }

}