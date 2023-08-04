package com.veysel;

import com.veysel.entity.Mudur;
import com.veysel.entity.Muhendis;
import com.veysel.entity.Ustabasi;

public class Runner {
	
	public static void main(String[] args) {
		Ustabasi ustabasi=new Ustabasi();
		Muhendis muhendis=new Muhendis();
		Mudur mudur=new Mudur();
		ustabasi.ad="Usta Arkadaş";
		muhendis.ad="Muh.Ali Bey";
		System.out.println(ustabasi.ad);
		System.out.println(muhendis.ad);
		
		
		
	}
	
	
	
	
	
}
