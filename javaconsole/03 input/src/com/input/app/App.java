package com.input.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instacia do objeto de entrada de dados
        Scanner leia = new Scanner(System.in);

        // declaração de variaveis 
        String nome; 
        String email;
        int idade; 

        // input entrada de dados 
        System.out.println("informe seu nome");
        nome = leia.nextLine();
        System.out.println("informe sua idade");
        idade = leia.nextInt();

        //limpeza de buffer
        leia.nextLine();
        
        System.out.println("informe seu email: ");
        email = leia.nextLine();

        // output (saida de dados)
        System.out.println("nome:" + nome + "." );
        System.out.println("idade: "  + idade + ".");
        System.out.println("E-mail: " + email + ".");

        // fechar obejto 
        leia.close();
    }
}
