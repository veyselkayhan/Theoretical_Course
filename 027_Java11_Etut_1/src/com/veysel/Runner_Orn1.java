package com.veysel;

import java.util.Scanner;

public class Runner_Orn1 {

	public static void main(String[] args) {
		/*
		 * 
		 * Belli bir aralıkta ki çift ve 5 e bölünebilen sayıların toplamını bulan algoritma ve kodu
		 * 
		 * 1...n
		 * n->kullanıcıdan
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("N sayısı");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
		
		if(i%2==0 && i%5==0) {
			sum+=i;
		}
		}
		System.out.println("Toplam "+sum);
	}

}
