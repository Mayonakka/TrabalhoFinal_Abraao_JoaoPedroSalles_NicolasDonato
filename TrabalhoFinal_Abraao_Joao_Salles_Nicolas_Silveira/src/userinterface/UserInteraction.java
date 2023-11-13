package userinterface;

import java.util.Scanner;
import lists.ListaAluno;
import lists.ListaProfessor;

public class UserInteraction {

    public static int mostrarMenuPrincipal(Scanner in){
        System.out.println("MENU PRINCIPAL"
                        +  "\n1) Gestao de usuarios"
                        +  "\n2) Gestao de turmas"
                        +  "\n3) Gestao de Notas"
                        +  "\n4) Historico do estudante"
                        +  "\n5) Sair");
        return Integer.parseInt(in.nextLine());
    }

    public static int mostrarGestaoUsuarios(Scanner in){
        System.out.println("GESTAO DE USUARIOS"
                        +  "\n1) Adicionar novo usuario"
                        +  "\n2) Excluir usuario"
                        +  "\n3) Ver Alunos"
                        +  "\n4) Ver Professores"
                        +  "\n5) Voltar");
        return Integer.parseInt(in.nextLine());
    }

    public static int mostrarGestaoTurmas(Scanner in){
        System.out.println("GESTAO DE TURMAS"
                        +  "\n1) Adicionar nova Turma"
                        +  "\n2) Editar Turma"
                        +  "\n3) Ver Turmas"
                        +  "\n4) Voltar");
        return Integer.parseInt(in.nextLine());
    }

    public static int mostrarGestaoNotas(Scanner in){
        System.out.println("GESTAO DE NOTAS"
                        +  "\n1) Adicionar Notas"
                        +  "\n2) Adicionar Notas Recuperacao"
                        +  "\n3) Boletim Turma"
                        +  "\n4) Voltar");
        return Integer.parseInt(in.nextLine());
    }

    public static void mostrarHistoricoEstudante(Scanner in){
        System.out.println("HISTORICO DO ESTUDANTE"
                        +  "\nDigite o numero de MATRICULA do estudante: ");
    }

    public static void createUser(Scanner in, ListaAluno listaAluno, ListaProfessor listaProfessor){
        System.out.println("Digite o nome do USUARIO: ");
        String name = in.nextLine();
        System.out.println("Digite o CPF do USUARIO: ");
        String cpf = in.nextLine();
        System.out.println("\nDigite [1] para cadastrar ALUNO ou [2] para cadastrar PROFESSOR: ");
        int op = Integer.parseInt(in.nextLine());

        try{
            Options.registerUser(name, cpf, op, listaAluno, listaProfessor);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}