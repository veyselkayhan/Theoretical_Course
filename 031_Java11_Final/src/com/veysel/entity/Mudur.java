package com.veysel.entity;

public class Mudur extends Personel {

	public void maasHesapla() {
		System.out.println("Mudur maaşı hesaplandı");// personeldeki methodu override ettik.
	}
//	public String personelYetki(String unvan) {
//		
//	} kızıyor override edemezsin diyor çünkü bu method final methodu...

	/*
	 * override edilmemesini sağlamak için yapacağız.Bu methodu ezemezler değişmezliği
	 * garanti eder.
	 * 
	 * 
	 */
	
}
