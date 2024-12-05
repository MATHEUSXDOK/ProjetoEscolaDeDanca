package Models.Professores;

public class ProfessorForro extends Professor {

    public ProfessorForro(String nome, models.Horarios horario) {
        super(nome, models.Estilo.FORRO, horario);
    }

    @Override
    public String toString() {
        return "Professor: " + getNome() + " - " + getEstilo() + " - " + getHorario();
    }
}
