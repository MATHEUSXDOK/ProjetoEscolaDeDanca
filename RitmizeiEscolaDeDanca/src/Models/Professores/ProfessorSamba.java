package Models.Professores;

public class ProfessorSamba extends Professor {

    public ProfessorSamba(String nome, models.Horarios horario) {
        super(nome, models.Estilo.SAMBA, horario);
    }

    @Override
    public String toString() {
        return "Professor: " + getNome() + " - " + getEstilo() + " - " + getHorario();
    }
}
