package modelo;

public class Multiplicacao  extends Operacoes {
	public double calcula() {// Usando uma classe instanciada (IOperacoes), dentro da classe m�e (Operacoes).
		double mult = num1 * num2;// num1 e num2 herdados da classe m�e.
		return mult;//retrona o valor para a classe (Controladora) dentro da variavel oper
	}
}
