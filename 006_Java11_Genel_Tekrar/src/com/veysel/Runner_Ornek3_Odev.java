package com.veysel;

import java.util.Scanner;

public class Runner_Ornek3_Odev {

	public static void main(String[] args) {
		/*
		 * 
		 * . . . . . 
		 * . . . . . 
		 * . . * . . 
		 * . . . . . 
		 * . . . . .
		 * 
		 * yukarıda görülen şekilde * şekli hareket halindedir ve sürekli hareket
		 * edebilir.Hareket etmesi sağlayan rakamlar şu şekilde tanımlanır.
		 * 
		 *   8 
		 * 4   6 
		 *   2
		 * 
		 * 8->Yukarı 2->Aşagı 4->Sola 6->Saga
		 *
		 * Başlangıç Noktası en üsteki gibi
		 *
		 * Eğer bir yön gidiş noktası bitmiş ise diğer taraftan başa dönerek ilerler
		 *
		 * Orn: hareket yönü--->6
		 *
		 * . . . . . 
		 * . . . . . 
		 * . . . * . 
		 * . . . . . 
		 * . . . . .
		 * 
		 * hareket yönü ---2 
		 * . . . . . 
		 * . . . . . 
		 * . . . . . 
		 * . . . * . 
		 * . . . . .
		 * 
		 * 
		 * bu şekilde çalışacak hiç durmayan sonsuz kayan nokta
		 * 
		 * 
		 * 
		 */

		//
		boolean a = true;
		int y=3;
		int x=3;
		Scanner sc=new Scanner(System.in);
		do {
			
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=5;j++) {
					if(i==y && j==x) {
						System.out.print("* ");
					}
					else {
					System.out.print(". ");}
				}
				System.out.println(" ");	
				
				}
			
			

			System.out.println("Menu Yukari:8 Asagi:2 Sol:4 Sag:6 Cikis=0");	
			System.out.print("Yön");
			int yon=sc.nextInt();
			switch(yon) {
			
			case 2:
				if(y==5){
					y=0;
				}
				y++;
				break;
			case 4:
				if (x==1) {
					x=6;
				}
				x--;
				break;
			case 6:
				if (x==5) {
					x=0;
				}
				x++;
				break;
			case 8:
				if(y==1) {
					y=6;
				}
				y--;
				break;
			case 0:
				a=false;// while ı bozmak için a 1 yapıldı bu sayede cıkıs oldu.
				break;
			default:
				System.out.println("Geçersiz İşlem");
			}
			
			
			

		} while (a);//while her zaman true olduğu sürece döner.
		System.out.print("Cıkıs Yapıldı");
       sc.close();
		//8 dediği zaman i--(y)
		//2 dediğinde i++(y)
		//4 dediğin j--(x)
		//6 dediğinde j++(x)
	}

}
