package models;

import application.Global;

public class Materia {

    private int idMateria;

    private String nomeMateria;

    private Cor corMateria;

    public Materia(String nomeMateria, Cor corMateria) {
        this.idMateria = Global.materias.size() + 1;
        this.nomeMateria = nomeMateria;
        this.corMateria = corMateria;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public Cor getCorMateria() {
        return corMateria;
    }

    public void setCorMateria(Cor corMateria) {
        this.corMateria = corMateria;
    }
}
