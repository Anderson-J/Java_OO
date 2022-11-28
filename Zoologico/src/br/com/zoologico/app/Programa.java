package br.com.zoologico.app;

import br.com.zoologico.classes.Animal;
import br.com.zoologico.classes.Cachorro;
import br.com.zoologico.classes.Gato;

public class Programa {

	public static void main(String[] args) {
		// Polimorfismo
		Animal animal = new Cachorro("Totó", 1, "Cachorro");
		System.out.println("Olá, seu animal é: " + animal.getEspecie() + ", o nome do animal é: " + animal.getNome() + " e ele tem: " + animal.getIdade() + " ano(s)");
		
		Gato gato = new Gato("Zé", 1);
		System.out.println("Olá, seu animal é: " + gato.getEspecie() + ", o nome do animal é: " + gato.getNome() + " e ele tem: " + gato.getIdade() + " ano(s)");
		
		
		if(animal.ehAdulto()) {
			System.out.println("Cachorro adulto");
		} else {
			System.out.println("Cachorro não é adulto");
		}
		
		if(gato.ehAdulto()) {
			System.out.println("Gato Adulto");
		} else {
			System.out.println("Gato não é adulto");
		}
		
		System.out.println("==========");
		animal.emitirBarulho();
		gato.emitirBarulho();
	
		System.out.println("**********");
		animal.morrer();
		gato.morrer();
		
		animal.emitirBarulho();
		gato.emitirBarulho();
		

	}
}
