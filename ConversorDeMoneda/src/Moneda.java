import javax.swing.JOptionPane;

public class Moneda{	
	
			// CANTIDAD A CONVERTIR	
	public void conversionMoneda() {
			String auxCantidad = JOptionPane.showInputDialog(
								null, 
								"Ingresa la cantidad de dinero que deseas convertir: ", 
								"Cantidad", 
								JOptionPane.QUESTION_MESSAGE);
						
			double cantidad = Double.parseDouble(auxCantidad);
			// SELECCIONAR TIPO DE MONEDA PARA LA CONVERSION
			String[] tipoMoneda = {
					"De Peso a Dolar",
					"De Peso a Euro",
					"De Peso a Libras Esterlinas",
					"De Peso a Yen Japones",
					"De Peso a Won sur-coreano",
					"De Dolar a Peso",
					"De Euro a Peso",
					"De Libras Esterlinas a Peso",
					"De Yen Japones a Peso",
					"De Won sur-coreano a Peso"
			};
			
			String moneda = (String) JOptionPane.showInputDialog(
					null,
					"Elije la moneda a la que deseas convertir tu dinero: ",
					"Tipo de moneda",
					JOptionPane.PLAIN_MESSAGE,
					null,
					tipoMoneda,
					tipoMoneda[0]);
			
			// CALCULAR RESULTADO DE CONVERSION
		
			double dolar= 0.050, euro=0.051, libra=0.046, yen=7.10, won=70.45;
			double resultadoConversion = 0;
			
			if(moneda == tipoMoneda[0]) { // Peso a Dolar
				resultadoConversion = (cantidad)*(dolar);
				JOptionPane.showMessageDialog(null,"Tienes " + resultadoConversion + " dolares.");
			};
			if(moneda == tipoMoneda[1]) { // Peso a Euro
				resultadoConversion = (cantidad)*(euro);
				JOptionPane.showMessageDialog(null,"Tienes " + resultadoConversion + " euros.");
			};
			if(moneda == tipoMoneda[2]) { // Peso a Libra esterlina
				resultadoConversion = (cantidad)*(libra);
				JOptionPane.showMessageDialog(null,"Tienes " + resultadoConversion + " libras esterlinas.");
			};
			if(moneda == tipoMoneda[3]) { // Peso a Yen japones
				resultadoConversion = (cantidad)*(yen);
				JOptionPane.showMessageDialog(null,"Tienes " + resultadoConversion + " yenes.");
			};
			if(moneda == tipoMoneda[4]) { // Peso a Won sur-coreano
				resultadoConversion = (cantidad)*(won);
				JOptionPane.showMessageDialog(null,"Tienes " + resultadoConversion + " won.");
			};
			
			if(moneda == tipoMoneda[5]) { // Dolar a Peso  
				resultadoConversion = (cantidad)*(20.20 );
				JOptionPane.showMessageDialog(null,"Tienes " + resultadoConversion + " pesos.");
			};
			if(moneda == tipoMoneda[6]) { // Euro a Peso  
				resultadoConversion = (cantidad)*(19.57);
				JOptionPane.showMessageDialog(null,"Tienes " + resultadoConversion + " pesos.");
			};
			if(moneda == tipoMoneda[7]) { // Libra esterlina a Peso  
				resultadoConversion = (cantidad)*(21.91);
				JOptionPane.showMessageDialog(null,"Tienes " + resultadoConversion + " pesos.");
			};
			if(moneda == tipoMoneda[8]) { // Yen japones a Peso  
				resultadoConversion = (cantidad)*(0.14);
				JOptionPane.showMessageDialog(null,"Tienes " + resultadoConversion + " pesos.");
			};
			if(moneda == tipoMoneda[9]) { // Won sur-coreano a Peso  
				resultadoConversion = (cantidad)*(0.014);
				JOptionPane.showMessageDialog(null,"Tienes " + resultadoConversion + " pesos.");
			};
		}
}
