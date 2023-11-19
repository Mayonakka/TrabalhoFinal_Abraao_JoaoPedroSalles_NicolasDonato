package main;

public class Course {
    
    private String name;
    private Status status;
    private float gradeA;
    private float gradeB;
    private float finalGrade;
    
    public Course(String name) {
        this.name = name;
        this.status = Status.MATRICULADO;
        this.gradeA = 0;
        this.gradeB = 0;
        this.finalGrade = 0;
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
   
    public boolean calcFinalGrade(float a, float b) throws Exception{
        if(checkGrade(a) && checkGrade(b)){
            this.gradeA = a;
            this.gradeB = b;
            this.finalGrade = (a + (b*2))/3;
            this.status = finalGrade >= 6 ? Status.APROVADO : Status.REPROVADO;
            return true;
        } else{
            throw new Exception("\nValores de nota invalidos");
        }
    }

    public boolean checkGrade(float x) {
        return (x <= 10 && x >= 0);
    }

    @Override
    public String toString() {
        return name +" | A: "+ gradeA +" | B: "+ gradeB +" | Nota Final: "+ finalGrade +" | "+ status +"\n";
    }
}