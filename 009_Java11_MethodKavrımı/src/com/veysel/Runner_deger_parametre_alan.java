package com.veysel;

import java.util.Scanner;

public class Runner_deger_parametre_alan {

	public static void main(String[] args) {
		
	/*
	 * pi sayısı sabit değişmeyen sayılara müdahele ile kapatmalıyız.
	 * 	
	 */
		int secim;
		do {
		ekranaYaz();
		secim=secimyap();
		switch(secim) {
		case 1:System.out.println(dikdortgenAlani(5, 12));break; 
		case 2:System.out.println(daireninAlani(6));break; 
		case 0:System.out.println("Çıkış");break;
		default:System.err.println("Geçersiz İşlem");
		}
		
		}
		while(secim!=0);
		
		
	}
	
	private static final double PI=3.14;// pi kullanımı bu şekilde.
	
	static void ekranaYaz() {
		System.out.println("**********************");
		System.out.println("****Alan Hesaplama****");
		System.out.println("**********************");
		System.out.println();
		System.out.println("1-Dikdörtgenin Alanı");
		System.out.println("2-Dairenin Alanı");
		System.out.println("0-Çıkış");
		
		
		
	}
	static int secimyap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Secim");
		int secim=sc.nextInt();
		sc.nextLine();
		return secim;
	}
	
	
	
	static int dikdortgenAlani(int w,int h) {
		int alan=w*h;
		return alan;
	}
	
	static double daireninAlani(int r) {
		
		double alan=PI*r*r;
		return alan;
	}

}
