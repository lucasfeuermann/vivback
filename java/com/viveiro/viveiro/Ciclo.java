package com.viveiro.viveiro;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;

    @Entity
public class Ciclo {
    

    private Integer id;

    private LocalDate dataInicio;
    private LocalDate dataFinal;
    private Integer populacaoInicial;
    private Integer populacaoFinal;
    private Double pesoMedio;
    private Integer producaoTotal;
    private Double taxaSobrevivencia;
    private BigDecimal produtividade;
    private Integer quantidade;

    @ManyToOne
    @JoinColumn(name = "laboratorio_id", nullable = false)
    private Laboratorio laboratorio;
    private String GenerationType;

    public Ciclo() {
    }

    public Ciclo(Object GenerationType) {
        this.GenerationType = (String) GenerationType;
    }

    public Ciclo(Integer id) {
        this.id = id;
    }

    public Ciclo(String GenerationType) {
        this.GenerationType = GenerationType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Integer getPopulacaoInicial() {
        return populacaoInicial;
    }

    public void setPopulacaoInicial(Integer populacaoInicial) {
        this.populacaoInicial = populacaoInicial;
    }

    public Integer getPopulacaoFinal() {
        return populacaoFinal;
    }

    public void setPopulacaoFinal(Integer populacaoFinal) {
        this.populacaoFinal = populacaoFinal;
    }

    public Double getPesoMedio() {
        return pesoMedio;
    }

    public void setPesoMedio(Double pesoMedio) {
        this.pesoMedio = pesoMedio;
    }

    public Integer getProducaoTotal() {
        return producaoTotal;
    }

    public void setProducaoTotal(Integer producaoTotal) {
        this.producaoTotal = producaoTotal;
    }

    public Double getTaxaSobrevivencia() {
        return taxaSobrevivencia;
    }

    public void setTaxaSobrevivencia(Double taxaSobrevivencia) {
        this.taxaSobrevivencia = taxaSobrevivencia;
    }

    public BigDecimal getProdutividade() {
        return produtividade;
    }

    public void setProdutividade(BigDecimal produtividade) {
        this.produtividade = produtividade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public void setDataInicio(Timestamp valueOf) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setDataInicio'");
    }

    public void setDescricao(String string) {
    
        throw new UnsupportedOperationException("Unimplemented method 'setDescricao'");
    }

    void setDataFim(Timestamp valueOf) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getGenerationType() {
        return GenerationType;
    }

    public void setGenerationType(String GenerationType) {
        this.GenerationType = GenerationType;
    }
}

