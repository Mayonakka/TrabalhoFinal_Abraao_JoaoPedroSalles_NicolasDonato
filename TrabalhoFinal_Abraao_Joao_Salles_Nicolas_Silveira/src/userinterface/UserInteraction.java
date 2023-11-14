package userinterface;

import java.util.Scanner;

public class UserInteraction {

    static int mostrarMenuPrincipal(Scanner in){
        System.out.println("MENU PRINCIPAL"
                        +  "\n1) Gestao de usuarios"
                        +  "\n2) Gestao de turmas"
                        +  "\n3) Gestao de Notas"
                        +  "\n4) Historico do estudante"
                        +  "\n5) Sair");
        return Integer.parseInt(in.nextLine());
    }

    static int mostrarGestaoUsuarios(Scanner in){
        System.out.println("GESTAO DE USUARIOS"
                        +  "\n1) Adicionar novo usuario"
                        +  "\n2) Excluir usuario"
                        +  "\n3) Ver Alunos"
                        +  "\n4) Ver Professores"
                        +  "\n5) Voltar");
        return Integer.parseInt(in.nextLine());
    }

    static int mostrarGestaoTurmas(Scanner in){
        System.out.println("GESTAO DE TURMAS"
                        +  "\n1) Adicionar nova Turma"
                        +  "\n2) Editar Turma"
                        +  "\n3) Ver Turmas"
                        +  "\n4) Voltar");
        return Integer.parseInt(in.nextLine());
    }

    static int mostrarGestaoNotas(Scanner in){
        System.out.println("GESTAO DE NOTAS"
                        +  "\n1) Adicionar Notas"
                        +  "\n2) Adicionar Notas Recuperacao"
                        +  "\n3) Boletim Turma"
                        +  "\n4) Voltar");
        return Integer.parseInt(in.nextLine());
    }

    static void invalidOption() {
        System.out.println("Opcao invalida");
    }

    static int professorOrStudent(Scanner in){
        System.out.println("\n[1]ALUNO ou [2]PROFESSOR: ");
        return Integer.parseInt(in.nextLine());
    }

    static String typeCPF(Scanner in){
        System.out.println("Digite o CPF do USUARIO: ");
        return in.nextLine();
    }

    static String typeName(Scanner in){
        System.out.println("Digite o nome do USUARIO: ");
        return in.nextLine();
    }

    static int typeCodeUser(Scanner in){
        System.out.println("\nDigite a MATRICULA ou o CODIGO de FUNCIONARIO: ");
        return Integer.parseInt(in.nextLine());
    }

}