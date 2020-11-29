package com.example.vision_2020.Clases;

public class Usuarios {
    private String codigoU, idU, passwordU;
    private int nivelU;
    public int incremento = 0;

    public String getCodigoU() {
        return codigoU;
    }
    public void setCodigoU(String codigoU) {
        this.codigoU = codigoU;
    }

    public String getIdU() {
        return idU;
    }
    public void setIdU(String idU) {
        this.idU = idU;
    }

    public String getPasswordU() {
        return passwordU;
    }
    public void setPasswordU(String passwordU) {
        this.passwordU = passwordU;
    }

    public int getNivelU() {
        return nivelU;
    }
    public void setNivelU(int nivelU) {
        this.nivelU = nivelU;
    }
}
