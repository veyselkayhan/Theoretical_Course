package com.veysel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.veysel.entity.Personel;

public class Runner {
	
	public static void main(String[] args) {
		/*
		 * 
		 * Stream  
		 * 
		 */
		
		List<String>personelIsımListesi = new ArrayList<String>();
		personelIsımListesi.add("Ahmet Taş");
		personelIsımListesi.add("Deniz Kurum");
		personelIsımListesi.add("Hakan Pek");
		personelIsımListesi.add("Dursun Tekin");
		personelIsımListesi.add("Ahmet Aligiller");
		personelIsımListesi.add("Bahar Kaya");
		
		
		for(int i=0;i<personelIsımListesi.size();i++) {
		String ad=personelIsımListesi.get(i);
		if(ad.contains("Ahmet")) {
		System.out.println(ad);}
		}
		
		System.out.println("***------------------");
		for(String isim: personelIsımListesi) {
			if(isim.contains("Ahmet")) {
			System.out.println(isim);}
		}
		
		System.out.println("**---------------------");
		personelIsımListesi.forEach(ad->{
			if(ad.contains("Ahmet")) 
				System.out.println(ad);});
		
		System.out.println("*-----------------------");
		
		personelIsımListesi.stream().filter(ad->ad.contains("Ahmet")).forEach(System.out::println);
		/*
		 * 
		 * Data Edinim Yöntemleri
		 * 1-Kullanıcıdan alınan uygulama içi aksiyonlar.(kayıt,ürün satınalınması,beğeni yapması vs.)
		 * 2-Zaten internette var olan dataları çekmek.
		 * Dataların saklanması;
		 * 1-Gecici olarak,yani uygulama çalıştığı sürece RAM üzerinde,
		 * 2-Kendi Bilgisayarımız ya da bulut ortamında DataBase dediğimiz yapıların içinde..
		 * 
		 * 
		 * 
		 */
		
		Stream<String> bosKayit=Stream.empty();//boş bir stream oluşturur...//count ->0 dır.
		Stream <String> tekKayit=Stream.of("Muhammet");//count ->1 
		Stream<Double>diziSeklindeStream = Stream.of(3d,654d,766.86d);//belirli bir miktar sayı bulunduran liste.
		List<String> gunlerListesi=List.of("Pazartesi","Salı","Çarsamba","Perşembe","Cuma","Cumartesi","Pazar");
		
		
		Stream<String>gunStream= gunlerListesi.stream();
		gunStream.filter(x->x!=null);//bir stream içindeki verilerden belli koşullara uyanları filtre 
		//gunlerListesi.filter(); çalışmaz; çünkü önce stream a çevirmek gerekli.
		gunlerListesi.stream().filter(x->x!=null);
		gunlerListesi.stream().filter(g->g.contains("a"));
		gunlerListesi.stream().filter(ali_amca_nasilsin->ali_amca_nasilsin.contains("es"));
		
		
		
		/*
		 * 
		 * Sonsuz Streamler
		 * 
		 * Rastgele sayı üretme -> math sınıfın içinde random sayı üretme metotları vardır.
		 * Birde bunu bir streame verdiğini düşün.Bir liste sınırlıdır.Haftanın günler,aylar,vb seyler
		 * Sonsoz stream içerisinde sonsuz bilgi barındıran...
		 * 
		 */
		
		Stream<Double> sonsuzStream = Stream.generate(Math :: random);
//		sonsuzStream.forEach(d->{
//			System.err.println("Sayı..."+d);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				
//				e.printStackTrace();
//			}
//		});
		
		Stream<Integer> iterateStream= Stream.iterate(50, n->n+5);//n bir sayıdır 5 er 5 er artar...
		
//		iterateStream.forEach(x->{
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//			
//				e.printStackTrace();
//			}
//			System.out.println(x);
//		});
		
	
		Stream<Integer> sonsuzSinirliStream= Stream.iterate(50_000, n-> n<50_101,n->n+10);//n bir sayıdır 5 er 5 er artar...
	
		sonsuzSinirliStream.forEach(System.out::println);
		
		
		/*
		 * 
		 * bir paragraf içinde var olan bazı hatalar bulunmaktadır.Bu hataların ayıklanarak tekrardan birleştirilme
		 * işlemi yapılacaktır.Buna örnek olması açısından basit bir kullanım gösterelim.
		 * 
		 */
		
		
		String makale="";
		String [] makaleParagraflari=makale.split("\n");
		/*
		 * Eski metinleri çıkartıp yenilerini yerine koyduğumu düşünelim.
		 */
		
		var kelimeDizisi=new String[] {"M","u","h","a","m","m","e","t"};
				
		String ad=" ";
		
		for (String harf : kelimeDizisi) {
		    ad += harf;
		}
		System.out.println("Adınız.... "+ad);
		
		Stream<String> kelimeStream=Stream.of("M","u","h","a","m","m","e","t");
		String adStream=kelimeStream.reduce(" ",(s1,s2)->s1+s2);
		
		System.out.println("Stream Ad Bilgisi.."+adStream);
		
		Stream<Integer>sayilar =Stream.of(5,4,9,8,6);
		int toplam=sayilar.reduce(0,(s1,s2)->s1+s2);
		System.out.println(toplam);
		sayilar =Stream.of(5,4,9,8,6);
		int carpim=sayilar.reduce(1,(s1,s2)->s1*s2);
		System.out.println("Çarpımı :"+carpim);
		
		
		Stream<String>isimListesi=Stream.of("Ahmet","Muhammet","Can","Canan","Muzaffer");
		String enkisaIsim=isimListesi.min((mevcutIsim,sonrakiIsim)->mevcutIsim.length()-sonrakiIsim.length()).get();
		System.out.println("En kısa isim : "+enkisaIsim);
		
		System.out.println("---------Filtreleme---------");
		isimListesi=Stream.of("Ahmet","Muhammet","Can","Canan","Muzaffer");
		isimListesi.filter(isim-> isim.contains("e")).forEach(System.out::println);
		isimListesi=Stream.of("Ahmet","Muhammet","Can","Canan","Muzaffer");
		System.out.println("----- C ile Başlayanlar -----");
		isimListesi.filter(isim->isim.startsWith("C")).forEach(System.out::println);
		System.out.println("--------- Adı 5 ve Daha Kısa Karakterli Olanlar ---------");
		isimListesi=Stream.of("Ahmet","Muhammet","Can","Canan","Muzaffer");
		isimListesi.filter(isim->isim.length()<=5).forEach(System.out::println);
		
		
		List<Personel> personelListesi =new ArrayList<Personel>();
		personelListesi.add(new Personel("Muhammet Ali Hoca", "Ankara", "0 555 555 55 55"));
		personelListesi.add(new Personel("Hakan Taskı", "Izmir", " 0859 897 4754"));
		personelListesi.add(new Personel("Bahar Güleyman", "Trabzon", " 0665 654 54 65"));
		personelListesi.add(new Personel("Deniz Bülbül", "Urfa", " 0231 654 54 65"));
		personelListesi.add(new Personel("Belgin Belli", "Denizli", " 0321 612 56 35"));
		
		/*
		 * Ankarada oturan personellerin listesini getirelim...
		 */
		
		personelListesi.stream().filter(p->p.getAdres().equals("Ankara")).forEach(System.out :: println);
		System.out.println("----------------------");
		personelListesi.stream().filter(p->p.getAd().contains("e")&& p.getAdres().contains("a")).forEach(System.out::println);
		
		int bulunan=0;
		for(int i=0;i<personelListesi.size();i++) {
			
		}
		
		
	}

}
