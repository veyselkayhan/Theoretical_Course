package com.veysel.entity;

public class Araba extends Arac {
	public Araba() {
		/*
		 * 
		 * Super anahtar kelimesi,
		 * 1-her constructor da bulunmaktadır.
		 * 2-Miras alınan sınıfın constructor ını ifade etmektedir.
		 * 3-yazılımda bile super orada vardır.
		 * 4-super anahtar kelimesinden önce asla ve asla komut yazılmaz..
		 * 5-parametreli ve parametresiz kullanımları vardır.
		 * parametreli kullanımları super(2,"bu nedir"); şeklinde olabilir ve miras
		 * alınan sınıfın parametreli constructorını ifade eder.
		 * 
		 * 
		 */
//		super(18);
		
	
		
	}
	

public Araba(int kdv,int otv) {
	super(kdv,otv);
		
	}
	
	
	

}
