package com.veysel;

import java.util.Arrays;
import java.util.Scanner;

public class Runner_Orn2 {

	public static void main(String[] args) {
		
		/*
		 * kullanıcıdan alınan sayıların 
		 * 1->2 ye bölünenleri 
		 * 2->en büyük 2 sayıyı 
		 * 3->ortalamasını 
		 * bulan kodları yazınız... 
		 * 
		 */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Kac Sayı Girilecektir");
		int s1=sc.nextInt();
		int max=0;
		int enbuyuk2=0;
		double toplam=0;
		int y=0;
		int[] array = new int[s1];//0,0,0,0,0
		int[] ikiyeBolunen = new int[s1];
		
		for(int i=0;i<=s1-1;i++) {
			System.out.println((i+1)+" Sayıyı Giriniz");
			array[i]=sc.nextInt();
			toplam+=array[i];
			
			if(array[i]%2==0) {
				ikiyeBolunen[y]=array[i];
			}
		}
		
		for (int j = 0; j < s1; j++) {
            if (array[j] > max) {
                enbuyuk2 = max; 
                max = array[j]; 
            } else if (array[j] > enbuyuk2 && array[j] < max) {
                enbuyuk2 = array[j]; 
            }
        }
		
		
		System.out.println("Ortalama :"+toplam/s1);
		System.out.println("Değerler"+Arrays.toString(array));
		System.out.println("İkiye Bölünenler :"+Arrays.toString(ikiyeBolunen));
		System.out.println("En büyük Sayı "+enbuyuk2);
		
	}
		
		
		

	}

