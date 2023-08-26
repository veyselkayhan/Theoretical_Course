package com.veysel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.veysel.entity.Kategori;
import com.veysel.entity.Urun;

public class Runner_Urun {

	public static void main(String[] args) {
		
		Kategori kategori= new Kategori("Erkek");
		Kategori kategori1= new Kategori("Kadın");
		Kategori kategori2= new Kategori("Cocuk");
		
		Urun urun= new Urun("Gömlek", "Siyah", "Slim", kategori);
		Urun urun1= new Urun("Tişört", "Mavi", "Slim", kategori);
		Urun urun2= new Urun("Pantolon", "Mavi","Slim", kategori1);
		Urun urun3= new Urun("Gömlek", "Beyaz", "Slim", kategori1);
		Urun urun4= new Urun("Tişört", "Sarı", "Slim", kategori2);
		Urun urun5= new Urun("Pantolon", "Gri", "Slim", kategori2);
		
		var urunListesi= List.of(urun,urun1,urun2,urun3,urun4,urun5);
		
		Long start = System.currentTimeMillis();
		List<Urun>erkek=new ArrayList<Urun>();
		for(int i=0;i<1_000_000;i++) {
			erkek.clear();
			urunListesi.forEach(p->{
				if(p.getKategori().getAd().equalsIgnoreCase("Erkek")) {
					erkek.add(p);
				}
			});
		}
		
		long end =System.currentTimeMillis();
		System.err.println("Gecen Süre....:"+(end-start+"ms"));
		
		Map<String, List<Urun>> mapList = urunListesi.stream().collect(Collectors.groupingBy(
				
				p->p.getKategori().getAd(),
				HashMap::new,
				Collectors.toList()
				));
		start=System.currentTimeMillis();
		for(int i=0;i<1_000_000;i++) {
			mapList.get("Erkek");
		}
		end=System.currentTimeMillis();
		System.out.println("Gecen Süre.....:"+(end-start)+"ms");
	}

}
