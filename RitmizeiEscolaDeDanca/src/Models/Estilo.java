package models;

public enum Estilo {
    FORRO, SAMBA, BOLERO, ZOUK, RITMOS_LATINOS, DANCA_DE_SALAO;

    @Override
    public String toString() {
        return name().replace("_", " ").toUpperCase();
    }
}
