package com.atividade.model;

public class Pessoa {
    private String nome;
    private double peso; 
    private double altura, imc;
    
    public Pessoa(String nome, double peso, double altura, double imc) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular o IMC
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    //Metodo para retornar a classificação IMC
    
    public String classificarIMC(){
        Double imc = calcularIMC();
        if  (imc < 18.5) {
            return "abaixo do peso";
        }else if  (imc < 25 ) {
            return "peso normal";
        }else if (imc  < 30 ){
            return "sobrepeso";
        }else if (imc < 35){
            return "obesidade grau 1";
        }else if (imc < 40){
            return "obesidade grau 2";
        }else{
            return "obesidade grau 3 (voce verá o verdadeiro java)";
        }
    }
    

    
}
