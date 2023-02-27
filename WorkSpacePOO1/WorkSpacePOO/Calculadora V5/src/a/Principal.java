package a;
import javax.swing.JOptionPane;

public class Principal {

	private static Operacoes oper = new Operacoes();
	
	public static void main(String[] args) {

		int continuar;
		double resultado = 0;

		do {
			double num1 = EntradaSaida.solicitaNumero("1�");
			double num2 = EntradaSaida.solicitaNumero("2�");
			int operacao = EntradaSaida.solicitaOperacao();

			switch (operacao) {
			case 1:
				Soma soma = new Soma();
				soma.setNum1(num1);
				soma.setNum2(num2);
				resultado = soma.calcula();
				break;
			case 2:
				Subtracao subtracao = new Subtracao();
				subtracao.setNum1(num1);
				subtracao.setNum2(num2);
				resultado = subtracao.calcula();
				break;
			case 3:
				Multiplicacao multi = new Multiplicacao();
				multi.setNum1(num1);
				multi.setNum2(num2);
				resultado = multi.calcula();
				break;
			case 4:
				while (num2 == 0) {
					num2 = EntradaSaida.solicitaNumero("2�");
				}
				Divisao divi = new Divisao();
				divi.setNum1(num1);
				divi.setNum2(num2);
				resultado = divi.calcula();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opera��o invalida! A calculadora ser� encerrada");
				System.exit(0);
			}
			EntradaSaida.mostraResultado(resultado,operacao);
			continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continur calculando? 1- Sim | 2- N�o"));

		} while (continuar == 1);
	}
}
