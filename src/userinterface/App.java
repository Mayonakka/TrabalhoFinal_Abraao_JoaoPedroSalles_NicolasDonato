package userinterface;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import lists.StudentList;
import lists.ProfessorList;
import lists.SaveLoad;
import lists.ClassroomList;

public class App {
    public static void main(String[] args) {

        File crFile = new File("src/files/classroomList.json");
        File sFile = new File("src/files/studentList.json");
        File pFile = new File("src/files/professorList.json");

        StudentList sList = new StudentList();
        ProfessorList pList = new ProfessorList();
        ClassroomList crList = new ClassroomList();

        try {
            sList = (StudentList) SaveLoad.load(sFile);
            pList = (ProfessorList) SaveLoad.load(pFile);
            crList = (ClassroomList) SaveLoad.load(crFile);
        } catch (ClassNotFoundException | IOException e) {
            UI.formatPrint(e.getMessage());
        }

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
        input.close();

        try {
            SaveLoad.save(sFile, sList);
            SaveLoad.save(pFile, pList);
            SaveLoad.save(crFile, crList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}