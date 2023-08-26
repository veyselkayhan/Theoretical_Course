package com.veysel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.veysel.entity.Departman;
import com.veysel.entity.Personel;

public class Runner_Personel {

	public static void main(String[] args) {
		Departman departman= new Departman("İnsan Kaynakları");
		Departman departman1= new Departman("Bilgi İşlem");
		Departman departman2= new Departman("Muhasebe");
		
		Personel p1= new Personel("Murat Taş", "Ankara", "0555 555 55 55 ",departman);
		Personel p2= new Personel("Hakan Ulaş", "Ankara", "0555 555 55 55 ",departman);
		Personel p3= new Personel("Bahar Deniz", "İzmir", "0555 555 55 55 ",departman1);
		Personel p4= new Personel("Elif Nur", "Ankara", "0555 555 55 55 ",departman1);
		Personel p5= new Personel("Bahadır Ölçek", "Bursa", "0555 555 55 55 ",departman1);
		Personel p6= new Personel("Tekin Korkut", "Ankara", "0555 555 55 55 ",departman1);
		Personel p7= new Personel("Ali Baş", "Ankara", "0555 555 55 55 ",departman1);
		Personel p8= new Personel("Vahit Bulduk", "Ankara", "0555 555 55 55 ",departman1);
		Personel p9= new Personel("Vakkas Ayrık", "İstanbul", "0555 555 55 55 ",departman2);
		Personel p10= new Personel("Turan Hakkı", "Ankara", "0555 555 55 55 ",departman2);
		Personel p11= new Personel("İclal Ateş", "İstanbul", "0555 555 55 55 ",departman2);
		Personel p12= new Personel("Enes Kaymak", "Ankara", "0555 555 55 55 ",departman2);
		Personel p13= new Personel("Vali Tu", "Konya", "0555 555 55 55 ",departman2);

		var personelListesi= List.of(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13);
		/*
		 * 
		 * Sizin personlleriniz 100 bin lerce olabilir bu personeller için özel işlemler yapabilirsiniz.
		 * Örneğin, her departmanda olan personellerin özlük bilgilerinde arama yapacaksanızve bu işlem için 
		 * ön görülen sorgu miktarı 1.000.000 olsun.Şimdi bunu örnekleyelim.
		 */
		Long start = System.currentTimeMillis();
		for(int i=0;i<1_000_000;i++) {
			List<Personel> bilgiislem= new ArrayList<Personel>();
			personelListesi.forEach(p->{
				if(p.getDepartman().getAd().equalsIgnoreCase("Bilgi İşlem")){
						bilgiislem.add(p);}
			});
		}
		long end=System.currentTimeMillis();
		System.out.println("Gecen Süre....: "+(end-start)+"ms");
		
		Map<String, List<Personel>> mapList = personelListesi.stream().collect(Collectors.groupingBy(
				p -> p.getDepartman().getAd(),
				HashMap::new,
				Collectors.toList()
				));
		
		start = System.currentTimeMillis();
		for(int i=0;i<1_000_000;i++) {
			mapList.get("Bilgi İşlem");
		}
		end=System.currentTimeMillis();
		System.out.println("Gecen Süre....: "+(end-start)+"ms");
		
		
		
	}
	
}
