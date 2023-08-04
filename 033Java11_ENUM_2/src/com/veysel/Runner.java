package com.veysel;

import com.veysel.entity.Personel;
import com.veysel.entity.Unvanlar;

public class Runner {

	

	public static void main(String[] args) {
		Personel personel = new Personel("Ahmet", "Ankara", "3124123", "http://photo/300", Unvanlar.CEVRE);
		System.out.println("Unvan..:"+personel.getUnvanlar().getAd());
		System.out.println("No..:"+personel.getUnvanlar().getNo());
		System.out.println("");
	}
}
