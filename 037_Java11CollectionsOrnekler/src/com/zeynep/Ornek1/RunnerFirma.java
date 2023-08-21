package com.zeynep.Ornek1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.zeynep.Ornek1.entity.Departman;
import com.zeynep.Ornek1.entity.Personel;

public class RunnerFirma {

	public static void main(String[] args) {

		List<Departman> departmanList = new ArrayList<Departman>();
		Departman insanKaynaklari = new Departman("�nsan Kaynaklar�", "Ahmet TAC", 1);
		Departman arGe = new Departman("Ar-Ge", "Demir BAKİ", 1);
		Departman yazilim = new Departman("Yazilim", "Muhammet Hoca", 1);
		Departman satis = new Departman("Sat��", "Recai CiNGöZ", 1);
		departmanList.add(insanKaynaklari);
		departmanList.add(arGe);
		departmanList.add(yazilim);
		departmanList.add(satis);
		departmanList.add(new Departman("Yonetim", "Tekin BAHA", 999));

		List<Personel> personelListesi = new ArrayList<Personel>();

		personelListesi.add(new Personel("Ali", "Ankara", "0 555 986 7744", departmanList.get(0)));
		personelListesi.add(new Personel("Ayhan", "Ankara", "0 555 986 7744", departmanList.get(0)));
		personelListesi.add(new Personel("Baki", "Ankara", "0 555 986 7744", departmanList.get(1)));
		personelListesi.add(new Personel("Emel", "Ankara", "0 555 986 7744", departmanList.get(1)));
		personelListesi.add(new Personel("Demet", "Ankara", "0 555 986 7744", departmanList.get(1)));
		personelListesi.add(new Personel("Seher", "Ankara", "0 555 986 7744", departmanList.get(2)));
		personelListesi.add(new Personel("Şahin", "Ankara", "0 555 986 7744", departmanList.get(2)));
		personelListesi.add(new Personel("Tekin", "Ankara", "0 555 986 7744", departmanList.get(2)));
		personelListesi.add(new Personel("Zeynep", "Ankara", "0 555 986 7744", departmanList.get(2)));
		personelListesi.add(new Personel("Ferhat", "Ankara", "0 555 986 7744", departmanList.get(2)));
		personelListesi.add(new Personel("Funda", "Ankara", "0 555 986 7744", departmanList.get(2)));
		personelListesi.add(new Personel("Halit", "Ankara", "0 555 986 7744", departmanList.get(3)));
		personelListesi.add(new Personel("�clal", "Ankara", "0 555 986 7744", departmanList.get(3)));
		personelListesi.add(new Personel("Burhan", "Ankara", "0 555 986 7744", departmanList.get(4)));
		personelListesi.add(new Personel("Aykut", "Ankara", "0 555 986 7744", departmanList.get(4)));

		/**
		 * Bir departmanda �al��an ki�ilerin listesini nas�l bulurum?
		 * 
		 */
		System.out.println(departmanList.get(3));// Departman s�n�f�ndan olu�turulmu� nesneler var d�r.
		for (int i = 0; i < personelListesi.size(); i++) {
			if (personelListesi.get(i).getDepartman().getAd().equals("Sat��")) {
				System.out.println(personelListesi.get(i));
			}
		}

		Map<Departman, List<Personel>> departmanMap = new HashMap<Departman, List<Personel>>();
		/**
		 * �nsan KAynaklar�
		 */
		List<Personel> depList = new ArrayList<Personel>();
		depList.add(personelListesi.get(0));
		depList.add(personelListesi.get(1));

		departmanMap.put(departmanList.get(0), depList);
		/**
		 * Ar-Ge
		 */
		depList = new ArrayList<Personel>();
		depList.add(personelListesi.get(2));
		depList.add(personelListesi.get(3));
		depList.add(personelListesi.get(4));

		departmanMap.put(departmanList.get(1), depList);

		/**
		 * Yaz�l�m
		 */
		depList = new ArrayList<Personel>();
		depList.add(personelListesi.get(5));
		depList.add(personelListesi.get(6));
		depList.add(personelListesi.get(7));
		depList.add(personelListesi.get(8));
		depList.add(personelListesi.get(9));
		depList.add(personelListesi.get(10));

		departmanMap.put(departmanList.get(2), depList);
		/**
		 * Sat��
		 */
		depList = new ArrayList<Personel>();
		depList.add(personelListesi.get(11));
		depList.add(personelListesi.get(12));

		departmanMap.put(departmanList.get(3), depList);
		/**
		 * Y�netim
		 */
		depList = new ArrayList<Personel>();
		depList.add(personelListesi.get(13));
		depList.add(personelListesi.get(14));

		departmanMap.put(departmanList.get(4), depList);

		/**
		 * Map i�inde Arama
		 */
		System.out.println("---------------------------------------------------");
		departmanMap.get(departmanList.get(2)).forEach(System.out::println);

		/**
		 * 
		 * StreamApi
		 * 
		 */
		Map<Departman, List<Personel>> departmanMap2 = personelListesi.stream()
				.collect(Collectors.groupingBy(Personel::getDepartman));

		personelListesi.stream().filter(x -> x.getDepartman().getAd().equals("Sat��")).toList()
				.forEach(System.out::println);

	}

}
