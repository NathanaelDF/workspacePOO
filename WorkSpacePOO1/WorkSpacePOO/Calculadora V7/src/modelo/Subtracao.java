package modelo;
public class Subtracao extends Operacoes {
	public double calcula() {// Usando uma classe intanciada (IOperacoes), dentro da calsse mãe (Operacoes).
		double subtracao = num1 - num2;// num1 e num 2 herdados da calsse mãe.
		return subtracao;//retrona o valor para a classe (Controladora) dentro da variavel oper
	}
}
