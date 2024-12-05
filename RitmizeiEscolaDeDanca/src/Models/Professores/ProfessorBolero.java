package Models.Professores;

public class ProfessorBolero extends Professor {

    public ProfessorBolero(String nome, models.Horarios horario) {
        super(nome, models.Estilo.BOLERO, horario);
    }

    @Override
    public String toString() {
        return "Professor: " + getNome() + " - " + getEstilo() + " - " + getHorario();
    }
}
