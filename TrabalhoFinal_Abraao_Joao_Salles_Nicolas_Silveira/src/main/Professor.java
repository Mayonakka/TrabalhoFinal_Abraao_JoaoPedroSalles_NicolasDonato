package main;

public class Professor extends Pessoa{
    
    private int codFuncionario;
    private int limiteTurmas;
    private Turma[] turmas = new Turma[limiteTurmas];

    
    public Professor(String name, String cpf, String dataNasc, int codFuncionario, int limiteTurmas) {
        super(name, cpf, dataNasc);
        this.codFuncionario = codFuncionario;
        this.limiteTurmas = limiteTurmas;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }
    public int getLimiteTurmas() {
        return limiteTurmas;
    }
    public Turma[] getTurmas() {
        return turmas;
    }
    
    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }
    public void setLimiteTurmas(int limiteTurmas) {
        this.limiteTurmas = limiteTurmas;
    }
    public void setTurmas(Turma[] turmas) {
        this.turmas = turmas;
    }

}