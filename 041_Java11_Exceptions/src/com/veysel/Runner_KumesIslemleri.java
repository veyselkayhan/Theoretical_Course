package com.veysel;

public class Runner_KumesIslemleri {



public static void main(String[] args) {
	try {
		KumesIslemleri kumes = new KumesIslemleri();
		int kacTavukVar = kumes.getHayvansayisi(90);
		System.out.println("Tavuk Sayısı...:"+kacTavukVar);
	} catch (Exception e) {
		
	}
	
}
}
