package components;

public enum Status {
    MATRICULADO, APROVADO, REPROVADO;

    public Status checkStatus(float x){
        return x >= 7 ? APROVADO : REPROVADO;
    }
}