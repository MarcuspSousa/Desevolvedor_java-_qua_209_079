package com.atividade.model;

public class Proprietario {
     private String nome;
    private String cpf;
    private String telefone;
    private String dataNascimento;
    private String email;

    public Proprietario(String nome, String cpf, String telefone, String dataNascimento, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

}
