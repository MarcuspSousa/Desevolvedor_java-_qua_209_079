package com.ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //instacia do objeto Scanner
        Scanner leia = new Scanner(System.in);

        //declaração de variaveis 
        String nome ;
        double nota ; 

        // input
        System.out.println("informe o nome do aluno ");
        nome = leia.nextLine();
        System.out.println("informe a nota do aluno ");
        nota = leia.nextDouble();

        // output
        if (nota >=7){
            System.out.println(nome + "esta aprovador");
        }
        else if (nota >= 5 ){
            System.out.println( nome + "esta de recuperação");
        }
        else{
            System.out.println(nome + " esta aprovado");
        }
        
        
    }
}
