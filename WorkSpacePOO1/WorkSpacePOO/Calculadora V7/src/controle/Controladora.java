package controle;

import javax.swing.JOptionPane;
import modelo.*;// ver o que � isso
import visualizacao.EntradaSaida;// importando Classe EntradaSaida

public class Controladora {
	public void exibirMenu () {
		int continuar;
		double resultado = 0;
		Operacoes oper = null;// a variavel oper � um atributo da calsse operacoes

		do {
			double num1 = EntradaSaida.solicitaNumero("1�");//get do num1 
			double num2 = EntradaSaida.solicitaNumero("2�");//get do num2
			int operacao = EntradaSaida.solicitaOperacao();// get do operacao

			switch (operacao) {//escolha caso para qual operacao
			case 1:
				oper = new Soma();// oper � um atributo que recebe a classe filha (Soma) 
				break;
			case 2:
				oper = new Subtracao();// oper � um atributo que recebe a classe filha (Subtracao)
				break;
			case 3:
				oper = new Multiplicacao();// oper � um atributo que recebe a classe filha (Multiplicacao)
				break;
			case 4:
				while (num2 == 0) {
					num2 = EntradaSaida.solicitaNumero("2�");
				}
				oper = new Divisao();// oper � um atributo que recebe a classe filha (Divisao)
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opera��o invalida! A calculadora ser� encerrada");// Mensagem dita caso seja incerido qualquer outro numero
				System.exit(0);
			}
			oper.setNum1(num1);// set num1 dentro de Operacoes(classe)
			oper.setNum2(num2);// set num2 dentro de Operacoes(classe) 
			resultado = oper.calcula();// Voltando o resultado da operacao, que � feita no metodo calcula declarado antes pelo switch case, para a variavel resultado,
			EntradaSaida.mostraResultado(resultado,operacao);// mostra o resultado, que est� na classe EntradaSaida
			continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continur calculando? 1- Sim | 2- N�o"));

		} while (continuar == 1);
	}

}