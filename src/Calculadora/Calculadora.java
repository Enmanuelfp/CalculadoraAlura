package Calculadora;

import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
    	
        JOptionPane.showMessageDialog(null, "Bienvenido al conversor de monedas de alura");
        
        CalculadoraAlura calculadora = new CalculadoraAlura();
        calculadora.llamarConversor();
}
    }

