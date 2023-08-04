package com.veysel;

import com.veysel.entitiy.Aga;
import com.veysel.entitiy.BuyukBasHayvanlar;
import com.veysel.entitiy.KucukBasHayvanlar;
import com.veysel.entitiy.KumesHayvanları;
import com.veysel.entitiy.Seyis;

public class Runner extends Aga {

	public static void main(String[] args) {
		/*
		 * 1.Durum Tüm sınıflara emirler kendi değişkenleri tarafından verilecek.
		 * 
		 * 
		 */

		Seyis seyis = new Seyis();// nesne oluşturulup refaransı dönüyor...
		KucukBasHayvanlar kucukBasHayvanlar = new KucukBasHayvanlar();
		BuyukBasHayvanlar buyukBasHayvanlar = new BuyukBasHayvanlar();
		KumesHayvanları kumesHayvanları = new KumesHayvanları();

		seyis.hayvanlarıBesleIslemi();
		kucukBasHayvanlar.hayvanlarıBesleIslemi();
		buyukBasHayvanlar.hayvanlarıBesleIslemi();
		kumesHayvanları.hayvanlarıBesleIslemi();
		System.out.println("******************************");
		/*
		 * 2.durum da tek bir emir eren olmalı,o bütün nesnelerin referanslarını
		 * barındırıyor olmalı.
		 * 
		 */
		Aga aga = new Aga();// aganın tanımı burda mevcut
		aga.hayvanlarıBesleIslemi();
		// işler büyüdü,proje parçalara ayrılmalı ve daha detay yazmalı.

		aga = new Seyis();// burda oluşan nesne Seyis objesidir.Referansta bu objeyi işaret eder.
		aga.hayvanlarıBesleIslemi();// bu besleme emri aganın yaptığı görev değiş seyisin yaptığı hayvanla besle...
//Buradaki atama seyis objesinin ataması olduğu için çalışan method da seyise aittir.

		aga = new BuyukBasHayvanlar();
		aga.hayvanlarıBesleIslemi();

		aga = new KucukBasHayvanlar();
		aga.hayvanlarıBesleIslemi();

		aga = new KumesHayvanları();
		aga.hayvanlarıBesleIslemi();
		
		// ilk başta ıslemi değiştirdik hep sınıflarda olanı yazdı!!
	}
		// aganın birden fazla biçimde davranılmasına polymorphism denir....

}
