package userinterface;

import lists.StudentList;
import lists.ProfessorList;
import java.util.Scanner;

import lists.ClassroomList;
import lists.UserLists;

public class Options {

    static UserLists checksTypeUser(int op, UserLists sl, UserLists pl) throws Exception{
        if(op==1 || op==2){
            return (op==1)? sl : pl;
        } else {
            throw new Exception(UI.RED + "Opcao invalida" + UI.RESET);
        }
    }
    
    static boolean registerUser(Scanner input, StudentList sl, ProfessorList pl) {
        try {
            return checksTypeUser(UI.professorOrStudent(input), sl, pl).createUser(UI.typeName(input), UI.typeCPF(input));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    static boolean unregisterUser(Scanner input, StudentList sl, ProfessorList pl) {
        try {
            return checksTypeUser(UI.professorOrStudent(input), sl, pl).removeUser(UI.typeCodeUser(input));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    static boolean registerClass(Scanner input, ClassroomList classroomList){
        return classroomList.createClass(UI.typeClassCourse(input), UI.typeClassSemester(input), UI.typeClassSize(input));
    }
}
