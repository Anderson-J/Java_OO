package br.com.zoologico.classes;

public abstract class Animal implements Animavel {
	private String nome;
	private String especie;
	protected int idade;
	protected boolean estaVivo;
	
	public String getNome() {
		return nome;
	}

	public String getEspecie() {
		return especie;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public boolean estaVivo() {
		return estaVivo;
	}
	
	public Animal(String nome, int idade, String especie) {
		this.nome = nome;
		this.idade = idade;
		this.especie = especie;
		this.estaVivo = true;
	}
	
	public Animal(String nome) {
		this.nome = nome;
		this.estaVivo = true;
	}
	
	@Override
	public abstract void emitirBarulho();
	
	@Override
	public boolean ehAdulto() {
		if(estaVivo()) {
			return idade >= 1;
		} else {
			return false;
		}
	}
	
	@Override	
	public final void morrer() {
		this.estaVivo = false;
	}
}
