package br.com.zoologico.app;

import br.com.zoologico.classes.Animal;
import br.com.zoologico.classes.Cachorro;
import br.com.zoologico.classes.Gato;
import br.com.zoologico.classes.Veterinario;
import br.com.zoologico.classes.Zoologico;

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
		
		Zoologico zoo = new Zoologico();
		zoo.setNome("Zoologico do Anderson");
		
		Animal animal2 = new Gato("Zé", 3);
		
		zoo.adicionarAnimal(animal);
		zoo.adicionarAnimal(animal2);
		
		System.out.println("Animais do zoológico: " + zoo.getNome());
		zoo.listarAnimais();
		
		zoo.removerAnimal(0);
		
		System.out.println("Depois da remoção: ");
		
		zoo.listarAnimais();
		
		Veterinario vet = new Veterinario();
		vet.setNome("Junior");
		vet.atenderAnimal(animal);
		vet.listarAnimaisAtendidos();
		
		
	}
}
