package com.veysel;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		int[] array = new int[10];

		for (int i = 0; i < 10; i++) {

			System.out.println((i + 1) + " Sayıyı Giriniz");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			array[i] = number;

		}

		for (int i = 0; i < 10; i++) {

			System.out.print("-" + array[i]);

		}

	}

}
