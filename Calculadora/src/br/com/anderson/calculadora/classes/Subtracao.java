package br.com.anderson.calculadora.classes;

public class Subtracao extends CalculoMatematico {

	public Subtracao(int numero1, int numero2) {
		super(numero1, numero2);
	}

	@Override
	protected int doCalcular() {
		return numero1  - numero2;
	}
	
	@Override
	public Boolean validar() {
		return numero1 >= 0 && numero2 >= 0 && numero1 >= numero2;
	}
	
}
