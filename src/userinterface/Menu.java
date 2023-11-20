package userinterface;

import java.util.Scanner;
import datastructures.ClassroomList;
import datastructures.ProfessorList;
import datastructures.StudentList;

public class Menu {

    public static int mainMenu(Scanner input) {
        try {
            return UI.showMainMenu(input);
        } catch (Exception e) {
            UI.formatPrint(e.getMessage());
        }
        return 99;
    }

    public static void option1(Scanner input, StudentList sList, ProfessorList pList) {
        boolean exit = true;
        do {
            try {
                switch (UI.showOption1(input)) {
                    case 1:
                        UI.check(Options.registerUser(input, sList, pList));
                        input.nextLine();
                        break;
                    case 2:
                        UI.check(Options.unregisterUser(input, sList, pList));
                        input.nextLine();
                        break;
                    case 3:
                        UI.showList(sList, input);
                        input.nextLine();
                        break;
                    case 4:
                        UI.showList(pList, input);
                        input.nextLine();
                        break;
                    case 0:
                        exit = false;
                        break;
                    default:
                        UI.invalidOption(input);
                        break;
                }
            } catch (Exception e) {
                UI.formatPrint(e.getMessage());
                input.nextLine();
            }
        } while (exit);
    }

    public static void option2(Scanner input, StudentList sList, ProfessorList pList, ClassroomList crList) {
        boolean exit = true;
        do {
            try {

                switch (UI.showOption2(input)) {
                    case 1:
                        UI.check(Options.registerClass(input, crList));
                        input.nextLine();
                        break;
                    case 2:
                        option2_2(input, sList, pList, crList);
                        break;
                    case 3:
                        UI.showList(crList, input);
                        input.nextLine();
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
            } catch (Exception e) {
                UI.formatPrint(e.getMessage());
                input.nextLine();
            }
        } while (exit);
    }

    public static void option2_2(Scanner input, StudentList sList, ProfessorList pList, ClassroomList crList) {
        boolean exit = true;
        do {
            try {
                switch (UI.showOption2_2(input)) {
                    case 1:
                        UI.check(Options.addUserInClassroom(input, sList, pList, crList));
                        input.nextLine();
                        break;
                    case 2:
                        UI.check(Options.removeUserInClassroom(input, sList, pList, crList));
                        input.nextLine();
                        break;
                    case 3:
                        UI.check(Options.unregisterClass(input, crList));
                        input.nextLine();
                        break;
                    case 0:
                        exit = false;
                        break;
                    default:
                        UI.invalidOption(input);
                        break;
                }
            } catch (Exception e) {
                UI.formatPrint(e.getMessage());
                input.nextLine();
            }
        } while (exit);
    }

    public static void option3(Scanner input, ClassroomList crList) {
        boolean exit = true;
        do {
            try {
                switch (UI.showOption3(input)) {
                    case 1:
                        UI.check(Options.addGrade(input, crList));
                        input.nextLine();
                        break;
                    case 2:
                        UI.showClassroomGrades(input, crList);
                        input.nextLine();
                        break;
                    case 0:
                        exit = false;
                        break;
                    default:
                        UI.invalidOption(input);
                        break;
                }
            } catch (Exception e) {
                UI.formatPrint(e.getMessage());
                input.nextLine();
            }
        } while (exit);
    }

    public static void option4(Scanner input, StudentList sList) {
        try {
            System.out.println(sList.toStringStudentRecord(UI.typeCodeUser(input)));
        } catch (Exception e) {
            UI.formatPrint(e.getMessage());
        } finally {
            input.nextLine();
        }
    }
}
