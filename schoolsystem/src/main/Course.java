package main;

public class Course {
    
    private String name;
    private Status status;
    private float gradeA;
    private float gradeB;
    private float gradeC;
    
    public Course(String name, Status status, float gradeA, float gradeB, float gradeC) {
        this.name = name;
        this.status = status;
        this.gradeA = gradeA;
        this.gradeB = gradeB;
        this.gradeC = gradeC;
    }

    public String getName() {
        return name;
    }
    public Status getStatus() {
        return status;
    }
    public float getGradeA() {
        return gradeA;
    }
    public float getGradeB() {
        return gradeB;
    }
    public float getGradeC() {
        return gradeC;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public void setGradeA(float gradeA) {
        this.gradeA = gradeA;
    }
    public void setGradeB(float gradeB) {
        this.gradeB = gradeB;
    }
    public void setGradeC(float gradeC) {
        this.gradeC = gradeC;
    }

    @Override
    public String toString() {
        return "Disciplina [nome=" + name + ", status=" + status + ", notaA=" + gradeA + ", notaB=" + gradeB + ", notaC="
                + gradeC + "]";
    }
}