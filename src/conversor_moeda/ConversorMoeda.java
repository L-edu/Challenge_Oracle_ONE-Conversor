package conversor_moeda;
import javax.swing.*;

import application.Funcao;

public class ConversorMoeda {
	
    public void converteRealParaMoeda(double valor, double cotacao, String opcao) {
        double moeda = valor / cotacao;
        moeda =  Math.round(moeda * 100) / 100.0;
        
        String nomeMoeda = Funcao.moedaNomes.get(opcao);
        
        JOptionPane.showMessageDialog(null, "Você tem " + moeda + " " + nomeMoeda);
    }
    
    public void converteMoedaparaReal(double valor, double cotacao) {
        double moeda = valor * cotacao;
        moeda = Math.round(moeda * 100) / 100.0;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moeda + " Reais");
    }
}