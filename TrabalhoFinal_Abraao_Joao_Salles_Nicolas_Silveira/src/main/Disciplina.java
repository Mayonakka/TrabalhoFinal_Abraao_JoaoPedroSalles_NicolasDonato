package main;

public class Disciplina {
    
    private String nome;
    private Status status;
    private float notaA;
    private float notaB;
    private float notaC;
    
    public Disciplina(String nome, Status status, float notaA, float notaB, float notaC) {
        this.nome = nome;
        this.status = status;
        this.notaA = notaA;
        this.notaB = notaB;
        this.notaC = notaC;
    }

    public String getNome() {
        return nome;
    }
    public Status getStatus() {
        return status;
    }
    public float getNotaA() {
        return notaA;
    }
    public float getNotaB() {
        return notaB;
    }
    public float getNotaC() {
        return notaC;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public void setNotaA(float notaA) {
        this.notaA = notaA;
    }
    public void setNotaB(float notaB) {
        this.notaB = notaB;
    }
    public void setNotaC(float notaC) {
        this.notaC = notaC;
    }

    @Override
    public String toString() {
        return "Disciplina [nome=" + nome + ", status=" + status + ", notaA=" + notaA + ", notaB=" + notaB + ", notaC="
                + notaC + "]";
    }
}