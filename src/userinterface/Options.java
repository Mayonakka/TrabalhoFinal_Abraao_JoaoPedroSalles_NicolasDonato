package userinterface;

import java.util.Scanner;
import lists.ClassroomList;
import lists.ProfessorList;
import lists.StudentList;
import lists.UserLists;

public class Options {

    static UserLists checksTypeUser(int op, StudentList sList, ProfessorList pList) throws Exception{
        if(op==1 || op==2)
            return (op==1)? sList : pList;
        throw new Exception("\nOpcao invalida");
    }
    
    static boolean registerUser(Scanner input, StudentList sList, ProfessorList pList) throws Exception{
        return checksTypeUser(UI.professorOrStudent(input), sList, pList).createUser(UI.typeName(input));
        
    }
    
    static boolean unregisterUser(Scanner input, StudentList sList, ProfessorList pList) throws Exception{
        return checksTypeUser(UI.professorOrStudent(input), sList, pList).deleteUser(UI.typeCodeUser(input));

    }

    static boolean registerClass(Scanner input, ClassroomList crList){
        return crList.createClass(UI.typeClassCourse(input), UI.typeClassSemester(input));
    }

    static boolean unregisterClass(Scanner input, ClassroomList crList){
        return crList.deleteClass(UI.typeCodeClass(input));
    }

    static boolean addUserInClassroom(Scanner input, StudentList sList, ProfessorList pList,  ClassroomList crList) throws Exception{
        UserLists ul = checksTypeUser(UI.professorOrStudent(input), sList, pList);
        int codeUser = UI.typeCodeUser(input);
        int codeClass = UI.typeCodeClass(input);

        if(ul instanceof StudentList)
            return crList.addStudentInClassroom(sList, codeUser, codeClass);
        return crList.addProfessorInClassroom(pList, codeUser, codeClass);
       
    }

    static boolean removeUserInClassroom(Scanner input, StudentList sList, ProfessorList pList,  ClassroomList crList) throws Exception {
        UserLists ul = checksTypeUser(UI.professorOrStudent(input), sList, pList);
        int codeUser = UI.typeCodeUser(input);
        int codeClass = UI.typeCodeClass(input);

        if(ul instanceof StudentList)
            return crList.removeStudentInClassroom(sList, codeUser, codeClass);
            return crList.removeProfessorInClassroom(pList, codeClass);
    }

    static boolean addGrade(Scanner input, ClassroomList crList) throws Exception{
        return crList.addGrade(UI.typeCodeClass(input), UI.typeCodeUser(input), UI.typeGradeA(input), UI.typeGradeB(input));
    }
}
