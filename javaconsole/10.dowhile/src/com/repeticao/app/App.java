package com.repeticao.app;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
       Scanner leia = new Scanner(System.in);

       
       String nome; 
       int idade, opcao; 
       double altura;

       // faca...enquanto 
       do {
        //menu  
        System.out.println("1 - registrar nova entrada.");
        System.out.println("2 - sair do progama. ");
        System.out.println("informe a opção desejada:");
        opcao = leia.nextInt();

        if(opcao == 1 || opcao == 2 ){
            if (opcao == 1 ){
                leia.nextLine();
                System.out.println("informe o nome: ");
                nome = leia.nextLine();
                System.out.println("informe o idade ");
                idade = leia.nextInt();
                System.out.println("infome a  altura");
                altura = leia.nextDouble();

                // verificar a idade e a altura 
                if (idade >= 12 && altura >= 1.15){
                    System.out.println(nome + "esta autorizad.");
                }
                else{
                    System.out.println(nome + "n]ao esta autorizado");
                }
            }
        }
        else if (opcao != 2){
            System.out.println("opção invalida. ");
        }
       } while (opcao != 2 );

       
       leia.close();

    }
}
