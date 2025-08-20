package com.atividade.app;
import javax.swing.JOptionPane;

import com.atividade.model.Proprietario;
import com.atividade.model.Veiculo;
public class App {
    public static void main(String[] args) throws Exception {
       
        // Coleta dados do proprietário
        String nome = JOptionPane.showInputDialog("Digite o nome do proprietário:");
        String cpf = JOptionPane.showInputDialog("Digite o CPF do proprietário:");
        String telefone = JOptionPane.showInputDialog("Digite o telefone do proprietário:");

        Proprietario proprietario = new Proprietario(nome, cpf, telefone, telefone, telefone);

        // Coleta dados do veículo
        String modelo = JOptionPane.showInputDialog("Digite o modelo do veículo:");
        String placa = JOptionPane.showInputDialog("Digite a placa do veículo:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do veículo:"));

        Veiculo veiculo = new Veiculo(modelo, placa, ano, proprietario);

        Object opcao = null;

        // Exibe os dados
        JOptionPane.showMessageDialog(null, veiculo.exibirDados());
        do{

        }while (opcao != "sair");
    }
    }

