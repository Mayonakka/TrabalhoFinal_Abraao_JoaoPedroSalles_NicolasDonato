package userinterface;

import lists.StudentList;
import lists.ProfessorList;

public class Options {
    
    public static void registerUser(String name, String cpf, int op, 
        StudentList studentList, ProfessorList professorList) throws Exception{
        if(op == 1)
            studentList.createStudent(name, cpf);
        else if (op == 2)
            professorList.createProfessor(name, cpf);
        else
            throw new Exception("Não foi possivel REGISTRAR o USUARIO");
    }

    public static void unregisterUser(int op,StudentList sutudentList, 
            ProfessorList studentProfessor, int code) throws Exception{
        if(op == 1)
            sutudentList.removeStudent(code);
        else if (op == 2)
            studentProfessor.removeProfessor(code);
        else
            throw new Exception("Não foi possivel REMOVER o USUARIO");
    }
}