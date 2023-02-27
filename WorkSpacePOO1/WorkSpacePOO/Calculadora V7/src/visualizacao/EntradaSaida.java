package visualizacao;
import javax.swing.JOptionPane;

public class EntradaSaida {
	public static int solicitaOperacao() {
		int operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a operação desejada: \n" + "1- Soma\n"
				+ "2- Subtração\n" + "3- Multiplicação\n" + "4- Divisão"));
		return operacao;
	}
// solicita um núemro que é representado por uma operação, e o retrona para a classe (Controladora) dentro da variavel operacao
	
	public static double solicitaNumero(String ordem) {
		double num = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + ordem + " número"));
		return num;
	}
// Solicita um numero ao usuario, que determinara quais serão os num1 e num2 dentro do códigom, a variavel ordem é determinada na calsse (Controladora)
	
	public static void mostraResultado(double resultado, int operacao) {
		String op = "";
		if (operacao == 1) {
			op = "soma";
		} else if (operacao == 2) {
			op = "Subtração";
		} else if (operacao == 3) {
			op = "Multiplicação";
		} else {
			op = "Divisão";
		}
		JOptionPane.showMessageDialog(null, "O resultado da " + op + " é: " + resultado);
	}
//  
}
