package a;
import javax.swing.JOptionPane;

public class EntradaSaida {
	public static int solicitaOperacao() {
		int operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opera��o desejada: \n" + "1- Soma\n"
				+ "2- Subtra��o\n" + "3- Multiplica��o\n" + "4- Divis�o"));
		return operacao;
	}
// solicita um n�mero que ser� usado no switch
	public static double solicitaNumero(String ordem) {
		double num = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + ordem + " n�mero"));
		return num;
	}
// solicita um num, que ser� colocando para dentro do sistema, num1 e num2
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
// mostra o resultado da oper��o 
}
