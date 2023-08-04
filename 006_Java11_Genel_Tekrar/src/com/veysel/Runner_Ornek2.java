package com.veysel;

import java.util.Scanner;

public class Runner_Ornek2 {

	public static void main(String[] args) {
		/*
		 * Aşagıdaki gördüğünüz şekli girdiği büyüklüğe göre çiziniz
		 * 
		 * boyut-5
		 * 
		 * * * * * * * * * * * * * * * * *
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Kare Ciz boyutu giriniz");
		int boyut = sc.nextInt();

		for (int i = 1; i <= boyut * boyut; i++) {
			if (i % boyut == 0 || i % boyut == 1 || i <= boyut || i >= boyut * boyut - boyut)
				System.out.print("* ");
			else
				System.out.print("  ");
			if (i % boyut == 0)
				System.out.println("");
		}
		sc.close();

	}

}
