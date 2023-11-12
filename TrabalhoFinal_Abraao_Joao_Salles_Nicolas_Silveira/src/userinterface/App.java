package userinterface;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        boolean exit = true;
        do{
        switch (menu.escolhaMenuPrincipal(input)) {
            case 1:{
                break;
            }
            case 2: {
            }
            default:
                break;
        }
        }while(exit);
    }
}
