package com.codegirls;

import com.model.Gato;

public class PrimeiraAula {

	public static void main(String[] args) {
		
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		
		/*int a = 2;
		int b = 3;
		System.out.println("Hello World! " + (a+b));*/

	}

}

class Livros {
	private String nome;
	private String npag;
}