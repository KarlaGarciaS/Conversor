import javax.swing.JOptionPane;

public class Temperatura {
	
	
	// CANTIDAD A CONVERTIR
	public void conversionGrados() {
	String auxCantidad = JOptionPane.showInputDialog(
			null, 
			"Ingresa el valor de la temperatura que deseas convertir: ", 
			"Cantidad", 
			JOptionPane.QUESTION_MESSAGE);
	
	double cantidad = Double.parseDouble(auxCantidad);
	
	// SELECCIONAR UNIDAD DE TEMPERATURA PARA LA CONVERSION
			String[] tipoTemperatura = {
					"De Celsius a Kelvin",
					"De Celsius a Fahrenheit",
					"De Kelvin a Celsius",
					"De Kelvin a Fahrenheit",
					"De Fahrenheit a Celsius",
					"De Fahrenheit a Kelvin"
			};
			
			String temperatura = (String) JOptionPane.showInputDialog(
					null,
					"Elije la unidad de temperatura",
					"Unidad de temperatura",
					JOptionPane.PLAIN_MESSAGE,
					null,
					tipoTemperatura,
					tipoTemperatura[0]);
			
			// CALCULAR RESULTADO DE CONVERSION
	
			double resultadoConversion;
				
			if(temperatura == tipoTemperatura[0]) {
				resultadoConversion = (cantidad) + (273.15);//celsius a kelvin
				JOptionPane.showMessageDialog(null,cantidad + " grados Celsius son " + resultadoConversion + " grados Kelvin.");
			};
			if(temperatura == tipoTemperatura[1]) {
				resultadoConversion = ((9*cantidad)/5) + 32;//celsius a Fahrenheit
				JOptionPane.showMessageDialog(null,cantidad + " grados Celsius son " + resultadoConversion + " grados Fahrenheit.");
			};
			if(temperatura == tipoTemperatura[2]) {
				resultadoConversion = (cantidad) - (273.15);//Kelvin a Celsius
				JOptionPane.showMessageDialog(null,cantidad + " grados Kelvin son " + resultadoConversion + " grados Celsius.");
			};
			if(temperatura == tipoTemperatura[3]) {
				resultadoConversion = ((9 * (cantidad-273.15))/5) + 32;//Kelvin a Fahrenheit
				JOptionPane.showMessageDialog(null,cantidad + " grados Kelvin son " + resultadoConversion + " grados Fahrenheit.");
			};
			if(temperatura == tipoTemperatura[4]) {
				resultadoConversion = ((5 * (cantidad-32))/9);//Fahrenheit a Celsius
				JOptionPane.showMessageDialog(null,cantidad + " grados Fahrenheit son " + resultadoConversion + " grados Celsius.");
			};
			if(temperatura == tipoTemperatura[5]) {
				resultadoConversion = ((5 * (cantidad-32))/9) + 273.15;//Fahrenheit a Kelvin
				JOptionPane.showMessageDialog(null,cantidad + " grados Fahrenheit son " + resultadoConversion + " grados Kelvin.");
			};
	}
}
	