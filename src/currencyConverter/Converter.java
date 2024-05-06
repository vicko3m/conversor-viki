package currencyConverter;

import conection.conection;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import javax.swing.*;

public class Converter {

	private static double clpXusd;
	private static double clpXjpy;
	private static double clpXkrw;
	private static double clpXeur;

	static {
		try {
			clpXusd = conexionUSD();
			clpXjpy = conexionJPY();
			clpXkrw = conexionKRW();
			clpXeur = conexionEUR();
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error de conexión al obtener los datos de conversión.");
		}
	}

	private static double conexionUSD() {
		try (conection con = new conection("https://v6.exchangerate-api.com/v6/899684182f7c691131bea73e/latest/CLP")) {
			String respuesta = con.leerRespuesta();
			JSONObject jsonObject = (JSONObject) JSONValue.parse(respuesta);
			JSONObject rates = (JSONObject) jsonObject.get("conversion_rates");
			return (double) rates.get("USD");
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	private static double conexionJPY() {
		try (conection con = new conection("https://v6.exchangerate-api.com/v6/899684182f7c691131bea73e/latest/CLP")) {
			String respuesta = con.leerRespuesta();
			JSONObject jsonObject = (JSONObject) JSONValue.parse(respuesta);
			JSONObject rates = (JSONObject) jsonObject.get("conversion_rates");
			return (double) rates.get("JPY");
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	private static double conexionKRW() {
		try (conection con = new conection("https://v6.exchangerate-api.com/v6/899684182f7c691131bea73e/latest/CLP")) {
			String respuesta = con.leerRespuesta();
			JSONObject jsonObject = (JSONObject) JSONValue.parse(respuesta);
			JSONObject rates = (JSONObject) jsonObject.get("conversion_rates");
			return (double) rates.get("KRW");
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	private static double conexionEUR() {
		try (conection con = new conection("https://v6.exchangerate-api.com/v6/899684182f7c691131bea73e/latest/CLP")) {
			String respuesta = con.leerRespuesta();
			JSONObject jsonObject = (JSONObject) JSONValue.parse(respuesta);
			JSONObject rates = (JSONObject) jsonObject.get("conversion_rates");
			return (double) rates.get("EUR");
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static void deCLPaUSD(double input) {
		double usdAux = input / clpXusd;
		double usd = Math.round(usdAux * 100) / 100;
		JOptionPane.showMessageDialog(null, usd + " CLP");
	}

	public static void deUSDaCLP(double input) {
		double clpAux = input * clpXusd;
		double clp = Math.round(clpAux * 100) / 100;
		JOptionPane.showMessageDialog(null, clp + " USD");
	}

	public static void deCLPaJPY(double input) {
		double jpyAux = input / clpXjpy;
		double jpy = Math.round(jpyAux * 100) / 100;
		JOptionPane.showMessageDialog(null, jpy + " CLP");
	}

	public static void deJPYaCLP(double input) {
		double clpAux = input * clpXjpy;
		double clp = Math.round(clpAux * 100) / 100;
		JOptionPane.showMessageDialog(null, clp + " JPY");
	}

	public static void deCLPaKRW(double input) {
		double krwAux = input / clpXkrw;
		double krw = Math.round(krwAux * 100) / 100;
		JOptionPane.showMessageDialog(null, krw + " CLP");
	}

	public static void deKRWaCLP(double input) {
		double clpAux = input * clpXkrw;
		double clp = Math.round(clpAux * 100) / 100;
		JOptionPane.showMessageDialog(null, clp + " KRW");
	}

	public static void deCLPaEUR(double input) {
		double eurAux = input / clpXeur;
		double eur = Math.round(eurAux * 100) / 100;
		JOptionPane.showMessageDialog(null, eur + " CLP");
	}

	public static void deEURaCLP(double input) {
		double clpAux = input * clpXeur;
		double clp = Math.round(clpAux * 100) / 100;
		JOptionPane.showMessageDialog(null, clp + " EUR");
	}
}
