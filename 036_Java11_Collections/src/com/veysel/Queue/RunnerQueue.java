package com.veysel.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class RunnerQueue {

	public static void main(String[] args) {
		Queue<String>hastaneSirasi = new LinkedList<String>();
		hastaneSirasi.add("Muhammet");
		hastaneSirasi.add("Canan");
		hastaneSirasi.add("Temel");
		hastaneSirasi.add("Ayşe");
		hastaneSirasi.add("Aylin");
		
		hastaneSirasi.forEach(System.out::println);
		System.out.println("--------------------------");
		do {
			System.out.println(hastaneSirasi.remove());
		}while(hastaneSirasi.size()>0);
		
	}
}
