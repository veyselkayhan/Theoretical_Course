package com.zeynep.Ornek2.entity;

import java.util.UUID;

public class Kategoriler {

	private String id;
	private String ad;

	public Kategoriler(String ad) {
		super();
		this.id = UUID.randomUUID().toString();
		this.ad = ad;
	}

	@Override
	public String toString() {
		return "Kategoriler [id=" + id + ", ad=" + ad + "]";
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
