package com.composicao.model;

import com.composicao.interfaces.IConta;

public class Conta implements IConta {
    private String agencia;
    private String nconta;
    private double saldo;
    private Pessoa titular;

    public Conta(String agencia, String nconta, double saldo, Pessoa titular) {
        this.agencia = agencia;
        this.nconta = nconta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNconta() {
        return this.nconta;
    }

    public void setNconta(String nconta) {
        this.nconta = nconta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getTitular() {
        return this.titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }


    @Override
    public String exibirDados() {
       return "agencia: " + this.agencia + 
       "\nnumero da conta : " +this.nconta +
       "\n saldo da conta: R$" + String.format(":.2F", this.saldo) +
       "\nnome do titular da conta : " + this.titular.getNome() +
       "\nCPF do titular da conta: " + this.titular.getCpf() + 
       "\ne-mail do titular da conta:" + this.titular.getEmail() +
       "\nTelefone do titular da conta: " + this.titular.getTelefone() +
       "\nEndereço do titular da conta " + this.titular.getEndereco(); 
    }

    @Override
    public double fazerdeposito(double valor) {
        this.saldo += valor;
        return this.saldo;
    }

    @Override
    public double fazersaque(double valor) {
      this.saldo -= valor;
      return this.saldo;
    }

}
