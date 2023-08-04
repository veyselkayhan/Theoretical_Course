package com.veysel;

public class Method_Overloading {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Belli bilgilerin bir yere kayıt edilmesi gibi görevimiz olsun
		 * Örn;
		 * bir otomasyon işinde Müşteri,Ürün,Satış vs bilgilerini kayıt edelim.
		 * böyle bir durumda yapılan işlem tekdir.Kaydet();
		 * 
		 */
	toplam(5,989);
	toplam(5,989d);
	toplam(5d,9896);
	}
	void gelen_bilgilerin_dbye_aci_kayit_edilmesi() {
		
		
	}
	
	void kaydet() {
		
	}
	/*
	 * İnteger tipinde iki sayı alarak bunları toplamını bulan methodtur.
	 * sayi1->İnteger bir değer giriniz.
	 * sayi2->İnteger bir değer giriniz.
	 * 
	 */
	
	static void toplam(int sayi1,int sayi2) {
		int sonuc=sayi1+sayi2;
		System.out.println("İnt Toplam: "+sonuc);
		
	}
	/*
	 * perunit
	 * repeat
	 * delay-> int tipinde saniye cinsinden değer verilmelidir.Bu değer örneğin 5000 için 5 sn demektir.
	 * 
	 */
	
	static void toplam(int sayi1,double sayi2) {
		double sonuc=sayi1+sayi2;
		System.out.println("double Toplam: "+sonuc);
		
	}
	
	static void toplam(double sayi1,int sayi2) {
		double sonuc=sayi1+sayi2;
		System.out.println("d-int sonuc...:"+sonuc);
		
	}
	static void toplam(int sayi) {
		
	}
	static void toplam(int sayi,int s2,int s3,double s4,float s5) {
		
	}
	
}


	
	
//static void kaydet(urun) {
//	
//}
//static void kaydet(musteri) {
//	
//}
//static void(Satis)
//	
//

