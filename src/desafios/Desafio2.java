package desafios;

import java.util.Locale;
import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		double valor = sc.nextDouble();
		int nt100 = 0, nt50 = 0, nt20 = 0, nt10 = 0, nt5 = 0, nt2 = 0;
		float md1 = 0, md50 = 0, md25 = 0, md10 = 0, md5 = 0, md01 = 0;

		while (valor >= 100) {
			nt100 = nt100 + 1;
			valor = valor - 100;
		}
		while (valor >= 50) {
			nt50 = nt50 + 1;
			valor = valor - 50;
		}
		while (valor >= 20) {
			nt20 = nt20 + 1;
			valor = valor - 20;
		}
		while (valor >= 10) {
			nt10 = nt10 + 1;
			valor = valor - 10;
		}
		while (valor >= 5) {
			nt5 = nt5 + 1;
			valor = valor - 5;
		}
		while (valor >= 2) {
			nt2 = nt2 + 1;
			valor = valor - 2;
		}
		while (valor >= 1) {
			md1 = md1 + 1;
			valor = valor - 1;
		}
		while (valor >= 0.50) {
			md50 = md50 + 1;
			valor = valor - 0.50;
		}
		while (valor >= 0.25) {
			md25 = md25 + 1;
			valor = valor - 0.25;
		}
		while (valor >= 0.10) {
			md10 = md10 + 1;
			valor = valor - 0.10;
		}
		while (valor >= 0.05) {
			md5 = md5 + 1;
			valor = valor - 0.05;
		}
		while (valor >= 0.01) {
			md01 = md01 + 1;
			valor = valor - 0.01;
		}
		System.out.println("NOTAS: ");
		System.out.println(nt100 + " nota(s) de R$ 100.00");
		System.out.println(nt50 + " nota(s) de R$ 50.00");
		System.out.println(nt20 + " nota(s) de R$ 20.00");
		System.out.println(nt10 + " nota(s) de R$ 10.00");
		System.out.println(nt5 + " nota(s) de R$ 5.00");
		System.out.println(nt2 + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(md1 + " moeda(s) de R$ 1.00");
		System.out.println(md50 + " moeda(s) de R$ 0.50");
		System.out.println(md25 + " moeda(s) de R$ 0.25");
		System.out.println(md10 + " moeda(s) de R$ 0.10");
		System.out.println(md5 + " moeda(s) de R$ 0.05");
		System.out.println(md01 + " moeda(s) de R$ 0.01");
		sc.close();
	}

}
