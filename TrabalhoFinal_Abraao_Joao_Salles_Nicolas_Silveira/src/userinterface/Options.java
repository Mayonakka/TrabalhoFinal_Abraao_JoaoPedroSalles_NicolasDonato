package userinterface;

import lists.StudentList;
import lists.ProfessorList;
import java.util.Scanner;
import lists.Lists;

public class Options {

    static Lists checksTypeUser(int op, Lists sl, Lists pl) throws Exception{
        if(op == 1)
            return sl; 
        else if (op == 2)
            return pl;
        else
            throw new Exception("Opcao escolhida inválida");
    }
    
    static boolean registerUser(Scanner input, StudentList sl, ProfessorList pl) {
        try {
            Lists list = checksTypeUser(UI.professorOrStudent(input), sl, pl);
            return list.createUser(UI.typeName(input), UI.typeCPF(input));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    static String cadastroOk(Scanner input, StudentList sl, ProfessorList pl){
        return (registerUser(input, sl, pl))? "OK":"NOK";
    }

    static void unregisterUser(Scanner input, StudentList sl, ProfessorList pl) {
        try {
            checksTypeUser(UI.professorOrStudent(input), sl, pl).removeUser(UI.typeCodeUser(input));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}