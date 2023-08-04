package com.veysel;

import java.util.Scanner;

import com.veysel.entity.Musteri;
import com.veysel.repository.MusteriRepository;

public class Runner {

	public static void main(String[] args) {
		/*
		 * Müşteri Takip Otomasyonu.
		 * 
		 */
		
		
		
		
		
	int secilen;
		do {
			
			EkranaYazdir();
			secilen=secim();
			if(secilen==0)
				System.out.println("Çıkış");
			else islem(secilen);
			}while(secilen!=0);
			
		
		
		
	}//main method sonu
	
	private static void arama() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Arama....");
		String ad=sc.nextLine();
		MusteriRepository repository=new MusteriRepository();
		repository.bulVeYazdır(ad);
		
		
	}
	
	private static void musteriEkleme() {
		
		MusteriRepository repository =new MusteriRepository();
		Musteri musteri=new Musteri();
		Scanner sc=new Scanner(System.in);
		System.out.println("Musterinin adınını Giriniz....");
		musteri.ad=sc.nextLine();
		System.out.println("Musterinin Adresini Giriniz");
		musteri.adres=sc.nextLine();
		repository.kaydet(musteri);
		
	}

	

	
	
	
private static void islem(int secim) {
	
	switch (secim) {
	
	case 1:{
		
		//Müşteri Ekle
		musteriEkleme();
		break;
	}
	case 2:{
		//Müşteri listele
		MusteriRepository repository=new MusteriRepository();
		repository.ekranaYazdır();
		break;
	}
	case 3:{
		//Müşteri sil
		break;
	}
	case 4:{
		arama();
		//Müşteri arama
		break;
	}
	default :{
		System.out.println("Geçersiz İşlem");
		break;
	}
	}
	
}
	
	private static void  EkranaYazdir() {
		
		System.out.println("*******************************");
		System.out.println("*****Müşteri Otomasyonu********");
		System.out.println("*******************************");
		System.out.println();
		System.out.println("1-Müşteri Ekle");
		System.out.println("2-Müşteri Listele");
		System.out.println("3-Müşteri Sil");
		System.out.println("4-Müşteri Arama");
		System.out.println("0-Çıkış");
		
	}
	
	
	
	
	
	private static int secim() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Secim Yapınız");
		int secilen=sc.nextInt();
		return secilen;
		
	}
	
}//class sonu
