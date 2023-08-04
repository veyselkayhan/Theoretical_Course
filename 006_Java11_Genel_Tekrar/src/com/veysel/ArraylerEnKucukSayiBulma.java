package com.veysel;

import java.util.Arrays;
import java.util.Scanner;

public class ArraylerEnKucukSayiBulma {

	public static void main(String[] args) {

		System.out.println("Kaç adet Sayı");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int[] array = new int[i];

		for (int j = 0; j < array.length; j++) {
			System.out.println((j + 1) + ".sayı");
			int number = sc.nextInt();
			array[j] = number;
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Çıkış");
	}

}
