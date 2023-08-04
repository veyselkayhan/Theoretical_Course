package com.veysel;

import java.util.Scanner;

public class Runner_Orn3 {

	public static void main(String[] args) {
		/*
		 * 
		 * 1 den n e kadar olan sayıları arama yapacaksınız.
		 * bu sayılardan düzden ve tersten okunuşu aynı olan sayıları ekrana yazdıran kodu yazınız.
		 * 
		 * 22,33,44,55
		 * 121,323 vs...
		 * 
		 */
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Aralık Giriniz...:");
		int n=sc.nextInt();
		for(int i=10;i<=n;i++) {
	
			if(polidrom(i)) {
				System.out.println(i);
			}
		}
		
		
	
	}
	
	public static boolean polidrom(int sayi) {
		
		String strSayi=String.valueOf(sayi);
		int baslangic=0;
		int son=strSayi.length()-1;
		
		
		while(baslangic<son) {
			if(strSayi.charAt(baslangic)!= (strSayi.charAt(son))){
				
				return false;
			}
			baslangic++;
			son--;
		}
		
	return true;
	}

}
