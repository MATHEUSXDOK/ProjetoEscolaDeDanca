package Models.Professores;

public class ProfessorRitmosLatinos extends Professor {

    public ProfessorRitmosLatinos(String nome, models.Horarios horario) {
        super(nome, models.Estilo.RITMOS_LATINOS, horario);
    }

    @Override
    public String toString() {
        return "Professor: " + getNome() + " - " + getEstilo() + " - " + getHorario();
    }
}
