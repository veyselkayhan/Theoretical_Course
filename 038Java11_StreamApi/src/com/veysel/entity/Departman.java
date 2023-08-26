package com.veysel.entity;

import java.util.UUID;

public class Departman {
	
	String id;
	String ad;
	
	
	
	public Departman( String ad) {
		super();
		this.id=UUID.randomUUID().toString();
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "Departman [id=" + id + ", ad=" + ad + "]";
	}
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
	

}
