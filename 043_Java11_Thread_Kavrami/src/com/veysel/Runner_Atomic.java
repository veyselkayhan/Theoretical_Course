package com.veysel;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Runner_Atomic {

	public static void main(String[] args) {
		List<String> isimler = Arrays.asList("Ahmet","Canan","Temel","Bahar","Gül");
//		int sayac=1;
		AtomicInteger sayac = new AtomicInteger(1);
		isimler.forEach(ad->{
			System.out.println(sayac.getAndIncrement() + ". kişi...: " + ad);
		});

	}
}
