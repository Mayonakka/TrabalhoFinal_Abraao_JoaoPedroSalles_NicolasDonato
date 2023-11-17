package userinterface;

import java.util.Scanner;
import lists.ClassroomList;
import lists.ProfessorList;
import lists.StudentList;
import lists.UserLists;

public class Options {

    static UserLists checksTypeUser(int op, StudentList sList, ProfessorList pList) throws Exception{
        if(op==1 || op==2){
            return (op==1)? sList : pList;
        } else {
            throw new Exception(UI.RED + "Opcao invalida" + UI.RESET);
        }
    }
    
    static boolean registerUser(Scanner input, StudentList sList, ProfessorList pList) {
        try {
            return checksTypeUser(UI.professorOrStudent(input), sList, pList).createUser(UI.typeName(input), UI.typeCPF(input));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    static boolean unregisterUser(Scanner input, StudentList sList, ProfessorList pList) {
        try {
            return checksTypeUser(UI.professorOrStudent(input), sList, pList).removeUser(UI.typeCodeUser(input));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    static boolean registerClass(Scanner input, ClassroomList crList){
        return crList.createClass(UI.typeClassCourse(input), UI.typeClassSemester(input), UI.typeClassSize(input));
    }

    static boolean addUserInClassroom(Scanner input, StudentList sList, ProfessorList pList,  ClassroomList crList){
        try {
            return crList.addUserInClassroom((StudentList) checksTypeUser(UI.professorOrStudent(input), sList, pList), UI.typeCodeUser(input), UI.typeCodeClass(input));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
