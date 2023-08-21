package application;
import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import conversor_moeda.ConversorMoeda;
import conversor_temperatura.ConversorTemperatura;

public class Funcao {
	
	ConversorMoeda moedas = new ConversorMoeda();
	ConversorTemperatura temperatura = new ConversorTemperatura();
	
	public void converterMoeda(double valorRecebido, double cotacao) {
		String opcao = (JOptionPane.showInputDialog(null,
                "Escolha a moeda para a qual você deseja converter seu dinheiro ", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Peso Argentino", "De Reais a Peso Chileno", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais", "De Peso Argentino a Reais", "De Peso Chileno a Reais"}, "Escolha")).toString();
		
		switch (opcao) {
	    case "De Reais a Dólares":
	    case "De Reais a Euros":
	    case "De Reais a Libras":
	    case "De Reais a Peso Argentino":
	    case "De Reais a Peso Chileno":
	        moedas.converteRealParaMoeda(valorRecebido, cotacao, opcao);
	        break;
	    case "De Dólares a Reais":
	    case "De Euros a Reais":
	    case "De Libras a Reais":
	    case "De Peso Argentino a Reais":
	    case "De Peso Chileno a Reais":
	        moedas.converteMoedaparaReal(valorRecebido, cotacao);
	        break;
	}
}
	
    public void converterTemperatura(double valorRecebido) {
        String opcao = (JOptionPane.showInputDialog(null, "Escolha uma opção para converter", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[]{
                "Graus Celsius a Fahrenheit",
                "Graus Celsius a Kelvin",
                "Graus Fahrenheit a Celsius",
                "Kelvin a Graus Celsius",
                "Kelvin a Graus Fahrenheit"}, "Escolha")).toString();
        
        switch (opcao) {
            case "Graus Celsius a Fahrenheit":
                temperatura.converterCelsiusParaFahrenheit(valorRecebido);
                break;
            case "Graus Celsius a Kelvin":
                temperatura.converterCelsiusParaKelvin(valorRecebido);
                break;
            case "Graus Fahrenheit a Celsius":
                temperatura.converterFahrenheitParaCelsius(valorRecebido);
                break;
            case "Kelvin a Graus Celsius":
                temperatura.converterKelvinParaCelsius(valorRecebido);
                break;
            case "Kelvin a Graus Fahrenheit":
                temperatura.converterKelvinParaFahrenheit(valorRecebido);
                break;
        }
    }
    public static final Map<String, String> moedaNomes = new HashMap<>();
    static {
        moedaNomes.put("De Reais a Dólares", "Dólares");
        moedaNomes.put("De Reais a Euros", "Euros");
        moedaNomes.put("De Reais a Libras", "Libras");
        moedaNomes.put("De Reais a Pesos Argentinos", "Pesos Argentinos");
        moedaNomes.put("De Reais a Pesos Chilenos", "Pesos Chilenos");   
    }
}