package br.com.zoologico.classes;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	
	private String nome;
	private List<Animal> animais;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Zoologico() {
		animais = new ArrayList<Animal>();
	}
	
	public void adicionarAnimal(Animal animalASerAdicionado) {
		animais.add(animalASerAdicionado);
	}
	
	public void removerAnimal(int indiceDoAnimal) {
		animais.remove(indiceDoAnimal);
	}
	
	public void listarAnimais() {
		System.out.println("Animais do Zoologico: ");
		for (int i = 0; i < animais.size(); i++) {
			System.out.println("   -" + animais.get(i).getNome());
		}
	}
	
}
