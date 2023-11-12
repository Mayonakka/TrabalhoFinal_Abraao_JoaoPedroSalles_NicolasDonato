package userinterface;

import java.util.Scanner;

public class Options {
    
    public void mostrarMenuPrincipal(){
        System.out.println("MENU PRINCIPAL"
                        +  "1) Gestao de usuarios"
                        +  "2) Gestao de turmas"
                        +  "3) Gestao de Notas"
                        +  "4) Historico do estudante"
                        +  "5) Sair");
    }

    public void mostrarOpcao_1(){ // Opcao 1 gestao de usuarios
        System.out.println("GESTAO DE USUARIOS"
                        +  "1) Adicionar novo usuario"
                        +  "2) Editar usuario"
                        +  "3) Ver Alunos"
                        +  "4) Ver Professores");
    }

    public void mostrarOpcao_2(){ // Opcao 2 gestao de turmas
        System.out.println("GESTAO DE TURMAS"
                        +  "1) Adicionar nova Turma"
                        +  "2) Editar Turma"
                        +  "3) Ver Turmas");
    }

    public void mostrarOpcao_3(){ // Opcao 3 gestao de nota
        System.out.println("GESTAO DE NOTAS"
                        +  "1) Adicionar Notas"
                        +  "2) Adicionar Notas Recuperacao"
                        +  "3) Boletim Turma");
    }

    public void mostrarOpcao_4(){ // Opcao 4 historico do estudante
        System.out.println("HISTORICO DO ESTUDANTE"
                        +  "Digite o numero de MATRICULA do estudante: ");
    }
}
