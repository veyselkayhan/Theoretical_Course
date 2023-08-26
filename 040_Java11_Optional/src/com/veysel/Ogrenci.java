package com.veysel;

import java.util.UUID;

public class Ogrenci {

	private String id;
	private String ad;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public Ogrenci( String ad) {
		super();
		this.id = UUID.randomUUID().toString();
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "Ogrenci [id=" + id + ", ad=" + ad + "]";
	}
	
	
	
	
	
}
