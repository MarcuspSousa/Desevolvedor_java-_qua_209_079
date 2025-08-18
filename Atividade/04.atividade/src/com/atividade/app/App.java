package com.atividade.app;

import com.atividade.model.Pessoa;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws Exception {
        // Criar objeto da classe pessoa 
        Pessoa = new Pessoa(null, 0, 0, 0);

        String[] opcoes = ("calcularIMC", "sair");
        Object opcao;
        
        double imcvalor;

        do{
            opcao = JOptionPane.showMessageDialog(
                null, 
                "Escolha a opção desejada", 
                "IMC", JOptionPane.QUESTION_MESSAGE 
                null, opcoes,opcoes(0)
            );

            if(opcao == "calcular imc") {
                imc.setPeso(Double.parseDouble(JOptionPane.showInputDialog("informe o seu pesso em kg").replace(",", ".")));
                imc.setPeso(Double.parseDouble(JOptionPane.showInputDialog("informe o sua altura em metros").replace(",", ".")));

                imcvalor = imc.calcularIMC();
            }
        }while (opcao != "sair");


        
    }
}
