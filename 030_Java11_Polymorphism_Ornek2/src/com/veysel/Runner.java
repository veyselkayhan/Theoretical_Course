package com.veysel;

import java.util.Scanner;

import com.veysel.entity.De;
import com.veysel.entity.Eng;
import com.veysel.entity.Fr;
import com.veysel.entity.IDil;
import com.veysel.entity.Tr;

public class Runner {
	public static void main(String[] args) {
		/*
		 * Yabancı dil Dönüşüm Örneği...
		 */

		int secim;
		do {
			System.out.println("*********************************");
			System.out.println("***Yabancı Dil Kelime Kartları***");
			System.out.println("*********************************");
			System.out.println();
			System.out.println("1-Türkçe");
			System.out.println("2-İngilizce");
			System.out.println("3-Almanca");
			System.out.println("4-Fransızca");
			System.out.println("0-Çıkış");
			System.out.println();
			Scanner sc = new Scanner(System.in);
			System.out.println("Secim");
			secim = sc.nextInt();
			IDil dil = null;
			
			switch (secim) {
			case 1:dil=new Tr();break;
			case 2:dil=new Eng();break;
			case 3:dil=new De();break;
			case 4:dil=new Fr();break;
			case 0:System.out.println("Çıktık");break;
			default:
			}
			System.out.println(dil.getMerhaba());
			System.out.println(dil.getNereyeGidiyorsun());
			System.out.println(dil.getGuleGule());
			
		} while (secim != 0);
	}
}
