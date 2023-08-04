package com.veysel.entity;

public class Arac {
	
	
	private static int ARAC_URETIM_SAYISI=0;
	public String uuid;
	public String yakitTuru;
	public int yolcuKapasitesi;
	public int hiz;
	public int vites;
	public int kdv;
	public int otv;
	public Arac() {
		super();
		ARAC_URETIM_SAYISI++;
		System.out.println("kayhan");		
	}
	/*
	 * 
	 * hizlandirma işlemi yapar 5km/s default değeridir.
	 * 
	 */
	
	public Arac (int kdv,int otv) {
		this();
		this.kdv=kdv;
		this.otv=otv;
		
		
	}
	
	public void hızlan() {
		hiz+=5;
		
	}
	
	
	public int getAracUretimSayısı() {
		
		return this.ARAC_URETIM_SAYISI;
	}
	
}
