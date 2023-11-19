package userinterface;

import java.util.Scanner;
import lists.StudentList;
import lists.ProfessorList;
import lists.SaveLoadList;
import lists.ClassroomList;

public class App {
    public static void main(String[] args) {

        ProfessorList pList = (ProfessorList) SaveLoadList.load("../files/professorList.dat");
        StudentList sList = (StudentList) SaveLoadList.load("../files/studentList.dat");
        ClassroomList crList = (ClassroomList) SaveLoadList.load("../files/classroomList.dat");
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

        SaveLoadList.save(pList, "../files/professorList.dat");
        SaveLoadList.save(sList, "../files/studentList.dat");
        SaveLoadList.save(crList, "../files/classroomList.dat");
        
        input.close();
    }
}
