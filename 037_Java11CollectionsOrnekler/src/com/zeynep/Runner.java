package com.zeynep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zeynep.Ornek3.KategoriList;
import com.zeynep.Ornek3.Urun;

public class Runner {

	public static void main(String[] args) {
		
		List<Urun>urunList= new ArrayList<Urun>();
	
		
		
		List<KategoriList>kategoriLists= new ArrayList<KategoriList>();
		kategoriLists.add(KategoriList.ERKEK);
		kategoriLists.add(KategoriList.KADIN);
		kategoriLists.add(KategoriList.COCUK);
		kategoriLists.add(KategoriList.UNISEX);
		
		kategoriLists.forEach(System.out::println);
		System.out.println("-----------------");
		urunList.add(new Urun("Ayakkabı", "AB001", 123.5, 12, kategoriLists.get(0)));
		urunList.add(new Urun("Şort", "AA2", 126.5, 13, kategoriLists.get(1)));
		urunList.add(new Urun("Etek", "AA3", 112.5, 5, kategoriLists.get(2)));
		
		Map<KategoriList, List<Urun>> urunMap = new HashMap<KategoriList, List<Urun>>();
		
		
		List<Urun> erkekUrun = new ArrayList<Urun>();
		urunMap.put(KategoriList.ERKEK, urunList);
		System.out.println("Erkek Ürünleri");
		urunMap.get(KategoriList.ERKEK).forEach(System.out::println);

		
		
		
		
	}

}
