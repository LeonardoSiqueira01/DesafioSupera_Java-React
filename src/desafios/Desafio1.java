package desafios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> numerosPar = new ArrayList<>();
		List<Integer> numerosImpar = new ArrayList<>();
		List<Integer> TodosNumeros = new ArrayList<>();

		int n = sc.nextInt();
		int numero;

		for (int i = 1; i <= n; i++) {
			numero = sc.nextInt();
			if (numero % 2 == 0) {
				numerosPar.add(numero);
			} else {
				numerosImpar.add(numero);
			}
		}
		Collections.sort(numerosPar);
		Collections.sort(numerosImpar);
		Collections.reverse(numerosImpar);

		for (Integer par : numerosPar) {
			TodosNumeros.add(par);
		}
		for (Integer impar : numerosImpar) {

			TodosNumeros.add(impar);
		}

		for (Integer todosNumeros : TodosNumeros) {
			System.out.println(todosNumeros);
		}
		sc.close();
	}

}
