package userinterface;

import lists.StudentList;

import java.util.Scanner;

import lists.Lists;
import lists.ProfessorList;

public class Options {

    static Lists checksCreation(int op, Lists studentList, Lists professorList) throws Exception{
        if(op == 1)
            return studentList; 
        else if (op == 2)
            return professorList;
        else
            throw new Exception("Opcao inválida");
    }
    
    static void registerUser(Scanner in, StudentList studentList, ProfessorList professorList) {
        try {
            checksCreation(UserInteraction.professorOrStudent(in), studentList, 
            professorList).createUser(UserInteraction.typeName(in), UserInteraction.typeCPF(in));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void unregisterUser() {

    }

    static void showUserList(Lists lists){
        try {
            System.out.println(lists.getUserList(0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}