package com.example.decimoterceiro;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String meses;
    private String salario;

    public Usuario() {
    }

    public Usuario(String meses, String salario) {
        this.meses = meses;
        this.salario = salario;
    }

    public String getMeses() {
        return meses;
    }

    public void setMeses(String meses) {
        this.meses = meses;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
