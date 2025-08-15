package com.dialogos.app;

import javax.swing.JOptionPane;

import com.dialogos.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // instacia da classe Pessoa     
        Pessoa usuario = new Pessoa(null, 0);

        // caixa de input 
        usuario.setNome(JOptionPane.showInputDialog( "informe seu nome: "));
        usuario.setIdade(Integer.parseInt((JOptionPane.showInputDialog( "informe sua idade : "))));

        // caixa de output 
        JOptionPane.showMessageDialog(null, "nome: " + usuario.getNome() + "\nidade: " + usuario.getIdade(), "saida", JOptionPane.INFORMATION_MESSAGE);
    }
}
