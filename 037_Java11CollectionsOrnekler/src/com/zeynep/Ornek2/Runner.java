package com.zeynep.Ornek2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zeynep.Ornek2.entity.Kategoriler;

public class Runner {

	public static void main(String[] args) {
		
		List<Kategoriler> kategoriList = new ArrayList<>();
		Kategoriler giyim = new Kategoriler("Giyim");
		Kategoriler kirtasiye = new Kategoriler("Kırtasiye");
		Kategoriler elektronik = new Kategoriler("Elektronik");
		kategoriList.add(giyim);
		kategoriList.add(kirtasiye);
		kategoriList.add(elektronik);

		List<String> giyimAltKategoriler = new ArrayList<>();
		giyimAltKategoriler.add("Aksesuar");
		giyimAltKategoriler.add("Ayakkabı");
		giyimAltKategoriler.add("Çanta");

//		Map<Kategoriler, List<String>> kategoriMap = new HashMap<>();
//		kategoriMap.put("Giyim", giyimAltKategoriler);

		////////////////////////////////////////////////

		List<String> anaKategoriler = new ArrayList<>();
		anaKategoriler.add("Giyim");
		anaKategoriler.add("Kırtasiye");
		anaKategoriler.add("Elektronik");

		List<String> giyimKategoriler = new ArrayList<>();
		giyimKategoriler.add("Aksesuar");
		giyimKategoriler.add("Ayakkabı");
		giyimKategoriler.add("Çanta");

		Map<String, List<String>> kategoriMap = new HashMap<>();
		kategoriMap.put("Giyim", giyimKategoriler);

		System.out.println("Ana Kategoriler:");
		for (String anaKategori : anaKategoriler) {
			System.out.println("- " + anaKategori);
		}

		System.out.println("\nGiyim Kategoriler:");
		for (String giyimAltKategori : kategoriMap.get("Giyim")) {
			System.out.println("- " + giyimAltKategori);
		}

	}

}
