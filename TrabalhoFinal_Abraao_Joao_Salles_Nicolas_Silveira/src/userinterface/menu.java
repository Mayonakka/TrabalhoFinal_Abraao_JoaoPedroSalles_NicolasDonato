package userinterface;

import java.util.Scanner;
import lists.ListaAluno;
import lists.ListaProfessor;

public class Menu {

    public static int menuPrincipal(Scanner in) {
        return UserInteraction.mostrarMenuPrincipal(in);
    }

    public static void opcao1(Scanner in, ListaAluno listaAluno, ListaProfessor listaProfessor){
        boolean exit = true;
        do{
            switch (UserInteraction.mostrarGestaoUsuarios(in)) {
                case 1:
                    UserInteraction.createUser(in, listaAluno, listaProfessor);
                    break;
                case 2:
                    System.out.println("3");
                    break;
                case 3:
                    System.out.println("4");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    exit = false;
                    break;
            
                default:
                    break;
            }
        }while(exit);
    }

    public static void opcao2(Scanner in) {
        boolean exit = true;
        do{
             switch (UserInteraction.mostrarGestaoTurmas(in)) {
                case 1:
                    System.out.println("2");
                    break;
                case 2:
                    System.out.println("3");
                    break;
                case 3:
                    System.out.println("4");
                    break;
                case 4:
                    exit = false;
                    break;
            }
        }while(exit);
    }  

    public static void opcao3(Scanner in){
        boolean exit = true;
        do{
             switch (UserInteraction.mostrarGestaoNotas(in)) {
                case 1:
                    System.out.println("2");
                    break;
                case 2:
                    System.out.println("3");
                    break;
                case 3:
                    System.out.println("4");
                    break;
                case 4:
                    exit = false;
                    break;
            }
        }while(exit);
    }  

    public static void opcao4(Scanner in){
        UserInteraction.mostrarHistoricoEstudante(in);
    }
}
