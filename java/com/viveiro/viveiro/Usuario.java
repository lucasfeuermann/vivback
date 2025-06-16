package com.viveiro.viveiro;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
public class Usuario {
    /**
     *
     */
    private Integer id;

    private String nome;
    private LocalDateTime dataDeNascimento;

    @ManyToOne
    @JoinColumn(name = "endereco_id", nullable = false)
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "login_id", nullable = false)
    private Login login;

    @ManyToOne
    @JoinColumn(name = "contato_id", nullable = false)
    private Contato contato;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDateTime dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public void setDataDeNascimento(Timestamp valueOf) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setDataDeNascimento'");
    }

    void setEndereco(Login endereco) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void setContato(Login contato) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object getUsuario() {
        throw new UnsupportedOperationException("Unimplemented method 'getUsuario'");
    }

    public Object getSenha() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object getEmail() {
        throw new UnsupportedOperationException("Unimplemented method 'getEmail'");
    }
}