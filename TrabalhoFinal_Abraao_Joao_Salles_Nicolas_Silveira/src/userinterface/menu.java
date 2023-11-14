package userinterface;

import java.util.Scanner;
import lists.StudentList;
import lists.ProfessorList;

public class Menu {

    public static int menuPrincipal(Scanner in) {
        return UserInteraction.mostrarMenuPrincipal(in);
    }

    public static void opcao1(Scanner in, StudentList studentList, ProfessorList professorList){
        boolean exit = true;
        do {
            switch (UserInteraction.mostrarGestaoUsuarios(in)) {
                case 1:
                    Options.registerUser(in, studentList, professorList);
                    break;
                case 2:
                    Options.unregisterUser(in, studentList, professorList);
                    break;
                case 3:
                    Options.showUserList(studentList);
                    break;
                case 4:
                    Options.showUserList(professorList);
                    break;
                case 5:
                    exit = false;
                    break;
                default:
                    UserInteraction.invalidOption();
            }
        } while (exit);
    }

    public static void opcao2(Scanner in) {
        boolean exit = true;
        do {
            switch (UserInteraction.mostrarGestaoTurmas(in)) {
                case 1:
                    System.out.println("2");
                    break;
                case 2:
                    System.out.println("3");
                    break;
                case 3:
                    System.out.println("4");
                    break;
                case 4:
                    exit = false;
                    break;
                default:
                    UserInteraction.invalidOption();
            }
        } while (exit);
    }

    public static void opcao3(Scanner in) {
        boolean exit = true;
        do {
            switch (UserInteraction.mostrarGestaoNotas(in)) {
                case 1:
                    System.out.println("2");
                    break;
                case 2:
                    System.out.println("3");
                    break;
                case 3:
                    System.out.println("4");
                    break;
                case 4:
                    exit = false;
                    break;
                default:
                    UserInteraction.invalidOption();
            }
        } while (exit);
    }

    public static void opcao4(Scanner in) {
    }
}
