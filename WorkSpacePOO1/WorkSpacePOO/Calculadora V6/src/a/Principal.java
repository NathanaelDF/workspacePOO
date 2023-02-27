package a;
import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {

		int continuar;// 
		double resultado = 0;// irá receber o resultado
		Operacoes oper = null;// irá receber toda a parte do calculo, requisitado pelo usuario

		do {
			double num1 = EntradaSaida.solicitaNumero("1°");// get no sistema do num1
			double num2 = EntradaSaida.solicitaNumero("2°");// get no sistema do num2  
			int operacao = EntradaSaida.solicitaOperacao();// escolhendo qual opeção para o switch funcionar

			switch (operacao) {
			case 1:
				oper = new Soma();// chama dentro  da variael oper, a classe soma
				break;
			case 2:
				oper = new Subtracao();// chama dentro da variavel oper, a classe subtração
				break;
			case 3:
				oper = new Multiplicacao();// chama detro da variavel oper, a classe multiplicacao
				break;
			case 4:
				while (num2 == 0) {
					num2 = EntradaSaida.solicitaNumero("2°");
				}
				oper = new Divisao(); // chama dentro da variavel oper, a calsse divisao
				break;
			default:
				JOptionPane.showMessageDialog(null, "Operação invalida! A calculadora será encerrada");
				System.exit(0);
			}
			oper.setNum1(num1);// set do num1 dentro do oper
			oper.setNum2(num2);// set do num2 dentro do oper
			resultado = oper.calcula();// Voltando o resultado da operacao, que é feita no metodo calcula declarado antes pelo switch case, para a variavel resultado,
			EntradaSaida.mostraResultado(resultado,operacao);// mostra o resultado chamando o método mostraResulato
			continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continur calculando? 1- Sim | 2- Não"));// vê se o usuario que rou não continuar a calcular

		} while (continuar == 1);
	}
}
