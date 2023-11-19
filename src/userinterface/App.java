package userinterface;

import java.util.Scanner;
import lists.StudentList;
import lists.ProfessorList;
import lists.ClassroomList;

public class App {
    public static void main(String[] args) {

        ClassroomList crList = new ClassroomList();
        ProfessorList pList = new ProfessorList();
        StudentList sList = new StudentList();
        Scanner input = new Scanner(System.in);

        boolean exit = true;
        do {
            switch ((int) Menu.mainMenu(input)) {
                case 1:
                    Menu.option1(input, sList, pList);
                    break;
                case 2:
                    Menu.option2(input, sList, pList, crList);
                    break;
                case 3:
                    Menu.option3(input, crList);
                    break;
                case 4:
                    Menu.option4(input, sList);
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
}
