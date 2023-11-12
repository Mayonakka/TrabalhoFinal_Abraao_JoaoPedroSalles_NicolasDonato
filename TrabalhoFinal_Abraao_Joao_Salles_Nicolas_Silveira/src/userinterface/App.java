package userinterface;

import java.util.Scanner;

import lists.ListaAluno;
import lists.ListaProfessor;
import lists.ListaTurma;

public class App {
    public static void main(String[] args) {
        
        ListaProfessor listaProfessor = new ListaProfessor();
                ListaAluno ListaAluno = new ListaAluno();
                ListaTurma listaTurma = new ListaTurma();
                        Scanner input = new Scanner(System.in);
                            Menu menu = new Menu();

        boolean exit = true;
        do{
            switch (menu.menuPrincipal(input)) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    exit = false;
                    break;
            
                default:
                    System.out.println("Opcao invalida");
                    break;
            }

        }while(exit);
    }
}
