package com.viveiro.viveiro;

    @Entity
public class Viveiro {
    private Integer id;

    private Double area;

    @ManyToOne
    @JoinColumn(name = "ciclo_id", nullable = false)
    private Ciclo ciclo;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Ciclo getCiclo() {
        return ciclo;
    }

    public void setCiclo(Ciclo ciclo) {
        this.ciclo = ciclo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    void setUsuario(Ciclo usuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

