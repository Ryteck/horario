package helpers;

import application.Global;
import models.Materia;

public class Authenticator {

    public boolean password(String password){
        if ("1234".equals(password)) return true;
        return false;
    }

    public boolean materias(Materia materia){

        for (int i = 0; i < Global.materias.size(); i++){
            if (Global.materias.get(i).getNomeMateria().equals(materia.getNomeMateria()) || Global.materias.get(i).getCorMateria() == materia.getCorMateria()){
                return false;
            }
        }
        return true;
    }
}
