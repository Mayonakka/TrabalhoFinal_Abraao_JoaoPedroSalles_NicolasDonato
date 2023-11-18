package userinterface;

import java.util.Scanner;

import lists.ClassroomList;
import lists.Lists;

public class UI {

    public final static String CLEAR = "\u001B[H\u001B[2J";
    public final static String RESET = "\u001B[0m";
    public final static String GREEN = "\u001B[32m";
      public final static String RED = "\u001B[31m";

    // Menus
    static int showMainMenu(Scanner input){
        System.out.println(CLEAR + "MENU PRINCIPAL"
                        +  "\n1) Gestao de usuarios"
                        +  "\n2) Gestao de turmas"
                        +  "\n3) Gestao de Notas"
                        +  "\n4) Historico do estudante"
                        +  "\n0) Sair");
        return Integer.parseInt(input.nextLine());
    }

    static int showOption1(Scanner input){
        System.out.println(CLEAR + "GESTAO DE USUARIOS"
                        +  "\n1) Adicionar novo usuario"
                        +  "\n2) Excluir usuario"
                        +  "\n3) Ver Alunos"
                        +  "\n4) Ver Professores"
                        +  "\n0) Voltar");
        return Integer.parseInt(input.nextLine());
    }

    static int showOption2(Scanner input){
        System.out.println(CLEAR + "GESTAO DE TURMAS"
                        +  "\n1) Adicionar nova Turma"
                        +  "\n2) Edição Turma"
                        +  "\n3) Ver Lista de Turmas"
                        +  "\n4) Ver Turma"
                        +  "\n0) Voltar");
        return Integer.parseInt(input.nextLine());
    }
    
    static int showOption2_2(Scanner input){
        System.out.println(CLEAR + "EDIÇÃO DE TURMAS"
                        +  "\n1) Adicionar usuario"
                        +  "\n2) Remover usuario"
                        +  "\n3) Excluir Turma"
                        +  "\n0) Voltar");
        return Integer.parseInt(input.nextLine());
    }

    static int showOption3(Scanner input){
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

    // Questions
    static int professorOrStudent(Scanner input){
        System.out.println("\n[1]ALUNO ou [2]PROFESSOR: ");
        return Integer.parseInt(input.nextLine());
    }
    
    static String typeName(Scanner input){
        System.out.println("\nDigite o nome do USUARIO: ");
        return input.nextLine();
    }

    static String typeCPF(Scanner input){
        System.out.println("\nDigite o CPF do USUARIO: ");
        return input.nextLine();
    }

    static int typeCodeUser(Scanner input){
        System.out.println("\nDigite a MATRICULA ou o CODIGO de FUNCIONARIO: ");
        return Integer.parseInt(input.nextLine());
    }

    static int typeCodeClass(Scanner input){
        System.out.println("\nDigite o numero da TURMA: ");
        return Integer.parseInt(input.nextLine());
    }

    static String typeClassCourse(Scanner input){
        System.out.println("\nDigite a disciplina da TURMA: ");
        return input.nextLine();
    }

    static String typeClassSemester(Scanner input){
        System.out.println("\nDigite o semestre da TURMA: ");
        String semesterYear = input.nextLine();
        System.out.println("\nDigite o ano da TURMA: ");
        semesterYear += "/" + input.nextLine();
        return semesterYear;
    }

    // Shows and Checks
    static void showList(Lists l, Scanner input){
        try {
            System.out.println("\n" + l.toStringList(0) + "\n");
        } catch (Exception e) {
            System.out.println(RED + e.getMessage() + RESET);
        } finally {
            input.nextLine();
        }
    }

    static void showClassroom(ClassroomList crList, Scanner input){
        try {
            System.out.println("\n" + crList.toStringClassroom(typeCodeClass(input)) + "\n");
        } catch (Exception e) {
            System.out.println(RED + e.getMessage() + RESET);
        }
    }

    static String check(boolean check){
        return ((check)? UI.GREEN + "Concluido com sucesso" + UI.RESET:"Tente novamente");
    }
}