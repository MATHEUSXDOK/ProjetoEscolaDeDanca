package Models.Professores;

public class ProfessorZouk extends Professor {

    public ProfessorZouk(String nome, models.Horarios horario) {
        super(nome, models.Estilo.ZOUK, horario);
    }

    @Override
    public String toString() {
        return "Professor: " + getNome() + " - " + getEstilo() + " - " + getHorario();
    }
}
