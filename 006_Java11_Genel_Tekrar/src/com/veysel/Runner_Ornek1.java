package com.veysel;

import java.util.Scanner;

public class Runner_Ornek1 {

	public static void main(String[] args) {
		/*
		 * Ekrana aşağıdaki şekli çiziniz
		 * 
		 * **** **** **** **** kurallar,dögüler kullanılacak.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Kare Ciz boyutu giriniz");
		int boyut = sc.nextInt();

		for (int i = 1; i <= boyut * boyut; i++) {
			System.out.print("* ");
			if (i % boyut == 0) {
				System.out.println(" ");
			}
		}
		sc.close();
	}
}
