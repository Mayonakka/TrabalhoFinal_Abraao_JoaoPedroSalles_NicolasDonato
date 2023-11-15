package userinterface;

import java.util.Scanner;

import lists.Lists;

public class UI {

    public final static String CLEAR = "\u001B[H\u001B[2J";
    public final static String RESET = "\u001B[0m";
    public final static String GREEN = "\u001B[32m";
      public final static String RED = "\u001B[31m";

    static int mostrarMenuPrincipal(Scanner input){
        System.out.println(CLEAR + "MENU PRINCIPAL"
                        +  "\n1) Gestao de usuarios"
                        +  "\n2) Gestao de turmas"
                        +  "\n3) Gestao de Notas"
                        +  "\n4) Historico do estudante"
                        +  "\n0) Sair");
        return Integer.parseInt(input.nextLine());
    }

    static int mostrarGestaoUsuarios(Scanner input){
        System.out.println(CLEAR + "GESTAO DE USUARIOS"
                        +  "\n1) Adicionar novo usuario"
                        +  "\n2) Excluir usuario"
                        +  "\n3) Ver Alunos"
                        +  "\n4) Ver Professores"
                        +  "\n0) Voltar");
        return Integer.parseInt(input.nextLine());
    }

    static int mostrarGestaoTurmas(Scanner input){
        System.out.println(CLEAR + "GESTAO DE TURMAS"
                        +  "\n1) Adicionar nova Turma"
                        +  "\n2) Editar Turma"
                        +  "\n3) Ver Turmas"
                        +  "\n0) Voltar");
        return Integer.parseInt(input.nextLine());
    }

    static int mostrarGestaoNotas(Scanner input){
        System.out.println(CLEAR + "GESTAO DE NOTAS"
                        +  "\n1) Adicionar Notas"
                        +  "\n2) Adicionar Notas Recuperacao"
                        +  "\n3) Boletim Turma"
                        +  "\n0) Voltar");
        return Integer.parseInt(input.nextLine());
    }

    static void invalidOption(Scanner input) {
        System.out.println(RED + "Opcao invalida" + RESET);
        input.nextLine();
    }

    static int professorOrStudent(Scanner input){
        System.out.println("\n[1]ALUNO ou [2]PROFESSOR: ");
        return Integer.parseInt(input.nextLine());
    }

    static String typeCPF(Scanner input){
        System.out.println("\nDigite o CPF do USUARIO: ");
        return input.nextLine();
    }

    static String typeName(Scanner input){
        System.out.println("\nDigite o nome do USUARIO: ");
        return input.nextLine();
    }

    static int typeCodeUser(Scanner input){
        System.out.println("\nDigite a MATRICULA ou o CODIGO de FUNCIONARIO: ");
        return Integer.parseInt(input.nextLine());
    }

    static void showUserList(Lists lists, Scanner input){
        try {
            System.out.println("\n" + lists.getUserList(0) + "\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            input.nextLine();
        }
    }
}