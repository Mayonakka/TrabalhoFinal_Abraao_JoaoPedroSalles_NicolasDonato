package userinterface;

import java.io.IOException;

import lists.ListaAluno;
import lists.ListaProfessor;

public class Options {
    
    public static void registerUser(String name, String cpf, int op, 
        ListaAluno listaAluno, ListaProfessor listaProfessor) throws Exception{
        if(op == 1)
            listaAluno.createStudent(name, cpf);
        else if (op == 2)
            listaProfessor.createProfessor(name, cpf);
        else
            throw new Exception("Aqui não palhaço");
    }

    public static void unregisterUser(int op,ListaAluno listaAluno, 
            ListaProfessor listaProfessor, int code) throws Exception{
        if(op == 1)
            listaAluno.removeStudent(code);
        else if (op == 2)
            listaProfessor.removeProfessor(code);
        else
            throw new Exception("Aqui não palhaço");
    }
}