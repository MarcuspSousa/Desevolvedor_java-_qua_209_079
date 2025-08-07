package com.atividade01.app;

import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        String nome, opcao;
        double altura, peso, IMC;

        
        // menu
         System.out.println("1 - Verificar meu IMC");
         System.out.println("2 - Sair do programa");
         System.out.println("Informe a opção desejada");
         opcao = leia.nextLine();

         
        // Opção 2
        switch (opcao) {
            case "2": System.out.println("ate mais");
                   break;
          }

           // declaração de variáveis
        System.out.println("Vamos verificar o seu IMC");
        System.out.println("Informe seu nome: ");
        nome = leia.nextLine(); 
        leia.nextLine(); // fechando buffer
        System.out.println("Informe sua altura: ");
        altura = leia.nextDouble(); 
        System.out.println("Informe seu peso: ");
        peso = leia.nextDouble();
        
        IMC = peso/(altura*altura);
         
          
        if (IMC <= 18.5){
            System.out.println("abaixo de peso");
        }
        else if (IMC >= 18.5 || IMC <= 29.9){
            System.out.println("peso ideal parabens");
        }
         else if (IMC>= 25.05 || IMC <= 34.9) {
            System.out.println("peso acima do normal");
        }
        else if (IMC >= 35.0 || IMC <= 39.9){
            System.out.println("perigo obsesidade problematica");
        }
        else if (IMC >= 39.9 || IMC <= 40.0){
            System.out.println("voce esta morto ADEUS");
        }
        
        //fecha objeto Sca
        leia.close();

        
    

       }
        
    }

