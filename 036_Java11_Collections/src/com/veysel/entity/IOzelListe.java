package com.veysel.entity;

/*
 * Burada list interface in nasıl oluşturulduğu ile ilgili yaklaşım
 * irdelenmiştir.
 * 
 * Özellistelerimizde biz bir dizinin kendi başına genişlemesi daralması gibi
 * işlemleri methodlara özelleştiriyoruz
 * 
 * Generic Data Types
 * 
 * 
 */

public interface IOzelListe <T> {

	void add(T deger);

	void remove(int index);

	int size();

	T [] list();

	T indexOf(int index);

}
