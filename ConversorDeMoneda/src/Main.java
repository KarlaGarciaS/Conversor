
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Moneda m = new Moneda();
		Temperatura t = new Temperatura();
		
		int salir=0;
		do {
		// SELECCIONAR TIPO DE CONVERSION (MONEDA, TEMPERATURA)
		String[] tipoConversion = {
			"Conversor de moneda",
			"Conversor de temperatura"
		};
					
		String seleccionConversion = (String) JOptionPane.showInputDialog(
							null,
							"Seleccione una opcion de conversion: ",
							"Menu",
							JOptionPane.PLAIN_MESSAGE,
							null,
							tipoConversion,
							tipoConversion[0]);
					
		if(seleccionConversion == tipoConversion[0]) {
			m.conversionMoneda();
		} else {
			t.conversionGrados();
		}
		
		// ¿DESEA CONTINUAR?
		salir = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Salir", JOptionPane.YES_NO_CANCEL_OPTION);
		// 0=SI, 1=NO, 2=CANCELAR
		} while(salir == 0);
	}

}
