package com.veysel;

public class Runner {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * 
		 * main thread
		 * 
		 */

		Deger deger = new Deger();
		deger.sayi = 100;
		System.out.println("Değer...: " + deger.sayi);

		Arttirim A = new Arttirim(deger);
		Eksiltim E= new Eksiltim(deger);
		A.start();
		E.start();
//		System.out.println("Uygulama basladi");
//		MyThread mt = new MyThread();
//		MyRunnable mr = new MyRunnable();
//		Thread t = new Thread(mr);
//
//		mt.start();
//		t.start();
//
//		System.out.println("Uygulama sonlandi");
		
		
	}

}

class Deger {
	public int sayi;
}

class MyThread extends Thread {

	public void run() {
		System.out.println("MyThread Calismaya Basladi");
		try {

			for (int i = 0; i < 3; i++) {
				System.out.println("1.İşlem adım " + (i + 1));
				Thread.sleep(1000L);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("MyRunnable Calismaya Basladi");
		try {

			for (int i = 0; i < 4; i++) {
				System.out.println("2.İşlem adım " + (i + 1));
				Thread.sleep(600L);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Arttirim extends Thread {
	Deger d;

	public Arttirim(Deger d) {
		this.d = d;
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			d.sayi++;
			System.out.println("Arttırım.... " + d.sayi);
		}
	}
}

class Eksiltim extends Thread {
	Deger d;

	public Eksiltim(Deger d) {
		this.d = d;
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			d.sayi--;
			System.out.println("Eksiltim.... " + d.sayi);
		}
	}
}
