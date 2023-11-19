package main;

public class Course {
    
    private String name;
    private Status status = Status.MATRICULADO;
    private float gradeA = 0;
    private float gradeB = 0;
    private float finalGrade = 0;
    
    public Course(String name) {
        this.name = name;
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
    public float getfinalGrade() {
        return finalGrade;
    }
    public void setName(String name) {
        this.name = name;
    }
   
    public boolean checkGrade(float x) {
        return (x >= 0 && x <= 10);
    }
   
    public boolean calcFinalGrade(float a, float b) throws Exception{
        if (checkGrade(a) && checkGrade(b)) {
            this.gradeA = a;
            this.gradeB = b;
            this.finalGrade = (a +(b*2))/3;
            this.status = finalGrade >= 6 ? Status.APROVADO : Status.REPROVADO;
            return true;
        } else {
            throw new Exception("\nValores de nota inválidos");
        }
    }

    @Override
    public String toString() {
        return name +" | A: "+ gradeA +" | B: "+ gradeB +" | Nota Final: "+ finalGrade +" | "+ status +"\n";
    }
}