package userinterface;

import java.util.Scanner;
import datastructures.ClassroomList;
import datastructures.ProfessorList;
import datastructures.StudentList;
import storage.SaveLoad;

public class App {
    public static void main(String[] args) {

        StudentList sList = new StudentList();
        ProfessorList pList = new ProfessorList();
        ClassroomList crList = new ClassroomList();

        try {
            Object sLoaded = SaveLoad.load("src/storage/files/studentList.json");
            Object pLoaded = SaveLoad.load("src/storage/files/professorList.json");
            Object crLoaded = SaveLoad.load("src/storage/files/classroomList.json");

            if (sLoaded instanceof StudentList)
                sList = (StudentList) sLoaded;

            if (pLoaded instanceof ProfessorList)
                pList = (ProfessorList) pLoaded;

            if (crLoaded instanceof ClassroomList)
                crList = (ClassroomList) crLoaded;

        } catch (Exception e) {
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
            SaveLoad.save("src/storage/files/studentList.json", sList);
            SaveLoad.save("src/storage/files/professorList.json", pList);
            SaveLoad.save("src/storage/files/classroomList.json", crList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}