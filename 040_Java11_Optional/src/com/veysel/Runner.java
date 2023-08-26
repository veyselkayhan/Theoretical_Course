package com.veysel;

import java.util.Optional;

public class Runner {

	
	static Optional<Ogrenci>ogrenciKutusu=Optional.empty();
	
	

	public static void main(String[] args) {
/*
 * 
 * Optional -> Bir değişkeni sarmalayarak onun içinde var olup olmadığını
 * kontrol eder,
 * 
 * 
 */
		
		ogrenciKutusu= Optional.of(new Ogrenci("Ahmet Taş"));
		if(ogrenciKutusu.isPresent()) {
			System.out.println(ogrenciKutusu.toString());
			System.out.println("Ogrenci id..:" + ogrenciKutusu.get().getId());
			System.out.println("Ogrenci id..:" + ogrenciKutusu.get().getAd());
		}
		
		
		if(ogrenciKutusu.isEmpty()) {
			System.err.println("Öğrenci nesnesi boş");
		}
		
		/*
		 * ifPresent-> Eğer bir nesnenin varlığı kesin olduğunda
		 * işlem yapılacak ve diğer durumlarda işlem yapılmayacak ise
		 * bunu kullanırız.
		 * 
		 */
		
		ogrenciKutusu.ifPresentOrElse(o->{
			System.out.println("Öğrenci....."+o.getAd());
		},()->{
			System.out.println("Ogrenci yoktur bu nedenle işlem yapılamamıştır");
		});
		/*
		 * 
		 * Eğer bir nesnenin hem var olma hemde olmama durumlarında
		 * işlem yapmak istiyorsanız
		 * ifPresentorElse kullanılır..
		 * 
		 */
	}

}
