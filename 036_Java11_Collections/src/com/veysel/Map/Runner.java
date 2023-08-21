package com.veysel.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner {
public static void main(String[] args) {
	
	/*
	 * 
	 * List -> Arraylist -> okul no- adı- adres vs
	 * 
	 * okul numarasına göre öğrenci arama
	 * 
	 * ->1000//1 ms
	 * 
	 * Map<Key,value>mapList;
	 * 
	 * OKUL0001,{Muhammet,ankara,0 555 666 77 77}
	 * Orn:
	 * Map<String,String>-Map<Integer,String>-Map<Long,Ogrenci)-
	 * 
	 * 
	 */
	
	Map<String, String> ogrenciAdlari =new HashMap<String, String>();
	
	/*
	 * Map e eleman eklemek
	 */
	
	ogrenciAdlari.put("OKUL01","Muhammet");
	ogrenciAdlari.put("OKUL02","Ayhan");
	ogrenciAdlari.put("OKUL03","Demir");
	ogrenciAdlari.put("OKUL04","Bahar");
	ogrenciAdlari.put("OKUL05","Zeynep");
	ogrenciAdlari.put("OKUL06","Zeynep");
	//List içinden değer X.get(2)
//	ogrenciAdlari.forEach(System.out::println);
//	System.out.println(ogrenciAdlari.getOrDefault(ogrenciAdlari, null));
	
	/*
	 * 
	 * Map içinden değer okumak
	 * 	
	 */
	
	System.out.println("4.numaralı Ogrenci...: "+ogrenciAdlari.get("OKUL04"));
	System.out.println("3.numaralı Ogrenci...."+ogrenciAdlari.get("OKUL02"));	
	
	String uppercaseAd = ogrenciAdlari.get("OKUL04");
	uppercaseAd=ogrenciAdlari.getOrDefault("OKUL04","");
	uppercaseAd=uppercaseAd.toUpperCase();
	
	
	
	/*
	 * 
	 * Mapleri özel bir sıralanız yok ise for döngüsü ile dönmeniz
	 * pek münkün değildir.
	 * 
	 * Normal bir list array kullanıdğı için index verilerek size kullanımı ile 
	 * dönülebilir.
	 * 
	 * 
	 */
	
	List <String>gunler =Arrays.asList("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar");
	List<String> aylar = new ArrayList<>();
	List<String>mevsimler =new ArrayList<String>();
	
	
	Map<String,List<String>>zamanListeleri=new HashMap();
	
	zamanListeleri.put("Günler", gunler);
	zamanListeleri.put("aylar", aylar);
	zamanListeleri.put("mevsimler", mevsimler);
	
	System.out.println(zamanListeleri.get("Günler"));
	
	System.out.println("------------------------------------");
	/*
	 * 
	 * Var olan bir index için tekrar kayıt eklersem ne olur?
	 * Dikkat!!! Key-> anahtar değerler benzersizdir,tekrar etmezler
	 */
	
	
	
}
}
