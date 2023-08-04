package com.veysel;

import com.veysel.controller.MusteriController;
import com.veysel.entity.Musteri;
import com.veysel.service.SatisSistemleri;

public class Runner {
	
	

	public static void main(String[] args) {
		/*
		 * Erişim Belirteci Burada ki amac verinin güvenli bir şekilde
		 * işlenmesi,gereksiz müdahalelerin önüne geçmek için kullanılır.- 
		 * ---> private:Sınıf içi dışında bütün erişime kapalıdır.
		 * ---> protect:aynı paketten erişim var paket dışına yok. 
		 * ---> public:her yerden erişim sağlayabilirsin.
		 * ---> default Not:ayrı paketlerde yer alan sınıflar birbirlerini çağırmak için
		 * import etmek zorundadırlar.
		 * 
		 */
		Musteri musteri = new Musteri();
		/*
		 * aynı paket içinde olmayan ve erişim belirteci olmayan değişkenler default
		 * erişim şekline sahiptir.Bu nedenle paket dışında erişilemezler.
		 */
		// musteri.ad="Canan";

		musteri.adres = "Bodrum";// public dediğimiz için geldi;
//		musteri.telefon buna erişim sağlayamazsın protected.

//		musteri.yas(Private olduğu için erişimi yok.
		SatisSistemleri sat = new SatisSistemleri();
//		sat.kdv = 0.98;//dışarıdan erişime açık olduğu için kdvyi manupüle etti.
//		dışarıdan müdahaleden dolayı private a çektik.
		double fiyat = sat.genelsatisFiyati(1000);
		System.out.println("Fiyat...." + fiyat);

		MusteriController mustericontroller = new MusteriController();
		mustericontroller.getMusteri();
		System.out.println("Musteri Adi...." + mustericontroller.getMusteri().ad);
	}
	
	

}
