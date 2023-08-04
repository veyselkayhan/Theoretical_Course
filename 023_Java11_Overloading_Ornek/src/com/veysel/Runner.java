package com.veysel;

import com.veysel.entity.Balık;
import com.veysel.entity.Kedi;
import com.veysel.entity.Kus;

public class Runner {

	
	public static void main(String[]args) {
	Kus kus=new Kus();
	Kedi kedi=new Kedi();
	Balık balık=new Balık();
	
	kus.hareketEt();
	kedi.hareketEt();
	balık.hareketEt();
	kus.dur();
	
	
	}
}
