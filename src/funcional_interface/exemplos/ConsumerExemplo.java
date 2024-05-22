package funcional_interface.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */

public class ConsumerExemplo {
	public static void main(String[] args) {
		// criar lista de números inteiros
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6 ,7 , 8);

		// usar o consumer com expressao lambda para imprimir os numeros
		Consumer<Integer> imprimindoNumeroPar = numero -> {
			if (numero % 2 == 0) {
				System.out.println(numero + " ");
			}
		};

		// Usar o Consumer para imprimir os numeors pares no stream
		numeros.stream().filter(n -> n % 2 == 0)
		.forEach(System.out::println);
	}
}
