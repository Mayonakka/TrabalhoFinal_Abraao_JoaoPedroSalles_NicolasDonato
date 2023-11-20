package components;

import java.io.Serializable;
import java.text.DecimalFormat;

public class Course implements Serializable {

    private String name;
    private Status status = Status.MATRICULADO;
    private float gradeA, gradeB = 0;
    private float arithimeticAvarage, weightedAvarage;
    DecimalFormat d = new DecimalFormat("##.#");

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    

    public boolean checkGrade(float x) {
        return (x >= 0 && x <= 10);
    }

    public boolean calcFinalGrade(float a, float b) throws Exception {
        if (checkGrade(a) && checkGrade(b)) {
            this.gradeA = a;
            this.gradeB = b;
            this.weightedAvarage = (a + b * 2) / 3;
            this.arithimeticAvarage = (a + b)/2;
            this.status = weightedAvarage >= 7 ? Status.APROVADO : Status.REPROVADO;
            return true;
        } else {
            throw new Exception("\nValores de nota inválidos");
        }
    }

    @Override
    public String toString() {
        return name + " | A: " + gradeA + " | B: " + gradeB + " | MA: " + d.format(arithimeticAvarage) + " | MP: "
                + d.format(weightedAvarage) + " | " + status + "\n";
    }
}