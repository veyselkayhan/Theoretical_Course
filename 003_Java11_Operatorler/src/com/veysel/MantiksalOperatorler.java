package com.veysel;

public class MantiksalOperatorler {

	public static void main(String[] args) {
		/*
		 * Bazen aynı anda bir den fazla durumun irdelemesini ve bir sonuca ulaşılması gereklidir.Tam bu noktada 
		 * bu durumların birleştirilmesine mantıksal operörler kullanılır.
		 * 
		 * 
		 * Bir kullanıcının sosyal medya hesabına giriş yapabilmesini için kullanıcı adı ve şifresini girmesi gereklidir.
		 * İşte tam burada hem kullanıcı adının hemde şifresinin doğru olması gereklidir.
		 * 
		 * --- > Ve Operatörü -> && iki durumu aynı anda doğru olması halinde true döner.
		 * 
		 * --- > VEYA OPERATÖRÜ -> || irdelenen her iki durumdan en az bir tanesi doğru ise true döner.
		 * 
		 * 
		 * 
		 * 
		 */
		String kullaniciAdi="Veysel";
		String sifre="123456";
		
		boolean sifre_deneme1=kullaniciAdi=="Veysel"&& sifre=="123456";
		System.out.println("1.deneme......:"+sifre_deneme1);
		
		boolean sifre_deneme2=kullaniciAdi=="Veysel2" && sifre=="123456";
		System.out.println("2.deneme......:"+sifre_deneme2);
		
		boolean sifre_deneme3=kullaniciAdi=="Veysel" && sifre=="1234567";
		System.out.println("3.deneme......:"+sifre_deneme3);
		
		boolean sifre_deneme4=kullaniciAdi=="Veysel2" && sifre=="1234567";
		System.out.println("4.deneme......:"+sifre_deneme4);
		
		
		int vize_notu=10;
		int final_notu=60;
		/*
		 * vizenin %45 i finalin %55 i hesaplanarak ortalama bulunur.bir öğrenci final den 60 ve yukarı alırsa
		 * vizesi 0 bile olsa geçiyor.final i 60 tan küçük ise ortalaması 50 ve üzeri ise geçiyor.
		 * 
		 */
		 
    	double ort = vize_notu*45/100+final_notu*55/100;
		System.out.println("Ortalama : "+ort);
		
		 boolean geçtin_mi= final_notu >= 60 || ort >=50 ;
		 System.out.println("Geçtim mi...."+geçtin_mi);
		
		
		{
		}
		
		
		
	}

}
