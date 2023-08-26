package Soru;

import Soru.repository.HaftanınGunleriRepository;

public class Runner {

	public static void main(String[] args) {
		HaftanınGunleri haftanınGunleri = new HaftanınGunleri();
		HaftanınGunleriRepository repo =  new HaftanınGunleriRepository();
		
		repo.name();
		haftanınGunleri.listeyeEkle();
		haftanınGunleri.gunBelirle();
//		haftanınGunleri.listeyeEkle();
		
		
		
		

	
	}

}
