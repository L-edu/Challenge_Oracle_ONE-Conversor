package application;

import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        Funcao funcao = new Funcao();

        while (true) {
            String opcao = JOptionPane.showInputDialog(
                null, 
                "Escolha uma opção ", 
                "Menu", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                new Object[]{"Conversor de Moeda", "Conversor de Temperatura"}, 
                "Escolha"
            ).toString();

            switch (opcao) {
                case "Conversor de Moeda":
                    try {
                        double valorRecebido = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor para conversão: "));
                        double cotacao = Double.parseDouble(JOptionPane.showInputDialog("Insira a cotação da moeda: "));
                        funcao.converterMoeda(valorRecebido, cotacao);

                        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                        if (resposta != JOptionPane.OK_OPTION) {
                            JOptionPane.showMessageDialog(null, "Programa finalizado");
                            return;
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;
                case "Conversor de Temperatura":
                    try {
                        double valorRecebido = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor de temperatura para conversão"));
                        
                        funcao.converterTemperatura(valorRecebido);

                        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                        if (resposta != JOptionPane.OK_OPTION) {
                            JOptionPane.showMessageDialog(null, "Programa finalizado");
                            return;
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        }
    }
}