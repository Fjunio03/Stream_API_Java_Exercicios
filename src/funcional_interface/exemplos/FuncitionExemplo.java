package funcional_interface.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */

public class FuncitionExemplo {
	public static void main(String[] args) {
		//criando lista de numeros inteiros
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,25);
		
		//usar a function com expressao lambda para dobrar todos os numeros
		
		//Function<Integer, Integer> dobrar = numero -> numero * 2; FUNCIONA TAMBEM !!!!!
		
		//usar a funcao para dobrtar todos os numeros no Stream e armazena-los em outra lista
		
		List<Integer> numerosDobrados = numeros.stream()
				.map( n -> n * 2 )
				.toList();
		
		//imprimir a lista de numeros
		numerosDobrados.forEach(System.out::println);
	}
}
