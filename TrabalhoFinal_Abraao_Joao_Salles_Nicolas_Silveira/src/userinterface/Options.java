package userinterface;

import java.util.Scanner;

public class Options {
    
    public void mostrarMenuPrincipal(){
        System.out.println("MENU PRINCIPAL"
                        +  "1) Gestao de usuarios"
                        +  "2) Gestao de turmas"
                        +  "3) Gestao de Notas"
                        +  "4) Historico do estudante"
                        +  "5) Sair");
    }

    public void mostrarGestaoUsuarios(){
        System.out.println("GESTAO DE USUARIOS"
                        +  "1) Adicionar novo usuario"
                        +  "2) Excluir usuario"
                        +  "3) Ver Alunos"
                        +  "4) Ver Professores"
                        +  "5) Voltar");
    }

    public void mostrarGestaoTurmas(){
        System.out.println("GESTAO DE TURMAS"
                        +  "1) Adicionar nova Turma"
                        +  "2) Editar Turma"
                        +  "3) Ver Turmas"
                        +  "5) Voltar");
    }

    public void mostrarGestaoNotas(){
        System.out.println("GESTAO DE NOTAS"
                        +  "1) Adicionar Notas"
                        +  "2) Adicionar Notas Recuperacao"
                        +  "3) Boletim Turma"
                        +  "5) Voltar");
    }

    public void mostrarHistoricoEstudante(){
        System.out.println("HISTORICO DO ESTUDANTE"
                        +  "Digite o numero de MATRICULA do estudante: ");
    }
}
