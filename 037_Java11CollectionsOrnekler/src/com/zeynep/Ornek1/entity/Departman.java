package com.zeynep.Ornek1.entity;

import java.util.UUID;

public class Departman {

	private String id;
	private String ad;
	private String yetkiliPersonel;
	private int gorevTanimi;

	@Override
	public String toString() {
		return "Departman [id=" + id + ", ad=" + ad + ", yetkiliPersonel=" + yetkiliPersonel + ", gorevTanimi="
				+ gorevTanimi + "]";
	}

	public Departman(String ad, String yetkiliPersonel, int gorevTanimi) {
		super();
		this.id = UUID.randomUUID().toString();
		this.ad = ad;
		this.yetkiliPersonel = yetkiliPersonel;
		this.gorevTanimi = gorevTanimi;
	}

	public String getId() {
		return id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getYetkiliPersonel() {
		return yetkiliPersonel;
	}

	public void setYetkiliPersonel(String yetkiliPersonel) {
		this.yetkiliPersonel = yetkiliPersonel;
	}

	public int getGorevTanimi() {
		return gorevTanimi;
	}

	public void setGorevTanimi(int gorevTanimi) {
		this.gorevTanimi = gorevTanimi;
	}

}
