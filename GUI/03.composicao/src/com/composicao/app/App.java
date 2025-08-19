package com.composicao.app;

import javax.swing.JOptionPane;

import com.composicao.model.Conta;
import com.composicao.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa usuario = new Pessoa(
        null,
         null,
          null,
           null,
            null
            ); 
            Conta cc = new Conta(
              "1234-5",
             "12345-6",
              0, 
              usuario
              );
              
              String [] opcoes = {"exebir dados da conta ", "fazer deposito" , "fazer saque" , "sair"};
              
              Object opcao;
              double valor; 

              //input do titular da conta 
              usuario.setNome(JOptionPane.showInputDialog("informe o nome do titular da conta "));
              usuario.setCpf(JOptionPane.showInputDialog("informe o CPF do titular da conta"));
              usuario.setEmail(JOptionPane.showInputDialog("informe seu e-mail"));
              usuario.setTelefone(JOptionPane.showInputDialog("Informe seu telefone do titular da conta "));
              usuario.setEndereco(JOptionPane.showInputDialog("informe o endereço do titular da conta"));

              do{
                opcao = JOptionPane.showInputDialog(null, cc, null, 0, null, opcoes, opcoes[0]);
              }while (opcao != "sair");


    }
}
