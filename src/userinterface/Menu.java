package userinterface;

import java.util.Scanner;
import lists.ClassroomList;
import lists.ProfessorList;
import lists.StudentList;


public class Menu {

    public static int mainMenu(Scanner input) {
        return UI.showMainMenu(input);
    }

    public static void option1(Scanner input, StudentList sList, ProfessorList pList) {
        boolean exit = true;
        do {
        switch (UI.showOption1(input)) {
            case 1:
                System.out.println(UI.check(Options.registerUser(input, sList, pList)));
                input.nextLine();
                break;
            case 2:
                System.out.println(UI.check(Options.unregisterUser(input, sList, pList)));
                input.nextLine();
                break;
            case 3:
                UI.showList(sList, input);
                break;
            case 4:
                UI.showList(pList, input);
                break;
            case 0:
                exit = false;
                break;
            default:
                UI.invalidOption(input);
                break;
            }
        } while (exit);
    }

    public static void option2(Scanner input, StudentList sList, ProfessorList pList, ClassroomList crList) {
        boolean exit = true;
        do {
        switch (UI.showOption2(input)) {
            case 1:
                System.out.println(UI.check(Options.registerClass(input, crList)));
                input.nextLine();
                break;
            case 2:
                option2_2(input, sList, pList, crList);
                break;
            case 3:
                UI.showList(crList,input);
                break;
            case 4:
                UI.showClassroom(crList, input);
                input.nextLine();
                break;
            case 0:
                exit = false;
                break;
            default:
                UI.invalidOption(input);
                break;
            }
        } while (exit);
    }

    public static void option2_2(Scanner input, StudentList sList, ProfessorList pList, ClassroomList crList ) {
        boolean exit = true;
        do{
        switch (UI.showOption2_2(input)) {
            case 1:
                System.out.println(UI.check(Options.addUserInClassroom(input, sList, pList, crList)));
                input.nextLine();
                break;
            case 2:
                System.out.println(UI.check(Options.removeUserInClassroom(input, sList, pList, crList)));
                input.nextLine();
                break;
            case 3:
                System.out.println(UI.check(Options.unregisterClass(input, crList)));
                input.nextLine();
                break;
            case 0:
                exit = false;
                break;
            default:
                UI.invalidOption(input);
                break;
            }
        }while(exit);
    }

    public static void option3(Scanner input) {
        boolean exit = true;
        do {
        switch (UI.showOption3(input)) {
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
                break;
            }
        } while (exit);
    }

    public static void option4(Scanner input, StudentList sList) {
        try {
            System.out.println(sList.showStudentRecord(UI.typeCodeUser(input)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            input.nextLine();
        }
    }
}
