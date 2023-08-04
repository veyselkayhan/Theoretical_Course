package com.veysel.repository;

import com.veysel.entity.Musteri;
import com.veysel.utility.StaticValues;

public class MusteriRepository {

	/*
	 * 
	 * Müşteri kayıt işlemi
	 * 
	 * 
	 */
	
	
	
	public void kaydet(Musteri musteri) {
		Musteri[] tmp;
        if (StaticValues.musteriler == null) {
            StaticValues.musteriler = new Musteri[1];
            StaticValues.musteriler[0] = musteri;
        } else {
            tmp = new Musteri[StaticValues.length + 1];
            for (int i = 0; i < StaticValues.length; i++) {
                tmp[i] = StaticValues.musteriler[i];
            }
            tmp[StaticValues.length] = musteri;
            StaticValues.musteriler = tmp;
        }
        StaticValues.length++;
		
	}
	 public void sil(String ad) {
	 }
	     
	
	 
	
	/*
	 * Tüm müşterileri konsol ekranına yazdırma işlemi
	 * 
	 */
			
			
	public void ekranaYazdır() {
		System.out.println("Musteri Listesi");
		for(int i=0;i<StaticValues.length;i++) {
			System.out.println("Ad...: "+StaticValues.musteriler[i].ad);
			System.out.println("Adres...: "+StaticValues.musteriler[i].adres);
			System.out.println("- - - - - - - - - - - - - - -");
		}
	}
	
	 
	
	/*
	 * adı verilen müşterinin bilgilerini bulan ve konsol ekranına yazdıran method 
	 * ad Müşteri adını giriniz;
	 */
	
	public void bulVeYazdır(String ad) {
		System.out.println("Arama Sonucu");
		System.out.println("----------------------------------");
		for(int i=0;i<StaticValues.length;i++) {
			if(StaticValues.musteriler[i].ad.contains(ad)) {
				System.out.println("Aranan ad.......: "+ StaticValues.musteriler[i].ad);
				System.out.println("Aranan adres....: "+ StaticValues.musteriler[i].adres);
			}
		}
	}
	
}
