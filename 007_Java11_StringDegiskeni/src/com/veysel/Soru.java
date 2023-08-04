package com.veysel;

import java.util.Scanner;

public class Soru {

	public static void main(String[] args) {
		/*
		 * aşagıdaki çıktıyı kodlayınız..
		 * 
		 * adınız..:Muhammet
		 * 
		 * t
		 * et
		 * met
		 * ammet
		 * hammet
		 * uhammet
		 * muhammet
		 * 
		 * ismi yazınca bu şekilde yazdıran kod.
		 */

		Scanner sc=new Scanner(System.in);
		
		System.out.print("İsminiz ");
		String isim=sc.next();
		
		for(int i = isim.length()-1 ; i >=0; i--) {
			
			System.out.println(isim.substring(i,isim.length()));
			}
		
		
	}

}
