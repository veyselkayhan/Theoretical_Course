package com.zeynep.Ornek1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zeynep.Ornek1.entity.DepartmanList;

public class Runner {

	public static void main(String[] args) {
		/**
		 * Firma; Departmanlar var, bu departmanlar i�inde personeller �al���yor. 1-
		 * hangi departmanda kimler �al���yor bilmek istiyoruz. 2- bir departman ad�n�
		 * yazd���mda o departmanda �al��anlar� g�rmek istiyorum. 3- departmanlar
		 * sonradan eklenebilir ve i�erisine personel eklenebilir olmal�d�r. 4- arama
		 * yapabilmeliyim, mesela departman ad�n� bilmiyorum arama yaparken "�rn: ya"
		 * �eklinde bir arama yapt�m. i�erisinde "ya" ge�en t�m departmanlar� bulmal� ve
		 * bunarda �al��anlar� listeleyebilmeliyiz.
		 */

		/**
		 * BILGI ISLEM-> {�ALI�AN L�STES�, AHMET,CANAN,TEMEL,HAKKI} YONETIM -> {DEMET
		 * HANIM, KAM�L BEY} -> Map, ArrayList,
		 */
		// System.out.println(DepartmanList.AR_GE);
		// System.out.println(DepartmanList.YAZILIM);

		List<String> personeller = new ArrayList<String>();
		personeller.add("Muhammet");
		personeller.add("Hakan");
		personeller.add("Demet");
		personeller.add("Nuran");
		personeller.add("Canan");
		// Ar-GE �al���yor olsunlar
		// int long char bunlR yaz�lmaz
		// Key-> Integer, String, Enum, X
		// VAlue -> List<>, Set<>, String, Personel
		
		Map<DepartmanList, List<String>> firma = new HashMap<DepartmanList, List<String>>();

		firma.put(DepartmanList.AR_GE, personeller);

		List<String> yazilimPersonelleri = new ArrayList<String>();
		yazilimPersonelleri.add("Emel");
		yazilimPersonelleri.add("Derin Su");
		yazilimPersonelleri.add("Hakki Can");
		yazilimPersonelleri.add("Ajdar");

		firma.put(DepartmanList.YAZILIM, yazilimPersonelleri);

		System.out.println("Ar-Ge Personelleri");
		firma.get(DepartmanList.AR_GE).forEach(System.out::println);
		System.out.println("-----");
		firma.get(DepartmanList.YAZILIM).forEach(System.out::println);

	}

}
