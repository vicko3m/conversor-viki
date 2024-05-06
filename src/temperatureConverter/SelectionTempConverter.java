package temperatureConverter;

import javax.swing.JOptionPane;

public class SelectionTempConverter {

	public static void seleccion(String input) {
		if (input == null) {
			return;
		}

		Double valorDouble = null;
		while (valorDouble == null) {
			String valor = (String) JOptionPane.showInputDialog(null,
					"Ingrese el valor",
					"Input",
					JOptionPane.PLAIN_MESSAGE,
					null,
					null,
					"");
			try {
				if (valor == null) {
					return;
				}
				valorDouble = Double.valueOf(valor);

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "El formato cargado no es correcto", "Error", JOptionPane.ERROR_MESSAGE);
			}

		}
		
		switch (input) {
		case "De ºC a ºF":
			TempConverter.deCaF(valorDouble);
			break;
		case "De ºC a K":
			TempConverter.deCaK(valorDouble);
			break;
		case "De ºF a ºC":
			TempConverter.deFaC(valorDouble);
			break;
		case "De ºF a K":
			TempConverter.deFaK(valorDouble);
			break;
		case "De K a ºC":
			TempConverter.deKaC(valorDouble);
			break;
		case "De K a ºF":
			TempConverter.deKaF(valorDouble);
			break;
		default:
			break;
		}
	}
	
	
}
