package modelo;

public abstract class Operacoes implements IOperacao {
	protected double num1;// variavel que s� pode ser acesada pelas classes filhas de Operacoes(classe)
	protected double num2;// variavel que s� pode ser acesada pelas classes filhas de Operacoes(classe)
	
	public double getNum1() {
		return this.num1;
	}
	//pega o n�mero dentro da controladora, e o armazena dentro da classe m�e, num1.
		
	public void setNum1 (double num1) {
		this.num1=num1;
	}
	//pega o num1 e distribui para suas classes filhas
	
	public double getNum2() {
		return this.num2;
	}
	//pega o n�mero dentro da controladora, e o armazena dentro da classe m�e, num2.
	
	public void setNum2(double num2) {
		this.num2=num2;
	}
	//pega o num2 e distribui para suas classes filhas


}
