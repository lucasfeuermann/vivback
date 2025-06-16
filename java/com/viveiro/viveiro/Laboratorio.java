package com.viveiro.viveiro;

    @Entity
public class Laboratorio {
    private Integer id;

    private String nome;
    private Integer contato; // Isso pode ser alterado para relacionamento se necessário

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContato() {
        return contato;
    }

    public void setContato(Integer contato) {
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

