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
    public boolean setProfessor(Professor professor) throws Exception{
        if(this.professor == null){
            this.professor = professor;
            return (this.professor == professor);
        }
        throw new Exception("Turma ja possui professor");
    }

    
    public boolean addUser(Student student) throws Exception {
        if(!students.contains(student))
            return this.students.add(student);
        throw new Exception("\nAluno ja esta matriculado nesta disciplina");
    }

    public boolean removeUser(Student student) {
        return this.students.remove(student);
    }

    public Student searchStudent(int uCode) throws Exception{
        for (Student s : students)
            if (s.getCode() == uCode)
                return s;
        throw new Exception("Aluno nao encontrado");
    }

    // toString
    public String toStringStudents() {
        String s = toString() + "\n\n";
        for (Student student : students) {
            s += (student.toString());
        }
        return s;
    }

    public String toStringStudentsGrades() throws Exception {
        String s = toString() + "\n\n";
        for (Student student : students) {
            s += (student.toStringGrade(getCourse()));
        }
        return s;
    }

    @Override
    public String toString() {
        String n = (professor == null) ? "-" : professor.getName();
        return classroomCode + " | " + semesterYear + " | " + course  + " | Professor " + n;
    }
}