package com.veysel.Set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Runner {
	/*
	 * Set-> benzersiz kayıtlar tutmak ve renkli olduğunda sıralı bir şekilde
	 * kayıtlar tutmak için kullanılan listelerdir.
	 * 
	 * 
	 * -->Bir firma günlük satışlarında satılan ürünlerin listesini ve adedini
	 * görmek istiyor diyelim buradan bir gün içinde üründen 500 adet satılmış
	 * olabilir.Toplam satış sayısı 10.000 adet ürün olabilir.Ancak satılan farklı
	 * ürün sayısı 15 olabilir.
	 * 
	 */

	public static void main(String[] args) {
		
		Set<String>urunSatısListesi=new LinkedHashSet<String>();
		urunSatısListesi.add("Ekmek");
		urunSatısListesi.add("Ekmek");
		urunSatısListesi.add("Ekmek");
		urunSatısListesi.add("Ekmek");
		urunSatısListesi.add("Ekmek");
		urunSatısListesi.add("Şeker");		
		urunSatısListesi.add("un");
		
		urunSatısListesi.forEach(System.out::println); 
		System.out.println("==============");
		Set<String>setList=new TreeSet();
		SortedSet<String>sortSetList=new TreeSet<String>();
		setList.add("Muhammet");
		setList.add("Ali");
		setList.add("Ahmet");
		setList.add("Hakan");
		setList.add("Hakan");
		setList.add("Turan");
		System.out.println("Normal Set");
		
		System.out.println("----------------------");
		System.out.println("Sorted Set");
		setList.forEach(System.out::println);
		
		
		Set<String>setTreeList = new TreeSet<String>();
	
	
	}
	

}
