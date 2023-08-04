package com.veysel.entity;

public enum Unvanlar {

	
	MUDUR("Mudur",1000),
	MUHENDIS("Muhendis",1001),
	CEVRE("Cevre Düzenleme",1002),
	ASISTAN("Asistan",3000),
	MUHASEBE("Muhasebeci",3001);
	
	 Unvanlar(String ad,int no) {
		this.ad=ad;
		this.no=no;
	}
	
	String ad;
	int no;
	public String getAd() {
		return ad;
	}
	public int getNo() {
		return no;
	}
	
	
}
