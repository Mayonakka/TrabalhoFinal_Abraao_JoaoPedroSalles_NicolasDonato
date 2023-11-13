package userinterface;

import java.util.Scanner;
import lists.ListaAluno;
import lists.ListaProfessor;

public class Menu {

    public static int menuPrincipal(Scanner input){
        Options.mostrarMenuPrincipal();
        return Integer.parseInt(input.nextLine());
    }

    public static void opcao1(Scanner input, ListaAluno listaAluno, ListaProfessor listaProfessor){
        boolean exit = true;
        do{
            Options.mostrarGestaoUsuarios();
            switch (Integer.parseInt(input.nextLine())) {
                case 1:
                    Options.createUser();
                    int op = Integer.parseInt(input.nextLine());
                    if(op==1)
                        UserInteraction.registerStudent(input, listaAluno);
                    else if (op==2)
                        UserInteraction.registerProfessor(input, listaProfessor);
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

    public static void opcao2(Scanner input){
       Options.mostrarGestaoTurmas();
        boolean exit = true;
        do{
            switch (input.nextInt()) {
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
            
                default:
                    break;
            }
        }while(exit);
    }

    public static void opcao3(Scanner input){
       Options.mostrarGestaoNotas();
        boolean exit = true;
        do{
            switch (input.nextInt()) {
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
            
                default:
                    break;
            }
        }while(exit);
    }

    public static void opcao4(Scanner input){
        Options.mostrarHistoricoEstudante();
    }

    
}
