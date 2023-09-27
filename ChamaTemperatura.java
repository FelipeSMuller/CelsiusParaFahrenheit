package ExerciciosComMetodos;

import javax.swing.JOptionPane;

public class ChamaTemperatura {

	public static void main(String[] args) {

		/*
		 * Conversão de Temperatura Crie um método que converta uma temperatura em graus
		 * Celsius para graus Fahrenheit
		 */

		Double celsius = null;

		do {

			try {

				celsius = Double.parseDouble(

						JOptionPane.showInputDialog(null, "Digite um valor em graus, para converter em Fahrenheit "));

				if (celsius <= 0) {

					JOptionPane.showMessageDialog(null,
							"Não é possível inserir números negativos ou igual a zero ( 0 ) ");

					break;

				}

				else {

					JOptionPane.showMessageDialog(null, "Temperatura em Celsius = " + celsius + " °C"
							+ "\nTemperatura em Fahrenheit = " + converteTemperatura.conversao(celsius) + " °F");
				}

			} catch (NumberFormatException | NullPointerException erro) {

				JOptionPane.showMessageDialog(null,
						"Você digitou um dado inválido ou fechou o programa incorretamente");

				break;
			}

		} while (celsius > 0);

	}

}
