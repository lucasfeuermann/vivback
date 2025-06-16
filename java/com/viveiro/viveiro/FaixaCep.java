package com.viveiro.viveiro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Faixa_CEP")
public class FaixaCep {

    @Id
    @Column(name = "estado") // se quiser manter como chave primária
    private String estado;

    private int cepInicial;
    private int cepFinal;

    public FaixaCep() {}

    public FaixaCep(String estado, int cepInicial, int cepFinal) {
        this.estado = estado;
        this.cepInicial = cepInicial;
        this.cepFinal = cepFinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCepInicial() {
        return cepInicial;
    }

    public void setCepInicial(int cepInicial) {
        this.cepInicial = cepInicial;
    }

    public int getCepFinal() {
        return cepFinal;
    }

    public void setCepFinal(int cepFinal) {
        this.cepFinal = cepFinal;
    }
}


