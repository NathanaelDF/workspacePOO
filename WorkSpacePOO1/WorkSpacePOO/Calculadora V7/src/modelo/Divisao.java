package modelo;

public class Divisao extends Operacoes {
	public double calcula() {// Usando uma classe instanciada (IOperacoes), dentro da classe m�e (Operacoes).
		double divi = num1 / num2;// num1 e num2 herdados da classe m�e.
		return divi;// retorna o valor para a calsse (Controladora) dentro da variavel oper.
	}
}
