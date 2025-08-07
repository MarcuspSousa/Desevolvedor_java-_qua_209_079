package com.atividade02.app;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        String nome, sala;
        int  idade, idademinima = 0;

        System.out.println("informe o nome");
        nome = leia.nextLine();
        System.out.println("informe a idade");
        idade = leia.nextInt();
        

        //limpezade de buffer 
        leia.nextLine();

        do{
            //Salas
            System.out.println("cine java");
            System.out.println("sala 1 - a Roda quadrada- livre");
            System.out.println("sala 2 - volta dos que não foram - 12 anos  ");
            System.out.println("sala 3 - As tranças do Rei Careca - 14 anos");
            System.out.println("sala 4 - poeira em alta Mar - 16 anos ");
            System.out.println(" sala 5 - a vingança do frango assado - 18 anos");
            System.out.println(" qual sala deseja entrar?");
            sala = leia.nextLine();

            switch (sala) {
                case "1":
                break;
                case "2":
                idademinima = 12;
                break; 
                case "3":
                idademinima = 14;
                break;
                case "4":
                idademinima = 16;
                break;
                case "5":
                idademinima = 18;
                break;
                default:
                idademinima = + 1;
                System.out.println("saia inexistente");

            }
            
            
            if (idade  >= idademinima){
                System.out.println("entrada permitida para"    + nome + ".");
                System.out.println("tenha um bom filme 🎉");
            }
            else{
                System.out.println("favor escolher outro filme!");
            }
        } while (idade  < idademinima);

        leia.close();
    }
}
