package userinterface;

import java.util.Scanner;

public class Menu {

    public static int menuPrincipal(Scanner input){
        Options.mostrarMenuPrincipal();
        return input.nextInt();
    }

    public static void opcao1(Scanner input){
        Options.mostrarGestaoUsuarios();
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
