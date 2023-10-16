package Calculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;


public class CalculadoraAlura {
	 public void llamarConversor() {
	        String[] opciones = {"Peso chileno a Dólar", "Peso chileno a Euro", "Dólar a Peso chileno", "Euro a Peso chileno", "Salir"};
	        JComboBox<String> opcionesComboBox = new JComboBox<>(opciones);

	        while (true) {
	            int opcion = JOptionPane.showConfirmDialog(null, opcionesComboBox, "Selecciona una conversión", JOptionPane.OK_CANCEL_OPTION);

	            if (opcion != JOptionPane.OK_OPTION || opcionesComboBox.getSelectedIndex() == -1) {
	                JOptionPane.showMessageDialog(null, "¡Hasta luego!");
	                break;
	            }

	            String seleccion = opcionesComboBox.getSelectedItem().toString();

	            if (seleccion.equals("Salir")) {
	                JOptionPane.showMessageDialog(null, "¡Hasta luego!");
	                break;
	            }

	            double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad a convertir:"));
	            double resultado = 0;

	            if (seleccion.equals("Peso chileno a Dólar")) {
	                resultado = cantidad / 800; // Ejemplo de conversión simple (1 Peso chileno = 0.00125 Dólar)
	            } else if (seleccion.equals("Peso chileno a Euro")) {
	                resultado = cantidad / 700; // Ejemplo de conversión simple (1 Peso chileno = 0.00143 Euro)
	            } else if (seleccion.equals("Dólar a Peso chileno")) {
	                resultado = cantidad * 800; // Ejemplo de conversión simple (1 Dólar = 800 Pesos chilenos)
	            } else if (seleccion.equals("Euro a Peso chileno")) {
	                resultado = cantidad * 700; // Ejemplo de conversión simple (1 Euro = 700 Pesos chilenos)
	            }

	            DecimalFormat formato = new DecimalFormat("#.##"); // Redondea el resultado a dos decimales
	            JOptionPane.showMessageDialog(null, cantidad + " " + seleccion.split(" a ")[0] + " equivale a " + formato.format(resultado) + " " + seleccion.split(" a ")[1]);
	        }
	    }

	
}
	



