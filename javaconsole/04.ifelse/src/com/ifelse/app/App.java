package com.ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instacia o objeto Scaner 
        Scanner leia = new Scanner(System.in);


        //declaração de variavel 
        String nome;
        int idade; 

        //input
        System.out.println("informe seu nome");
        nome = leia.nextLine();
        System.out.println("informe sua idade");
        idade = leia.nextInt(); 

        //Estrutura de desisão 
        if (idade >= 10) {
            System.out.println(nome + " é maior de idade. ");
        }
        else{
            System.out.println(nome + " é menor de idade. ");
        }

     
     
     
     
     
        //fecha objeto leia 
        leia.close();
        
    }
}
