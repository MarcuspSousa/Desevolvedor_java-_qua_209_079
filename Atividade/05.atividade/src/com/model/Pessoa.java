package com.model;

public class Pessoa {
    private double precoGasolina;
    private double precoEtanol;

    public Pessoa(double precoGasolina, double precoEtanol) {
        this.precoGasolina = precoGasolina;
        this.precoEtanol = precoEtanol;
    }


    // Getters e Setters
    public double getPrecoGasolina() {
        return precoGasolina;
    }

    public void setPrecoGasolina(double precoGasolina) {
        this.precoGasolina = precoGasolina;
    }

    public double getPrecoEtanol() {
        return precoEtanol;
    }

    public void setPrecoEtanol(double precoEtanol) {
        this.precoEtanol = precoEtanol;
    }

    // Método que calcula a proporção etanol/gasolina
    public double calcularProporcao() {
        return precoEtanol / precoGasolina;
    }

    // Método que retorna qual combustível compensa mais
    public String melhorOpcao() {
        if (calcularProporcao() <= 0.7) {
            return "Compensa abastecer com ETANOL.";
        } else {
            return "Compensa abastecer com GASOLINA.";
        }
    }

}
