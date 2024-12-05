package models;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private static List<Aluno> alunosCadastrados = new ArrayList<>();
    private String nome;
    private Estilo estilo;
    private Horarios horario;

    public Aluno(String nome, Estilo estilo, Horarios horario) {
        this.nome = nome;
        this.estilo = estilo;
        this.horario = horario;
        alunosCadastrados.add(this);
    }

    public static void listarAlunos() {
        if (alunosCadastrados.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Alunos cadastrados:");
            for (Aluno aluno : alunosCadastrados) {
                System.out.println(aluno);
            }
        }
    }

    @Override
    public String toString() {
        return nome + " - " + estilo + " - " + horario;
    }
}
