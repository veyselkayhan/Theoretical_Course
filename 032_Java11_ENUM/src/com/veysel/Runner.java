package com.veysel;

import com.veysel.entity.Musteri;
import com.veysel.entity.MusteriAdres;
import com.veysel.entity.MusteriCinsiyet;
import com.veysel.entity.MusteriPlatform;
import com.veysel.entity.MusteriTuru;
import com.veysel.entity.OdemeSekli;
import com.veysel.entity.UygulamaDili;

public class Runner {
public static void main(String[] args) {
	/*
	 * Eğer müşteri yeni müşteri ise ona %10 indirim yapalım.
	 * Eğer süper müşteri ise %22 indirim yapalım
	 */
	
	Musteri musteri=new Musteri();
	musteri.setMusteriTuru(MusteriTuru.SUPER_MUSTERI);
	musteri.setCinsiyet(MusteriCinsiyet.erkek);
	musteri.setAdres(MusteriAdres.Ardahan);
	musteri.setPlatform(MusteriPlatform.web);
	musteri.setOdemeSekli(OdemeSekli.Eft);
	musteri.setUygulamaDili(UygulamaDili.TR);
	
	
	
	if(musteri.getMusteriTuru()==MusteriTuru.SUPER_MUSTERI) {
	
}
	
	
	Musteri musteri2=new Musteri(); 
	musteri2.setCinsiyet(MusteriCinsiyet.erkek);
	musteri2.setAdres(MusteriAdres.Muğla);
	musteri2.setPlatform(MusteriPlatform.android);
	musteri2.setOdemeSekli(OdemeSekli.KrediKartı);
	musteri2.setUygulamaDili(UygulamaDili.TR);
	
	Musteri musteri3=new Musteri();
	musteri3.setCinsiyet(MusteriCinsiyet.kadın);
	musteri3.setAdres(MusteriAdres.Aydın);
	musteri3.setPlatform(MusteriPlatform.ios);
	musteri3.setOdemeSekli(OdemeSekli.Cüzdan);
	musteri3.setUygulamaDili(UygulamaDili.DE);
	
	Musteri musteri4=new Musteri();
	musteri4.setCinsiyet(MusteriCinsiyet.cinsiyetBelirtmiyor);
	musteri4.setAdres(MusteriAdres.Aksaray);
	musteri4.setPlatform(MusteriPlatform.web);
	musteri4.setOdemeSekli(OdemeSekli.Eft);
	musteri4.setUygulamaDili(UygulamaDili.TR);
	
	
	System.out.println(musteri2.getPlatform());
	System.out.println(musteri3.getPlatform());
	System.out.println(musteri4.getPlatform());
	System.out.println(musteri4.getOdemeSekli());
	System.out.println(musteri2.getUygulamaDili());
	
}


}

/*
 * Uygulamalar içinde kullanılabilcek en az 5 tane enum verisi yaz.
 */
