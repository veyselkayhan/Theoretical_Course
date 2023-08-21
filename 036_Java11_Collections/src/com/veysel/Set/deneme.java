package com.veysel.Set;

import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import com.veysel.entity.Ogrenci;

public class deneme {
public static void main(String[] args) {
	
	Set<Ogrenci>   yeniListe = TreeSet <Ogrenci>;
	Ogrenci ogr5 = new Ogrenci("a", "b", "b", "a", 123123L, "a");
	Ogrenci ogr6 = new Ogrenci("b", "b", "b", "a", 123123L, "a");
	Ogrenci ogr7 = new Ogrenci("c", "c", "c", "a", 123123L, "a");

	yeniListe.add(ogr7);
	yeniListe.add(ogr6);
	yeniListe.add(ogr5);
	
	for(Ogrenci a : yeniListe) {
		System.out.println("***************");
		System.out.println(a.getAd());			
	}
}
}
