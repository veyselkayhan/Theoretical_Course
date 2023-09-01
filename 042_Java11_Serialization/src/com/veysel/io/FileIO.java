package com.veysel.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileIO {

	/*
	 * 
	 * Nesnei verilen sınıfın bilgilerini dosya adı ile kayıt edeilir.
	 * o-> kayıt etmek istediğimiz sınıf nesnesini giriniz
	 * fileName-> kayıt etmek istediğiniz dosya adını giriniz..
	 * 
	 */
	
	
	//input output bu şekilde yazdık
	public void addFile(Object o,String fileName) {
		try {
			FileOutputStream write = new FileOutputStream(fileName);
			ObjectOutputStream obj = new ObjectOutputStream(write);
			obj.writeObject(o);
			obj.close();
		} catch (Exception e) {
			System.out.println("Dosya yazma hatası.....:"+e.toString());
		}
	}
	
	public Object getClass(String fileName) {
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream read= new ObjectInputStream(file);
			return read.readObject();
		} catch (Exception e) {
			System.out.println("Dosya Okuma Hatası "+e.toString());
			return null;
		}
		
	}
	
}
