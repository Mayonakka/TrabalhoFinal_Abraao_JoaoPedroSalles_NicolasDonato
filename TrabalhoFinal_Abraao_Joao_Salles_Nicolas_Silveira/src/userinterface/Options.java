package userinterface;

import java.util.Scanner;

public class Options {
    
    public static void mostrarMenuPrincipal(){
        System.out.println("MENU PRINCIPAL"
                        +  "\n1) Gestao de usuarios"
                        +  "\n2) Gestao de turmas"
                        +  "\n3) Gestao de Notas"
                        +  "\n4) Historico do estudante"
                        +  "\n5) Sair");
    }

    public static void mostrarGestaoUsuarios(){
        System.out.println("GESTAO DE USUARIOS"
                        +  "\n1) Adicionar novo usuario"
                        +  "\n2) Excluir usuario"
                        +  "\n3) Ver Alunos"
                        +  "\n4) Ver Professores"
                        +  "\n5) Voltar");
    }

    public static void mostrarGestaoTurmas(){
        System.out.println("GESTAO DE TURMAS"
                        +  "\n1) Adicionar nova Turma"
                        +  "\n2) Editar Turma"
                        +  "\n3) Ver Turmas"
                        +  "\n4) Voltar");
    }

    public static void mostrarGestaoNotas(){
        System.out.println("GESTAO DE NOTAS"
                        +  "\n1) Adicionar Notas"
                        +  "\n2) Adicionar Notas Recuperacao"
                        +  "\n3) Boletim Turma"
                        +  "\n4) Voltar");
    }

    public static void mostrarHistoricoEstudante(){
        System.out.println("HISTORICO DO ESTUDANTE"
                        +  "\nDigite o numero de MATRICULA do estudante: ");
    }
}
