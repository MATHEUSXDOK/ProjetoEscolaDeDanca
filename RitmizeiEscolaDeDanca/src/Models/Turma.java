package models;

public class Turma {
    private Estilo estilo;
    private Horarios horario;

    public Turma(Estilo estilo, Horarios horario) {
        this.estilo = estilo;
        this.horario = horario;
    }

    @Override
    public String toString() {
        return estilo + " - " + horario;
    }
}
