package com.veysel;

public class AritmetikOperatorler {

	public static void main(String[] args) {
		
		/*
		 * + -> Toplama
		 * - -> Çıkartma
		 * * -> Carpma
		 * / -> Bolme
		 * % -> Mod(Kalan Bulma)
		 * 
		 */
		
		
	
		System.out.println(5+9);
		int sayi1;
		int sayi2;
		sayi1=5;
		sayi2=9;
		
		
		int toplam;
		toplam=sayi1+sayi2;
		System.out.println("İki Sayının Toplamı......"+toplam);
		
		// aldığımız dataları tekrar kullanmak için değişken kullanmak önemlidir.
		
		int fark;
		fark=sayi1-sayi2;
		System.out.println("İki Sayının Farkı......"+fark);
		
		int carpim;
		carpim=sayi1*sayi2;
		System.out.println("İki Sayının Carpımı....."+carpim);
		
		float bolum;
		bolum=(float)sayi1/sayi2;//cast yapılarak 5.0 yaparız aslında 
		System.out.println("İki sayının bölümü.... "+bolum);
		
		
		int mod = sayi2%sayi1;
		System.out.println("9 un 5 ile modu......"+mod );
		
		System.out.println(6+9);
		System.out.println("Veysel"+"Kayhan");
		System.out.println("9 ile 29 toplamı...."+9+29);// 9 ile 29 toplamı.....929 olarak yazdı.
		System.out.println("9 ile 29 toplamı...."+(9+29));// parantez içine alınca düzeldi işlem önceliği oldu
		/* 
		 * bir metin ile bir sayısal sonucun toplamı sayısal çıkamaz bu birleştirme işlemi halini alır.
		 * bu kısım bir metin olarak dönüştüğü için buda birleşrime olarak gördü
		 * 
		 */
		System.out.println("9 ile 29 un çarpımı....."+9*29);// önce çarptı sonra metinle çıkan sonucu topladı.
		//!!! dikkat et bunlar önemli işlem önceliği çok önemli.
		
		
		
		/*
		 * DİKKAT !!!!!!!!!!
		 * Artırım ve Eksiltim operatörleri,prefix suffix şeklinde kullanılabilir.
		 * önde gösterim(++değişken),sonda gösterim(değişken--)
		 * öndeki gösterimlerde -> önce sayıda artırım gerçekleşrtirilir.
		 * sonda gösterimde -> önce sayı sonra artırım
		 * 
		 * ++ -> Artırım işlemi yapar,bir sayının bir artmasını sağlar.
		 * 
		 * 
		 * -- -> Eksiltme İşlemi yapar.bir sayının bir azalmasını sağlar.
		 * 
		 * 
		 * 
		 */
		
		
		int s1=5;
		int s2=19;
		System.out.println("Sayı1......"+s1);
		System.out.println("Sayı2......"+s2);
		
		s1++;
		s2++;

		System.out.println("Sayı1......"+s1);
		System.out.println("Sayı2......"+s2);
		
		

		System.out.println("********Sayı Azaltma*******");
		s1--;
		s2--;
		

		System.out.println("Sayı1......"+s1);

		System.out.println("Sayı2......"+s2);	
		
		--s1;
		--s2;
		
		System.out.println("Sayı1......"+s1);
		System.out.println("Sayı2......"+s2);
		
		// önde de sonda da kullanım 1er artırma ve eksiltme özelliği gösterir.
			
		System.out.println("********Sayı Artırma*******");
		
		s1=23;
		s2=17;
		
		int sayi2_onde_gosterim=++s2;
		int sayi1_sonda_gosterim=s1++;
		
		
		
		System.out.println("Sayı2......."+sayi2_onde_gosterim);
		System.out.println("Sayı1......."+sayi1_sonda_gosterim);
		// doğrulamak için 
		
		System.out.println("s1......."+sayi1_sonda_gosterim);
		System.out.println("s2......."+sayi2_onde_gosterim);
		 
		//!!!!!!!!!!!!!!!!!! Bu kodlara tekrar bak 
		
		
	
		
		/*
		int sonuc=s1++ + ++s2 + --s1 - --s1 + ++s2 + s2++ + ++s1;
		
		System.out.println("Sonuc......"+sonuc);
		
			*/	
		
		
		
	}

}
