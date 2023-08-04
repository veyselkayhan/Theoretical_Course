package com.veysel;

public class Sabitler {
	/*
	 * final değişkenleri ya ilk tanımında değerini atarsınız, ya da 
	 * static,constructor kullanımı ile değer atarsınız..
	 * 
	 * 
	 */
	
	public final double PI;
	public static final double MU;

	static {
		MU=311;
	}
	public Sabitler() {
		PI=3.14;
	}
}
