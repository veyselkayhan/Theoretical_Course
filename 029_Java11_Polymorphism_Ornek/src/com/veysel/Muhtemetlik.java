package com.veysel;

import com.veysel.entity.Personel;

public class Muhtemetlik {

	
	public void maasHesapla(Personel personel) {
		
		double maas =personel.maasKatSayisi*personel.TemelMaas;
		System.out.println(personel.tur+" a ait maaş tutarı....: "+maas);
		
	}
	
	
	
}
