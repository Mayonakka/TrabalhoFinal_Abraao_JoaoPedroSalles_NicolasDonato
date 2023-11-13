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

        boolean exit = true;
        do{
            switch (Menu.menuPrincipal(input)) {
                case 1:
                    Menu.opcao1(input);
                    break;
                case 2:
                    Menu.opcao2(input);
                    break;
                case 3:
                    Menu.opcao3(input);
                    break;
                case 4:
                    Menu.opcao4(input);
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
