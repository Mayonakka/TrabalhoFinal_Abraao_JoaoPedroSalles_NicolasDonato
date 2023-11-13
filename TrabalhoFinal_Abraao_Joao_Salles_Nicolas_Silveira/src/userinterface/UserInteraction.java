package userinterface;

import java.util.Scanner;
import lists.ListaAluno;
import lists.ListaProfessor;

public class UserInteraction {

    public static boolean registerStudent(Scanner in, ListaAluno listaAluno){
        System.out.println("Digite o nome do ALUNO: ");
        String name = in.nextLine();
        System.out.println("Digite o CPF do ALUNO: ");
        String cpf = in.nextLine();
        return listaAluno.createStudent(name, cpf);
    }

    public static boolean registerProfessor(Scanner in, ListaProfessor listaProfessor){
        System.out.println("Digite o nome do PROFESSOR: ");
        String name = in.nextLine();
        System.out.println("Digite o CPF do PROFESSOR: ");
        String cpf = in.nextLine();
        return listaProfessor.createProfessor(name, cpf);
    }
}