package com.veysel.entity;

import java.util.UUID;

public class Personel {
	
	public String id;
	public String tur;
	public String ad;
	public String adres;
	public String telefon;
	public double TemelMaas;
	public double maasKatSayisi;
	
	
	
	
	public Personel(String tur, String ad, String adres, String telefon, double temelMaas,
			double maasKatSayisi) {
		super();
		this.id = UUID.randomUUID().toString();
		this.tur = tur;
		this.ad = ad;
		this.adres = adres;
		this.telefon = telefon;
		TemelMaas = temelMaas;
		this.maasKatSayisi = maasKatSayisi;
	}
	

}
