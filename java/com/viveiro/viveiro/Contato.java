package com.viveiro.viveiro;

@Entity
public class Contato {
    @Id
    private Integer id;

    private String telefone;
    private String celular;

    @ManyToOne
    @JoinColumn(name = "codigo_area_id", nullable = false)
    private CodigoArea codigoArea;

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public CodigoArea getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(CodigoArea codigoArea) {
        this.codigoArea = codigoArea;
    }
}
