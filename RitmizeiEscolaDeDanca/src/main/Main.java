package main;

import models.Aluno;
import Models.Professores.Professor;
import Models.Professores.ProfessorZouk;
import Models.Professores.ProfessorForro;
import Models.Professores.ProfessorSamba;
import Models.Professores.ProfessorBolero;
import Models.Professores.ProfessorDancaDeSalao;
import Models.Professores.ProfessorRitmosLatinos;
import models.Estilo;
import models.Horarios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Cadastrar professor");
            System.out.println("3 - Listar alunos cadastrados");
            System.out.println("4 - Listar professores cadastrados");
            System.out.println("5 - Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Nome do aluno: ");
                    String nomeAluno = scanner.nextLine();
                    System.out.print("Estilo de dança (Samba, Forro, Bolero, Zouk, Ritmos Latinos, Dança de Salão): ");
                    String estiloAluno = scanner.nextLine();
                    System.out.print("Horário (TARDE, NOITE): ");
                    String horarioAluno = scanner.nextLine();
                    Aluno aluno = new Aluno(nomeAluno, Estilo.valueOf(estiloAluno.toUpperCase()), Horarios.valueOf(horarioAluno.toUpperCase()));
                    System.out.println("Aluno matriculado: " + aluno);
                    break;

                case 2:
                    System.out.print("Nome do professor: ");
                    String nomeProfessor = scanner.nextLine();
                    System.out.print("Estilo de dança (Samba, Forro, Bolero, Zouk, Ritmos Latinos, Dança de Salão): ");
                    String estiloProfessor = scanner.nextLine();
                    System.out.print("Horário (TARDE, NOITE): ");
                    String horarioProfessor = scanner.nextLine();
                    Professor professor = null;
                    switch (Estilo.valueOf(estiloProfessor.toUpperCase())) {
                        case SAMBA:
                            professor = new ProfessorSamba(nomeProfessor, Horarios.valueOf(horarioProfessor.toUpperCase()));
                            break;
                        case FORRO:
                            professor = new ProfessorForro(nomeProfessor, Horarios.valueOf(horarioProfessor.toUpperCase()));
                            break;
                        case BOLERO:
                            professor = new ProfessorBolero(nomeProfessor, Horarios.valueOf(horarioProfessor.toUpperCase()));
                            break;
                        case ZOUK:
                            professor = new ProfessorZouk(nomeProfessor, Horarios.valueOf(horarioProfessor.toUpperCase()));
                            break;
                        case RITMOS_LATINOS:
                            professor = new ProfessorRitmosLatinos(nomeProfessor, Horarios.valueOf(horarioProfessor.toUpperCase()));
                            break;
                        case DANCA_DE_SALAO:
                            professor = new ProfessorDancaDeSalao(nomeProfessor);
                            break;
                    }
                    if (professor != null) {
                        Professor.adicionarProfessor(professor);
                        System.out.println("Professor " + professor + " cadastrado!");
                    }
                    break;

                case 3:
                    Aluno.listarAlunos();
                    break;

                case 4:
                    Professor.listarProfessores();
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
