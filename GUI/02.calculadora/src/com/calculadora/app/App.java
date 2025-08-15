package com.calculadora.app;

import javax.swing.JOptionPane;
import com.calculadora.controller.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora(0, 0);
        

        // menu 
        String[] opcoes = {"somar " , "subtrair " , "multiplicar ", "dividir" , "sair"};
        Object opcao; 

        do{
        opcao =  JOptionPane.showInputDialog(null, "selecione uma opção" , "calculadora" , JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if(opcao != "sair" ){
            calculadora.setX(Double.parseDouble(JOptionPane.showInputDialog("informe o valor de x ")));
            calculadora.setX(Double.parseDouble(JOptionPane.showInputDialog("informe o valor de Y ")));
        }

        if(opcao == "somar" ) {
            JOptionPane.showMessageDialog(null, "o resultado da soma é " + calculadora.somar(calculadora.getX(), calculadora.getY()), "somar", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (opcao == "subtrair "){
            JOptionPane.showMessageDialog(null, "o resultado da subtração é " + calculadora.subtrair(calculadora.getX(), calculadora.getY()), "subtrair ", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (opcao == "multiplicar") {
            JOptionPane.showMessageDialog(null, "o resultado da multiplicação é " + calculadora.multiplicar(calculadora.getX(), calculadora.getY()), "multiplicar", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (opcao == "dividir"){
            JOptionPane.showMessageDialog(null, "o resultado da divisão é " + calculadora.dividir(calculadora.getX(), calculadora.getY()), "dividir", JOptionPane.INFORMATION_MESSAGE);
        }
    
    
    }while (opcao != "sair");

    }
}
