package com.veysel.Queue;

import java.util.PriorityQueue;

public class RunnerPriorityQueue {

	public static void main(String[] args) {
		/*
		 * Queue -> Kuyruk,herhangi bir sıranın kuyruk şeklinde oluşturulmasıdır.
		 * 
		 * Orn->Hastahane Sırası;
		 * Starbucks Sırası;
		 * Üç Harfli Mağaza Sırası;
		 * 
		 * Queue->FIFO->İlk Giren İlk Çıkar
		 * Stack->LIFO->Son Giren İlk Çıkar
		 */
		
		PriorityQueue<Integer>oncelikliKuyrukListesi=new PriorityQueue<Integer>();

		oncelikliKuyrukListesi.add(200);
		oncelikliKuyrukListesi.add(20);
		oncelikliKuyrukListesi.add(13);
		oncelikliKuyrukListesi.add(-2);
		oncelikliKuyrukListesi.add(45);
		oncelikliKuyrukListesi.add(9);
		System.out.println(oncelikliKuyrukListesi.toString());
		System.out.println("-----------------------");
		oncelikliKuyrukListesi.forEach(System.out::println);
		System.out.println("---------------------------------");
		System.out.println(oncelikliKuyrukListesi.remove());
		
		
		
		
		
	}

}
