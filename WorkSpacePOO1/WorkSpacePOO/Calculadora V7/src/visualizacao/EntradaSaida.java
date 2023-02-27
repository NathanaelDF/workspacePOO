package visualizacao;
import javax.swing.JOptionPane;

public class EntradaSaida {
	public static int solicitaOperacao() {
		int operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opera��o desejada: \n" + "1- Soma\n"
				+ "2- Subtra��o\n" + "3- Multiplica��o\n" + "4- Divis�o"));
		return operacao;
	}
// solicita um n�emro que � representado por uma opera��o, e o retrona para a classe (Controladora) dentro da variavel operacao
	
	public static double solicitaNumero(String ordem) {
		double num = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + ordem + " n�mero"));
		return num;
	}
// Solicita um numero ao usuario, que determinara quais ser�o os num1 e num2 dentro do c�digom, a variavel ordem � determinada na calsse (Controladora)
	
	public static void mostraResultado(double resultado, int operacao) {
		String op = "";
		if (operacao == 1) {
			op = "soma";
		} else if (operacao == 2) {
			op = "Subtra��o";
		} else if (operacao == 3) {
			op = "Multiplica��o";
		} else {
			op = "Divis�o";
		}
		JOptionPane.showMessageDialog(null, "O resultado da " + op + " �: " + resultado);
	}
//  
}
