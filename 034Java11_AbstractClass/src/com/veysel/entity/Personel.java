package com.veysel.entity;

public abstract class Personel {
	
	public String ad;
	public String adres;
	public String telefon;
	public void personelBilgileriniYazdir() {
		System.out.println("ad..."+ad);
	}
	
	abstract void MaasHesapla();
	public abstract void Deneme();
	
}
