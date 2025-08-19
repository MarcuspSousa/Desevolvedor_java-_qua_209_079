package com.atividade.app;

import javax.swing.JOptionPane;

import com.model.Pessoa;


public class App {
    public static void main(String[] args) throws Exception {
         // Solicita o valor do etanol
        String etanolStr = JOptionPane.showInputDialog("Digite o preço do Etanol  4.59:");
        // Solicita o valor da gasolina
        String gasolinaStr = JOptionPane.showInputDialog("Digite o preço da Gasolina  6.49");

        // Converte os valores para double
        double etanol = Double.parseDouble(etanolStr);
        double gasolina = Double.parseDouble(gasolinaStr);

        // Calcula a relação
        double relacao = etanol / gasolina;

        // Verifica qual combustível é mais vantajoso
        String resultado;
        if (relacao <= 0.7) {
            resultado = "Compensa abastecer com Etanol.";
        } else {
            resultado = "Compensa abastecer com Gasolina.";
        }

        // Exibe o resultado
        JOptionPane.showMessageDialog(null,
            "Preço do Etanol: R$ " + etanol +
            "\nPreço da Gasolina: R$ " + gasolina +
            "\nRelação Etanol/Gasolina: " + String.format("%.2f", relacao) +
            "\n\n" + resultado);
    }
}
