package funcional_interface.exemplos;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */

public class SupplierExemplo {
	public static void main(String[] args) {
		// usa o supplier com expresasao lambda para ofrnecer uma saudacao personalizada
		
		Supplier<String> saudacao = () -> "Olá, seja bem vindo";
		
		//usa o supplier para obter uma lista com 5 saudacoes
		
		List<String> listaSaudacoes = Stream.generate(
				() -> "Olá, seja bem vindo")
				.limit(5)
				.collect(Collectors.toList());
		
		//imprimir saudacoes gravadas
		
		listaSaudacoes.forEach(System.out::println);
				
	}
}
