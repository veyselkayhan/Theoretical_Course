package Soru;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import Soru.repository.HaftanınGunleriRepository;

public class HaftanınGunleri {
	HaftanınGunleriRepository repo = new HaftanınGunleriRepository();
	Utility utility = new Utility();

	static Scanner sc = new Scanner(System.in);


	   int sayi,gunValue;
	public String gunveriAl() {
		try {
	        String gun = utility.stringDegerAlma("Bir gün Giriniz : ");
	       
	        if (repo.gunler.containsKey(gun)) {
	        	gunValue=repo.gunler.get(gun);
	        	System.out.println("Gün Eklendi");
	            return gun;
	        } else {
	            System.out.println("Gün Bulunamadı. Tekrar Giriniz.");
	            return gunveriAl(); 
	        }
	       
	    }catch (NullPointerException ex) {
			System.out.println("Liste Boş Önce Listeye Eklem Yap");
			return gunveriAl();
		}catch (Exception e) {
			System.out.println("Beklenmedik Bir Hatayla Karşılaşıldı.."+e.toString());
		return gunveriAl();
		}
	}

 
    
	public int gunSayisi() {

		try {
			sayi=utility.intDegerAlma("Gün Sayisi : ");
			return sayi;
		}catch (InputMismatchException ex) {
			System.out.println("Geçersiz Değer..."+ex.toString());
			return gunSayisi();
		}catch (NumberFormatException ex) {
			System.out.println("Geçersiz Değer.Integer Değer Giriniz "+ex.toString());
		return gunSayisi();
		}
	}

	public void listeyeEkle() {
		repo.veriler(gunveriAl(), gunSayisi());
		System.out.println("Ekleme Başarılı");

	}
	int sonGun;
	
	public void gunBelirle() {	
            sonGun=(sayi + gunValue)%7;
       
		for (Map.Entry<String, Integer> entry : repo.gunler.entrySet()) {
            if (entry.getValue() == sonGun) {
            	System.out.println(entry.getKey());
            }
	}

}
}
