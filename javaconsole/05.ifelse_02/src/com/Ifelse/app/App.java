package com.Ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // stancia a classe Scanner 
        Scanner leia = new Scanner(System.in);

        //Declaração de variavel 
        String nome;
        int idade;
        double altura;
        
        //input
        System.out.println("informe seu nome: ");
        nome = leia.nextLine();
        System.out.println("informe sua idade: ");
        idade = leia.nextInt();
        System.out.println("informe sua altura:");
        altura = leia.nextDouble();

        //estrutura de dados 
        if (idade >= 12 && altura >= 1.15){
            System.out.println(nome + "esta autorizado");
        }
        else{
            System.out.println(nome + "não esta autorizado");
        }

        //fecha objeto leia 
        leia.close();
       
    }
}
