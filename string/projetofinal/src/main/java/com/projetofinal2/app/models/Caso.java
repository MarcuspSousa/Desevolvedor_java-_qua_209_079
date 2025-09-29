package com.projetofinal2.app.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Caso implements Serializable {
    //atributos
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCaso;
    private String nome;
    private String local;
    private String concluido;
    private String indeferido;

    public Caso() {
    }

    public long getIdCaso() {
        return this.idCaso;
    }

    public void setIdCaso(long idCaso) {
        this.idCaso = idCaso;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getConcluido() {
        return this.concluido;
    }

    public void setConcluido(String concluido) {
        this.concluido = concluido;
    }

    public String getIndeferido() {
        return this.indeferido;
    }

    public void setIndeferido(String indeferido) {
        this.indeferido = indeferido;
    }

    
}
