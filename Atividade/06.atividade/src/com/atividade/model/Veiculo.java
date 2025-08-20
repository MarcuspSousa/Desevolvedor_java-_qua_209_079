package com.atividade.model;

import com.atividade.interfaces.IVeiculo;


public class Veiculo implements IVeiculo {
      private String modelo;
    private String placa;
    private int ano;
    private Proprietario proprietario;

    public Veiculo(String modelo, String placa, int ano2, Proprietario proprietario) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano2;
        this.proprietario = proprietario;
    }

    @Override
    public String exibirDados() {
        return "==== Dados do Veículo ====\n" +
               "Modelo: " + modelo + "\n" +
               "Placa: " + placa + "\n" +
               "Ano: " + ano + "\n\n" +
               "==== Dados do Proprietário ====\n" +
               "Nome: " + proprietario.getNome() + "\n" +
               "CPF: " + proprietario.getCpf() + "\n" +
               "Telefone: " + proprietario.getTelefone() + "\n" +
               "Data de Nascimento: " + proprietario.getDataNascimento() + "\n" +
               "Email: " + proprietario.getEmail();
    }

}
