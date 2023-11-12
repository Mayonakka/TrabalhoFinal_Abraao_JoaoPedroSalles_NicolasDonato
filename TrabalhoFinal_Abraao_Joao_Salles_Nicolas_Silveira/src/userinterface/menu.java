package userinterface;

import java.util.Scanner;

public class Menu {
    
    private Options options;

    public int escolhaMenuPrincipal(Scanner input){
        options.mostrarMenuPrincipal();
        return input.nextInt();
    }
}