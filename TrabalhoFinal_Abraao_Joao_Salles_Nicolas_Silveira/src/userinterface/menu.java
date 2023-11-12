package userinterface;

import java.util.Scanner;

public class Menu {
    
    private Options options;

    public int menuPrincipal(Scanner input){
        options.mostrarMenuPrincipal();
        return input.nextInt();
    }

    public void opcao1(Scanner input){
        options.mostrarHistoricoEstudante();
    }

    public void opcao2(Scanner input){
        options.mostrarHistoricoEstudante();
    }

    public void opcao3(Scanner input){
        options.mostrarHistoricoEstudante();
    }

    public void opcao4(Scanner input){
        options.mostrarHistoricoEstudante();
    }
}
