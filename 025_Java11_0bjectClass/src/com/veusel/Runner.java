package com.veusel;

import com.veusel.entity.Musteri;
import com.veusel.entity.Satis;
import com.veusel.entity.Urun;
import com.veusel.repository.DBIslemleri;

public class Runner {
	public static void main(String[]args) {
		
		DBIslemleri db=new DBIslemleri();
		Musteri musteri=new Musteri();
		db.save(musteri);
		Urun urun = new Urun();
		db.save(urun);
		
		Satis satis=new Satis();
		db.save(satis);

		db.save("Nasılsın");
		db.save(3214L);
		db.save(true);
		
	}
}
