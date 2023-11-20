package userinterface;

import java.util.Scanner;

import datastructures.ClassroomList;
import datastructures.Lists;

public class UI {

    public final static String CLEAR = "\u001B[H\u001B[2J";
    public final static String RESET = "\u001B[0m";
    public final static String GREEN = "\u001B[32m";
    public final static String RED = "\u001B[31m";

    // Menus
    static int showMainMenu(Scanner input){
        System.out.println(CLEAR +"\n\n");
		System.out.println("+-------------------------------------------+");
		System.out.println("|               MENU PRINCIPAL              |");
		System.out.println("+-------------------------------------------+");
		System.out.println("| 1) - Gestao de usuarios                   |");
		System.out.println("| 2) - Gestao de Turmas                     |");
		System.out.println("| 3) - Gestao de Notas                      |");
		System.out.println("| 4) - Historico do Aluno                   |");
		System.out.println("| 0) - Sair                                 |");
		System.out.println("+-------------------------------------------+");

        return Integer.parseInt(input.nextLine());
    }

    static int showOption1(Scanner input){
        System.out.println(CLEAR +"\n\n");
		System.out.println("+-------------------------------------------+");
		System.out.println("|             GESTAO DE USUARIOS            |");
		System.out.println("+-------------------------------------------+");
		System.out.println("| 1) - Adicionar Usuario                    |");
		System.out.println("| 2) - Excluir Usuario                      |");
		System.out.println("| 3) - Lista de alunos                      |");
		System.out.println("| 4) - Lista de Professores                 |");
		System.out.println("| 0) - Voltar                               |");
		System.out.println("+-------------------------------------------+");

        return Integer.parseInt(input.nextLine());
    }

    static int showOption2(Scanner input){
        System.out.println(CLEAR +"\n\n");
		System.out.println("+-------------------------------------------+");
		System.out.println("|              GESTAO DE TURMAS             |");
		System.out.println("+-------------------------------------------+");
		System.out.println("| 1) - Adicionar nova Turma                 |");
		System.out.println("| 2) - Editar Turma                         |");
		System.out.println("| 3) - Lista de Turma                       |");
		System.out.println("| 4) - Consultar Turma                      |");
		System.out.println("| 0) - Voltar                               |");
		System.out.println("+-------------------------------------------+");

        return Integer.parseInt(input.nextLine());
    }
    
    static int showOption2_2(Scanner input){
        System.out.println(CLEAR +"\n\n");
		System.out.println("+-------------------------------------------+");
		System.out.println("|              EDITAR TURMAS                |");
		System.out.println("+-------------------------------------------+");
		System.out.println("| 1) - Adicionar Usuario                    |");
		System.out.println("| 2) - Removar Usuario                      |");
		System.out.println("| 3) - Excluir Usuario                      |");
		System.out.println("| 0) - Voltar                               |");
		System.out.println("+-------------------------------------------+");

        return Integer.parseInt(input.nextLine());
    }

    static int showOption3(Scanner input){
        System.out.println(CLEAR +"\n\n");
		System.out.println("+-------------------------------------------+");
		System.out.println("|             GESTAO DE NOTAS               |");
		System.out.println("+-------------------------------------------+");
		System.out.println("| 1) - Adicionar Notas                      |");
		System.out.println("| 2) - Boletim de Turma                     |");
		System.out.println("| 0) - Voltar                               |");
		System.out.println("+-------------------------------------------+");

        return Integer.parseInt(input.nextLine());
    }

    static void invalidOption(Scanner input) {
        formatPrint("Opcao invalida");
        input.nextLine();
    }

    // Questions
    static int professorOrStudent(Scanner input){
        System.out.println("\n[1]ALUNO [2]PROFESSOR: ");
        return Integer.parseInt(input.nextLine());
    }
    
    static String typeName(Scanner input){
        System.out.println("\nDigite o nome do Usuario: ");
        return input.nextLine();
    }

    static int typeCodeUser(Scanner input){
        System.out.println("\nDigite o Codigo do Usuario: ");
        return Integer.parseInt(input.nextLine());
    }

    static int typeCodeClass(Scanner input){
        System.out.println("\nDigite o numero da Turma: ");
        return Integer.parseInt(input.nextLine());
    }

    static String typeClassCourse(Scanner input){
        System.out.println("\nDigite a disciplina da Turma: ");
        return input.nextLine();
    }

    static String typeClassSemester(Scanner input){
        System.out.println("\nDigite o semestre da Turma: ");
        String semesterYear = input.nextLine();
        System.out.println("\nDigite o ano da Turma: ");
        semesterYear += "/" + input.nextLine();
        return semesterYear;
    }

    static float typeGradeA(Scanner input){
        System.out.println("\nDigite a Nota do Grau A: ");
        return Float.parseFloat(input.nextLine());
    }

    static float typeGradeB(Scanner input){
        System.out.println("\nDigite a Nota do Grau B: ");
        return Float.parseFloat(input.nextLine());
    }

    // Shows and Checks
    static void formatPrint(String s){
        System.out.println(RED + s + RESET);
    }

    static void showList(Lists l, Scanner input) throws Exception{
        System.out.println("\n" + l.toStringList() + "\n");
        
    }

    static void showClassroom(ClassroomList crList, Scanner input) throws Exception{
        System.out.println("\n" + crList.toStringClassroom(typeCodeClass(input)) + "\n");
        
    }
    
    static void showClassroomGrades(Scanner input, ClassroomList crList) throws Exception{
        System.out.print(crList.toStringClassroomGrades(typeCodeClass(input)));
        
    }
    
    static void check(boolean check){
        System.out.println(((check)? UI.GREEN + "\nConcluido com sucesso" + UI.RESET:"Tente novamente"));
    }
}