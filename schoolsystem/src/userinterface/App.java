package userinterface;

import java.util.Scanner;
import lists.StudentList;
import lists.ProfessorList;
import lists.ClassroomList;

public class App {
    public static void main(String[] args) {
        
        ProfessorList professorList = new ProfessorList();
            StudentList studentList = new StudentList();
              ClassroomList listaTurma = new ClassroomList();
                      Scanner input = new Scanner(System.in);

        boolean exit = true;
        do{
            switch (Menu.menuPrincipal(input)) {
                case 1:
                    Menu.opcao1(input, studentList, professorList);
                    break;
                case 2:
                    Menu.opcao2(input);
                    break;
                case 3:
                    Menu.opcao3(input);
                    break;
                case 4:
                    Menu.opcao4(input);
                    break;
                case 0:
                    exit = false;
                    break;
            
                default:
                    UI.invalidOption(input);
            }

        }while(exit);
    }
}
