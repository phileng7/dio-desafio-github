package br.com.dio;

import br.com.dio.model.Gato;

public class FirstProgram {

	public static void main(String[] args) {
		Livro livro = new Livro();
		Gato gato = new Gato();
		System.out.println("Teste de Git");
	}

}
class Livro{
	public String livro;
	public Integer numPaginas;
}