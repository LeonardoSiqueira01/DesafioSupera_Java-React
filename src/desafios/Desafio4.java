package desafios;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N= sc.nextInt();
		for(int i=0; i<= N ; i++) {
		String texto = sc.nextLine();
		StringBuilder pt1 = new StringBuilder(texto.substring(0, texto.length()/2));
		StringBuilder pt2 = new StringBuilder(texto.substring(texto.length()/2, texto.length()));
		 	pt1.reverse();
		 	pt2.reverse();
		System.out.println(pt1.toString() + pt2.toString());

	}		sc.close();
}
}