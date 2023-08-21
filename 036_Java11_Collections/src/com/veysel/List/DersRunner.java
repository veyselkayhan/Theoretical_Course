package com.veysel.List;

import java.util.ArrayList;
import java.util.List;

import com.veysel.entity.Ders;

public class DersRunner {
	
	public static void main(String[] args) {
		
		
		Ders ders1=new Ders("Matematik","Canan", "Denklemler");
		Ders ders2=new Ders("Fizik","Ali", "Momentum");
		Ders ders3=new Ders("Kimya","Gülay", "Mol");
		Ders ders4=new Ders("Türkçe","Müge", "Bağlaç");
		Ders ders5=new Ders("Cografya","Can", "İklimler");
		
		List<Ders> dersler=new ArrayList<Ders>();
		dersler.add(new Ders("Matematik","Canan", "Denklemler"));
		dersler.add(ders2);
		dersler.add(ders3);
		dersler.add(ders4);
		dersler.add(ders5);
		for(int i=0;i<dersler.size();i++) {
			System.out.println(dersler.get(i).toString());
		}
		
		System.out.println("3.numaralı Ders..."+dersler.get(2).getOgretmenAdi());
		
		//1.soru bu for nedir ne için kullanılır.
		for(Ders ders: dersler) {
			
		}
		
		//2.bu foreach nedir??
		dersler.forEach(Ders::toString);
		
		//soru3
		
		dersler.forEach(System.out::println());
		
		
	
	}
	


}
