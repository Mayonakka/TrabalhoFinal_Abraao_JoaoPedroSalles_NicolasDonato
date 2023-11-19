package main;

public class Course {
    
    private String name;
    private Status status;
    private float gradeA;
    private float gradeB;
    private float gradeC;
    
    public Course(String name) {
        this.name = name;
        this.status = Status.MATRICULADO;
        this.gradeA = 0;
        this.gradeB = 0;
        this.gradeC = 0;
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

    
    public void courseStatus(float finalGrade){
        this.status = finalGrade >= 6 ? Status.APROVADO : Status.REPROVADO;
    }

    @Override
    public String toString() {
        return "Disciplina: "+ name +" | "+ status +" | A: "+ gradeA +" | B: "+ gradeB +" | C: "+ gradeC +"\n";
    }

    
}