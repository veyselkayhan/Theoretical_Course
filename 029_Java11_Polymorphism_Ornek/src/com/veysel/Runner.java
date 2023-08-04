package com.veysel;

import com.veysel.entity.Ceo;
import com.veysel.entity.Memur;
import com.veysel.entity.Mudur;
import com.veysel.entity.Muhendis;

public class Runner {

	public static void main(String[] args) {
		/*
		 * Özlük işlemleri ve maaş
		 */

		Memur memur=new Memur("Memur","Murat","Ankara","555 665 0221",15_000d,1.6);
		Ceo ceo=new Ceo("Ceo","Murat","Ankara","555 665 0221",15_000d,3.2);
		Mudur mudur=new Mudur("Mudur","Murat","Ankara","555 665 0221",15_000d,2);
		Muhendis muhendis=new Muhendis("Muhendis","Murat","Ankara","555 665 0221",15_000d,1.8);
		
		Muhtemetlik muhtemetlik=new Muhtemetlik();
		muhtemetlik.maasHesapla(memur);
		muhtemetlik.maasHesapla(ceo);
		muhtemetlik.maasHesapla(mudur);
		muhtemetlik.maasHesapla(muhendis);
		
		
		
	}

}
