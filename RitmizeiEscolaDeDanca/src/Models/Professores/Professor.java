package Models.Professores;

import java.util.ArrayList;
import java.util.List;

public abstract class Professor {
    private String nome;
    private models.Estilo estilo;
    private models.Horarios horario;

    private static List<Professor> listaProfessores = new ArrayList<>();

    public Professor(String nome, models.Estilo estilo, models.Horarios horario) {
        this.nome = nome;
        this.estilo = estilo;
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }

    public models.Estilo getEstilo() {
        return estilo;
    }

    public models.Horarios getHorario() {
        return horario;
    }

    public static void adicionarProfessor(Professor professor) {
        listaProfessores.add(professor);
    }

    public static void listarProfessores() {
        if (listaProfessores.isEmpty()) {
            System.out.println("Não existem professores cadastrados.");
        } else {
            System.out.println("Professores cadastrados:");
            for (Professor professor : listaProfessores) {
                System.out.println(professor);
            }
        }
    }

    @Override
    public String toString() {
        return "Professor: " + nome + " - " + estilo + " - " + horario;
    }
}
