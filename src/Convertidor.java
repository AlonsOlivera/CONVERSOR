import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Convertidor {
	
	public static void main(String [] args) throws Exception{
		Object[] options = {"Convertir Divisas", "Convertir Temperatura", "Salir"};
		int elige = JOptionPane.showOptionDialog(null,"Elija una Opcion : ","CONVERSOR", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE,null,options,options[0]);
		
		if(elige == 2) {
			JOptionPane.showMessageDialog(null, "Programa Cerrado");
			System.exit(0);
		}
		if(elige == 0) {
			DecimalFormat formatearDivisa = new DecimalFormat("#.##");
			boolean continuarPrograma=true;
			while (continuarPrograma) {
				String[] opciones = {"Soles a Euros", "Soles a Dolares", "Soles a Libras Esterlinas", "Soles a Yen", "Soles a Won Coreano",
									"Euros a Soles", "Dolares a Soles", "Libras Esterlinas a Soles", "Yen a Soles", "Won Coreano a Soles"};
				String cambio = (String) JOptionPane.showInputDialog(null,"Elija una Opcion:","Conversor de Moneda",JOptionPane.QUESTION_MESSAGE,null,
						opciones,opciones[0]);
				String input = JOptionPane.showInputDialog(null,"Ingrese la cantidad de dinero que desea convertir: ");
				double monto=0.00;
				try {
					monto = Double.parseDouble(input);
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"Valor no Valido");
				}
				if(cambio.equals("Soles a Euros")) {
					double euros= monto / 3.89;
					JOptionPane.showMessageDialog(null, monto+" Soles peruanos son: "+formatearDivisa.format(euros)+" Euros.");
				}else if(cambio.equals("Soles a Dolares")) {
					double dolares= monto / 3.79;
					JOptionPane.showMessageDialog(null, monto+" Soles peruanos son: "+formatearDivisa.format(dolares)+" Dolares.");
				}else if(cambio.equals("Soles a Libras Esterlinas")) {
					double libras= monto / 4.79;
					JOptionPane.showMessageDialog(null, monto+" Soles peruanos son: "+formatearDivisa.format(libras)+" Libras Esterlinas.");
				}else if(cambio.equals("Soles a Yen")) {
					double yen = monto / 4.79;
					JOptionPane.showMessageDialog(null, monto+" Soles peruanos son: "+formatearDivisa.format(yen)+" Yen.");
				}else if(cambio.equals("Soles a Won Coreano")) {
					double won= monto / 4.79;
					JOptionPane.showMessageDialog(null, monto+" Soles peruanos son: "+formatearDivisa.format(won)+" Won.");
				}else if(cambio.equals("Euros a Soles")) {
					double euros= monto * 3.89;
					JOptionPane.showMessageDialog(null, monto+" Euros son: "+formatearDivisa.format(euros)+" Soles.");
				}else if(cambio.equals("Dolares a Soles")) {
					double dolares= monto * 3.79;
					JOptionPane.showMessageDialog(null, monto+" Dolares son: "+formatearDivisa.format(dolares)+" Soles.");
				}else if(cambio.equals("Libras Esterlinas a Soles")) {
					double libras= monto * 4.79;
					JOptionPane.showMessageDialog(null, monto+" Libras Esterlinas son: "+formatearDivisa.format(libras)+" Soles.");
				}else if(cambio.equals("Yen a Soles")) {
					double yen = monto * 4.79;
					JOptionPane.showMessageDialog(null, monto+" Yen son: "+formatearDivisa.format(yen)+" Soles.");
				}else if(cambio.equals("Won Coreano a Soles")) {
					double won= monto * 4.79;
					JOptionPane.showMessageDialog(null, monto+" Won Coreano son: "+formatearDivisa.format(won)+" Soles.");
				}
				int confirma =JOptionPane.showConfirmDialog(null, "Desea continuar el programa ?","Confirmar",
						JOptionPane.YES_NO_CANCEL_OPTION);
						if(confirma == JOptionPane.NO_OPTION || confirma==JOptionPane.CANCEL_OPTION) {
							continuarPrograma = false;
							JOptionPane.showMessageDialog(null,"Programa Finalizado");
				}
			}
		}
		if(elige == 1) {
			boolean seguirPrograma=true;
			while(seguirPrograma) {
				String[] opciones= {"Celsius a Farenheit","Farenheit a Celsius"};
				int opcion = (int) JOptionPane.showOptionDialog(null,"Elija una Opcion:","Conversor de Temperatura",JOptionPane.DEFAULT_OPTION,
						JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[0]);
				String valorNominal = JOptionPane.showInputDialog(null,"Ingrese valor a convertir");
				double valor = 0.0;
				try {
					valor = Double.parseDouble(valorNominal);
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor no valido");
					System.exit(0);
				}
				
				double resultado = 0;
				if(opcion == 0) {
					resultado =(valor * 9 / 5)+32;
					JOptionPane.showMessageDialog(null, valor + " Grados Celsius son: "+resultado+" Grados Fahrenheit");
				}else if(opcion == 1) {
					resultado =(valor  + 32) * 5 / 9;
					JOptionPane.showMessageDialog(null, valor + " Grados Fahrenheit son: "+resultado+" Grados Celsius");
				}
				int continuar = JOptionPane.showConfirmDialog(null, "Desea seguir usando el programa?","",JOptionPane.YES_NO_OPTION);
				if(continuar == JOptionPane.NO_OPTION) {
					seguirPrograma = false;
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
				}
				
			}
		}
	}
}
