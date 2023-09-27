package conversor_comprimento;

import javax.swing.JOptionPane;

public class ConversorComprimento {
	
    public double converterMetroParaQuilometro(double valorRecebido) {
        double metroParaQuilometro = valorRecebido / 1000;
        JOptionPane.showMessageDialog(null, valorRecebido + " m são " + metroParaQuilometro + " km");
        return metroParaQuilometro;
    }

    public double converterMetroParaHectometro(double valorRecebido) {
        double metroParaHectometro = valorRecebido / 100;
        JOptionPane.showMessageDialog(null, valorRecebido + " m são " + metroParaHectometro + " hm");
        return metroParaHectometro;
    }

    public double converterMetroParaDecametro(double valorRecebido) {
        double metroParaDecametro = valorRecebido / 10;
        JOptionPane.showMessageDialog(null, valorRecebido + " m são " + metroParaDecametro + " dam");
        return metroParaDecametro;
    }

    public double converterMetroParaDecimetro(double valorRecebido) {
        double metroParaDecimetro = valorRecebido * 10;
        JOptionPane.showMessageDialog(null, valorRecebido + " m são " + metroParaDecimetro + " dm");
        return metroParaDecimetro;
    }

    public double converterMetroParaCentimetro(double valorRecebido) {
        double metroParaCentimetro = valorRecebido * 100;
        JOptionPane.showMessageDialog(null, valorRecebido + " m são " + metroParaCentimetro + " cm");
        return metroParaCentimetro;
    }

    public double converterMetroParaMilimetro(double valorRecebido) {
        double metroParaMilimetro = valorRecebido * 1000;
        JOptionPane.showMessageDialog(null, valorRecebido + " m são " + metroParaMilimetro + " mm");
        return metroParaMilimetro;
    }
}
