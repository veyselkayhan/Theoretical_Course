package com.veysel;

public class Runner_Others {

	public static void main(String[] args) {
		String ifade="  Böyle bir ifade olamaz,cünkü boyle bir ifade yok";
		/*
		 * Adjusting Case
		 * bazen ifadelerin büyük ya da küçük harf ile gösterilmesi gerekebilir.
		 * böyle durumlarda UpperCase,LowerCase kullanırız.
		 * 
		 */
//		System.out.println(ifade.toLowerCase());
//		System.out.println(ifade.toUpperCase());
//		System.out.println(ifade.toUpperCase(Locale.ENGLISH));
//		System.out.println(ifade.toUpperCase(Locale.forLanguageTag("tr-TR")));


		/*
		 * bazen kullanıcılar bilgi girişlerini yaparken boşluklara dikkat etmezse bu nden sorunlar oluşur.
		 * trim();
		 * bir ifadenin başında ve sonunda olan boşlukları keser.
		 * içinde olan boşlukları almaz
		 * 
		 * 
		 */
		
		System.out.println(ifade);
		System.out.println(ifade.trim());//başındaki boşlukları almadı.
		String ka="veyselkayhan13@gmail.com";
		String kullanici=" veyselkayhan13@gmail.com";
		if (ka.equals(kullanici.trim())) {
			System.out.println("Giriş1");
		}
		else
		System.out.println("HATA");
		
		
		/*
		 * [29]*[29]=841 şekilde deniyince çözmüş olursun..
		 * [58]*[58]=3364
		 *peki kullanıcılar bilgilerini düzensiz büyük küçük harf kullanarak yazıyorlar.
		 * 
		 *  
		 */
		
		ka="Veysel";
		kullanici="VEYSEL";
		if(ka.toUpperCase().equals(kullanici.toUpperCase())) {
			System.out.println("Giriş2");
		}
		else {
			System.out.println("GG");
		}
		
		
		ka="Veysel";
		kullanici="VEYSEL";
		if(ka.equalsIgnoreCase(kullanici.toUpperCase())) {// harflerin büyük küçük harf olup olmadığına dikkat etmez.
			System.out.println("Giriş3");
		}
		else {
			System.out.println("GG");
		}
		
		String sozlesme ="Ahmet Taş Ile Canan Tutak arasında 12.000$ kira ile ev kiralaması yapılmıştır";
		String yeni_sozlesme=sozlesme.replace("Ahmet Taş", "Taha Takan");// ahmet taş ile taha takan değişti.
		System.out.println(yeni_sozlesme);
	
		String dosya_adi="Veysel Kayhan Hatırası.jpg";
		dosya_adi=dosya_adi.replace(" ","_");// boşlukları gidip _ yaptı.(yani değiştirmek istenilenin değiştirdi.)
		System.out.println(dosya_adi);
		System.out.println(dosya_adi.toLowerCase());//hepsini küçültük.
		
		/*
		 * bazen aramalarda ifadenin aranılan ifade ile bire bir eşlemesine gerek olmaz
		 * bu gibi durumlarda kısmı eşlemeşleri kontrol etmek gerekir.Mesela,bir isim
		 * ararken sadece bir kısmını yazmamak o isme yakın metinleri getirmek için kullanılır 
		 * 
		 */
		
		String ad="Ayberk";
		if(ad.contains("Ay")) {
			System.out.println("Kullanıcı Bulundu");
		}
		
		/*
		 * Diger özelliklerine bakalim,
		 * 
		 * 
		 * concat-> bir string sonuna yeni bir metin eklemek için kullanılır.
		 * +->concat gibi davranıramcak değildir.
		 */
		
		ifade="Bugun hava cok sicak";
		System.out.println(ifade.concat("-yeni bir metin eklemek için kullanılır."));
		System.out.println(ifade+"-yeni bir metin eklemek için kullanılır.");// yeni bir ifade eklemek için kullanılır.Yanlış bir işlemdir.
		
		/*
		 * 
		 * ifadenin dolu olup olmadığına bakıyor. 
		 */
		String ifade1="";
		String ifade2=" ";
		if (ifade1.isBlank()) {
			System.out.println("Ifade 1 is blank");
		}
		if(ifade1.isEmpty()) {
			System.out.println("Ifade 1 is empty");
		}
		
		if(ifade2.isBlank()) {
			System.out.println("Ifade2 is blank");
		}
		if (ifade2.isEmpty()) {
			System.out.println("Ifade2 is empty");
		}
		
	ifade.lastIndexOf("a");//a karakterine en son rastlanılan konumu verir.
	ifade.lastIndexOf("a",10);//a karakterine 10.karakterden sonra rastlanılan son konum.
		
	String dosyaAdi="veysel.mp4";//bir dosyanın uzantısını bulan kod.
	int son_nokta=dosyaAdi.lastIndexOf(".");
	String uzanti=dosyaAdi.substring(son_nokta+1);// lastindex bu tarz şeylerde işimize yarar.
	System.out.println(uzanti);
	
	/*
	 * bir ifadenin belli bir karakter ya da string ile parçalar,parçalama işlemi sonunda
	 * ortaya çıkan array dizi çıkar.
	 * 
	 */
	
	String kullanicilar="ayhan,arzu,deniz,canan,hekim,tekin,zeynep";
	System.out.println(kullanicilar.split(",")[0]);
	System.out.println(kullanicilar.split(",")[1]);
	System.out.println(kullanicilar.split(",")[2]);
	System.out.println(kullanicilar.split(",")[3]);
	System.out.println(kullanicilar.split(",")[4]);
	System.out.println(kullanicilar.split(",")[5]);
	System.out.println(kullanicilar.split(",")[6]);
	
	/*
	 * starsWith
	 * 
	 */
	String stok_kodu="STK_PC_00543";
	ifade.startsWith("STK_PC");// bir bilgisayar ürünüdür.bir rirdenin içinde belli bir ifadenin başlangıcından gecip geçmediğine bakar.
	
	}
	

}
