package userinterface;

import java.util.Scanner;
import lists.StudentList;
import lists.ClassroomList;
import lists.ProfessorList;

public class Menu {

    public static int menuPrincipal(Scanner input) {
        return UI.mostrarMenuPrincipal(input);
    }

    public static void opcao1(Scanner input, StudentList studentList, ProfessorList professorList) {
        boolean exit = true;
        do {
            switch (UI.mostrarGestaoUsuarios(input)) {
                case 1:
                    System.out.println(UI.checkRegister(Options.registerUser(input, studentList, professorList)));
                    input.nextLine();
                    break;
                case 2:
                    System.out.println(UI.checkRegister(Options.unregisterUser(input, studentList, professorList)));
                    input.nextLine();
                    break;
                case 3:
                    UI.showUserList(studentList, input);
                    break;
                case 4:
                    UI.showUserList(professorList, input);
                    break;
                case 0:
                    exit = false;
                    break;
                default:
                    UI.invalidOption(input);
            }
        } while (exit);
    }

    public static void opcao2(Scanner input, ClassroomList classroomList) {
        boolean exit = true;
        do {
            switch (UI.mostrarGestaoTurmas(input)) {
                case 1:
                    System.out.println(UI.checkRegister(Options.registerClass(input, classroomList)));
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 0:
                    exit = false;
                    break;
                default:
                    UI.invalidOption(input);
            }
        } while (exit);
    }

    public static void opcao3(Scanner input) {
        boolean exit = true;
        do {
            switch (UI.mostrarGestaoNotas(input)) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 0:
                    exit = false;
                    break;
                default:
                    UI.invalidOption(input);
            }
        } while (exit);
    }

    public static void opcao4(Scanner input) {
    }
}
