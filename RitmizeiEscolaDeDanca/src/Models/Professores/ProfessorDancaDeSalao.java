package Models.Professores;

public class ProfessorDancaDeSalao extends Professor {

    public ProfessorDancaDeSalao(String nome) {
        super(nome, models.Estilo.DANCA_DE_SALAO, models.Horarios.TARDE);
    }

    @Override
    public String toString() {
        return "Professor: " + getNome() + " - " + getEstilo() + " - " + getHorario();
    }
}
