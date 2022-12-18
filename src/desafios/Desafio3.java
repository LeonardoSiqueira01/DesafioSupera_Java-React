package desafios;

import java.util.Scanner;

public class Desafio3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int saida = 0;
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = n - 1; j >= 0; j--) {
				if (arr[i] - arr[j] == k) {
					saida = saida + 1;
				}
			}
		}
		System.out.println(saida);
		sc.close();
	}

}
