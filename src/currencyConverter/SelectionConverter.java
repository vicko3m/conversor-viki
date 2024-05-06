package currencyConverter;

import javax.swing.JOptionPane;

public class SelectionConverter {


	public static void seleccion(String input) {
		if (input == null) {
			return;
		}

		Double valorDouble = null;
		while (valorDouble == null) {
			String valor = (String) JOptionPane.showInputDialog(null,
					"Ingrese el monto",
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
			case "De USD a CLP":
				Converter.deCLPaUSD(valorDouble);
				break;
			case "De CLP a USD":
				Converter.deUSDaCLP(valorDouble);
				break;
			case "De JPY a CLP":
				Converter.deCLPaJPY(valorDouble);
				break;
			case "De CLP a JPY":
				Converter.deJPYaCLP(valorDouble);
				break;
			case "De KRW a CLP":
				Converter.deCLPaKRW(valorDouble);
				break;
			case "De CLP a KRW":
				Converter.deKRWaCLP(valorDouble);
				break;
			case "De EUR a CLP":
				Converter.deCLPaEUR(valorDouble);
				break;
			case "De CLP a EUR":
				Converter.deEURaCLP(valorDouble);
				break;
			default:
				break;
		}
	}
}
