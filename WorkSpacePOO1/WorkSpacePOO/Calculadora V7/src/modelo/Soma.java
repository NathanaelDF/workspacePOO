package modelo;

public class Soma extends Operacoes {
	public double calcula() {// Usando uma classe intanciada (IOperacoes), dentro da calsse m�e (Operacoes).
		double soma = num1 + num2;// num1 e num 2 herdados da calsse m�e.
		return soma;//retrona o valor para a classe (Controladora) dentro da variavel oper.
	}
}
