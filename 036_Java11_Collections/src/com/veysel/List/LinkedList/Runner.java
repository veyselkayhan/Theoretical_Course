package com.veysel.List.LinkedList;

import java.util.LinkedList;

public class Runner {

	/*
	 * Çok bicimlilikte miras alınan sınıf ya da interface taşıdığı arayüzler
	 * kullanılır.
	 * 
	 * 
	 * Yani methodlar aktiftir.Turetilmiş sınıfın içine olan methodlar kullanılamaz.
	 * Bu nedenle eğer bir listenin kendi özelliklerini kullanmak istiyorsanız onun polymorphismden
	 * cıkartarak kendi sınıfın referans ile kullanın.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		LinkedList<String>bagliListe=new LinkedList<String>();
		bagliListe.add("Muhammet");
		bagliListe.add("Demir");
		bagliListe.add("Bahar");
		bagliListe.add("Demet");
		
//		bagliListe.forEach(System.out::println);//hepsini yazar
//		
//		System.out.println("---------------------");
//		System.out.println(bagliListe.get(2));//bahar
		
		bagliListe.push("Tessssst");
		bagliListe.add("Bu nedir");
	
		System.out.println("------------------");
		bagliListe.forEach(System.out:: println);
		System.out.println("---------------");
		System.out.println(bagliListe.pop());
		System.out.println("---------------------");
		bagliListe.forEach(System.out:: println);// 0.indexi çıkarttı
		System.out.println(bagliListe.peek());//0.ıncı indexi yazdırır.
		bagliListe.peek();
	
	
	}
}
