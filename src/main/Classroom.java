package main;

import java.util.ArrayList;

public class Classroom {

    private String course;
    private int classroomCode;
    private String semesterYear;
    private Professor professor;
    private ArrayList<Student> students = new ArrayList();

    public Classroom(String course, String semesterYear, int classroomCode) {
        this.course = course;
        this.semesterYear = semesterYear;
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
    public ArrayList<Student> getStudents() {
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
    public boolean setProfessor(Professor professor) {
        this.professor = professor;
        return (this.professor == professor);
    }
    

    public boolean addUser(Student student) {
        return this.students.add(student);
    }
    public boolean removeUser(Student student) {
        return this.students.remove(student);
    }

    public String toStringStudents() {
        String s = toString();
        for (Student student : students) {
            s += student.toString() + "\n";
        }
        return s.toString();
    }

    @Override
    public String toString() {
        return classroomCode + " | " + semesterYear + " | Disciplina: " + course + " | Professor: " + professor.getName();
    }
}