package com.projetofinal2.app.models;

import java.io.Serializable;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Casos implements Serializable {
    //atributos
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPessoa;
    private String caso;
    private String suspeito;
    private String vitima; 
    private String local;

    public Casos() {
    }

    public long getIdPessoa() {
        return this.idPessoa;
    }

    public void setIdPessoa(long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getCaso() {
        return this.caso;
    }

    public void setCaso(String caso) {
        this.caso = caso;
    }

    public String getSuspeito() {
        return this.suspeito;
    }

    public void setSuspeito(String suspeito) {
        this.suspeito = suspeito;
    }

    public String getVitima() {
        return this.vitima;
    }

    public void setVitima(String vitima) {
        this.vitima = vitima;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

}
