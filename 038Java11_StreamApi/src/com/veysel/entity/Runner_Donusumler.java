package com.veysel.entity;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Runner_Donusumler {

	public static void main(String[] args) {
		
		/*
		 * List -> TreeSet
		 * List -> HashMap
		 * Listeden map ya da setlere dönüşümlerde StreamApi kullanmak verimli olacaktır.
		 * Neden tür dönüşümü yapmalıyım ?
		 * 
		 * ArrayList genel olarak hızlı bir ekleme ve çalışma performansına sahiptir.Ancak arama işlemlerinde özellikle 
		 * Sınıf kullanılarak yapılan detay aramalarında oldukça yavaşlayabilir.Burada bahsi gecen 
		 * yavaşlık ms(1/1000) cinsinden.
		 * 
		 * 
		 * Arama işlemi 1ms de gercekleşir.10 000 adet satıs var toplamda 10 sn sürecektir.
		 * 
		 * 
		 * 
		 */

		
		List <String> ad = List.of("M","U","H","A","M","M","E","T");
		TreeSet<String> treeSetAd = ad.stream().collect(
				TreeSet::new,
				TreeSet::add,
				TreeSet::addAll
				);
		System.out.println(treeSetAd.toString());
		
		/*
		 * 
		 * variable -> var
		 * 
		 * var olarak tanımlanan bir değişken,ilk atamadan sonra o değişken türünü dönüşür.
		 * var k;
		 * var=15;
		 * buradan itibaren k değeri bir int değişkendir. ve değişmez.
		 */
		
		Object o;
		o=2345;
		o="Veysel";
		o=true;
		o=0.7321;
		o='A';
//		double toplam=34*(double)o; burda dönüştüremeyeceği için uygulama patlar.....
		var ob = "Murat";
		ob="veysel";
//		ob="123"; ilk değeri string olduğu için bundan sonraki değeri string;
		//  o objesini her şeye dönüştürdük.
		
		var varSetAd=ad.stream().collect(Collectors.toCollection(TreeSet::new));
		
		var isimListesi=List.of("Muhammet","Can","Demet","Elvan","Aykut","BahadırCan","Defne");
		
		/*
		 * Map<Key,Value>->String.Intger->ad,uzunluk.
		 * 
		 */
		
		Map<String,Integer>mapIsımListesi=isimListesi.stream().collect(Collectors.toMap( s-> s,String::length));
		
		System.out.println(mapIsımListesi);

		/*
		 * 
		 * İsim listesinde adlarının uzunluğu aynı olanları bir liste olarak tutsun k,v şeklinde map oluştursun...
		 * 
		 * Map<Integer,
		 * 
		 */
		
		
		Map<Integer,List<String>> mapUzunlukListesi = isimListesi.stream().collect(Collectors.groupingByConcurrent(String::length));
		
//		TreeMap<Integer,List<String>> treeMapUzunluk=isimListesi.stream().collect(Collectors.groupingBy(
//				String :: length,
//				TreeMap:: new,
//				Collectors.toList(),
//				);
		
//		System.out.println(treeMapUzunluk);
		
//		System.out.println(mapIsımListesi);
		
		
		
		
	}

}
