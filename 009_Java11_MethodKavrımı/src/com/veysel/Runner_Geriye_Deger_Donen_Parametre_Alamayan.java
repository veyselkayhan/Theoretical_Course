package com.veysel;

import java.util.Random;

public class Runner_Geriye_Deger_Donen_Parametre_Alamayan {

	public static void main(String[] args) {
		
		for(int i=0;i<15;i++) {
			System.out.println(rastgeleSayiUret());
		}
		System.out.println("Uygulama Sonlandı");
		}
	static int rastgeleSayiUret() {
		Random rd=new Random();
		int result=rd.nextInt(20)*5;
		return result;
	}
	

}
