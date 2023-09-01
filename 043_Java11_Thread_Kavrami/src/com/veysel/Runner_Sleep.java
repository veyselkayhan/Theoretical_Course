package com.veysel;

public class Runner_Sleep {

	public static void main(String[] args) throws InterruptedException {
		long start = System.nanoTime();
		System.out.println("Uygulama Başladı");
		Thread.sleep(2000L);
		long end=System.nanoTime();
		System.out.println("Uygulama Bitti");
		long time= end-start;
		System.out.println("NanoSaniye....:"+time);
		System.out.println("MiliSaniye....."+time/1_000_000L);
		//1ms=1.000.000 nanoSaniye 
		//1sn=1.000.000.000 ns.
	}
}
