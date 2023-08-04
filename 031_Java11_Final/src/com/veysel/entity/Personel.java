package com.veysel.entity;

public class Personel {

	/*
	 * Bazen ya ben bir method yazdım hiçbir şekilde değiştirilememsi lazım
	 * kullanan alt sınıf varsa onu asla değişteremesinler
	 * bazen kullanım şekli böyle olmalıdır mutlaka değişmemesi lazım
	 * 
	 * Değişmemesini istenilen methodlar var ise bunların miras alınan 
	 * sınıflar tarafından değiştirilmesinin önüne geçmemiz gereklidir.
	 * Bunu sağlayabilmek için final kullanırız.
	 */
	public void maasHesapla() {
		System.out.println("Personel maası hesaplandı");
	}
	
	
	
	public final String personelYetki(String unvan) {
		switch (unvan) {
		case "mudur": return "Admin";
		case "muhendis":return"Kısıt-Admin";
		default:return "Users";
		}
	}
	
}
