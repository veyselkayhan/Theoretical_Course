package com.veysel;

import java.util.Scanner;

public class Runner_Ornek1 {

	public static void main(String[] args) {
		int secim = 0;

		do {
			System.out.println("************************");
			System.out.println("*****Hesap Makinesi*****");
			System.out.println("************************");
			System.err.println();
			System.out.println("1-Toplama");
			System.out.println("2-Çıkartma");
			System.out.println("3-Çarpma");
			System.out.println("4-Bölme");
			System.out.println("0-Cıkıs");
			secim=SecimYap();
			switch (secim) {
			case 1: {
				
				break;
			}
			case 2: {
				
				break;
			}
			case 3:
				break;
			case 4:
				break;
			case 0:

				break;
			default: {
				System.out.println("Geçersiz Değer");
				break;
			}
			}
		} while (secim != 0);
		System.out.println("Bye");
	}

	public static int SecimYap() {
		int secim = 0;
		boolean isException = false;
		do {
			try {
				System.out.println("Lütfen Secim Yapınız");
				Scanner sc = new Scanner(System.in);
				secim = sc.nextInt();
				return secim;

			} catch (Exception ex) {
				System.out.println("Lütfen Geçerli Sayısal Değer Giriniz");
				isException = true;
			}
		} while (isException);
		return secim;
	}
}
