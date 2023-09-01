package com.veysel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.veysel.entity.Ogrenci;

public class Runner {
	public static void main(String[] args) {
		/*
		 * 
		 * Bilgisayar sistemlerinde kullanmakta olduğunuz herşey bir dosyadan ibarettir.
		 * Bunlar farkli programlar tarafından üretilir ve kullanılırlar.Bir dosya iki
		 * kısımdan oluşur.[FILENAME].[TYPE]->resim.jpg,documan.doc.muzik.mp3...
		 * 
		 * 
		 */
		dosyayaYaz();
		System.out.println(dosyadanOku().toString());
		System.out.println("İşlem Tamamlandı");
		
		

	}

	/*
	 * 
	 * Bir dosyaya bilgi kayıt etmek,yani dosya içine yazmak için kullanıyoruz.
	 * 
	 */

	private static void dosyayaYaz() {
		Ogrenci ogrenci = new Ogrenci("Murat Taş", "Ankara", "0555 555 55 55");
		try {
			FileOutputStream file = new FileOutputStream(
					"C:\\Users\\VK\\Desktop\\Java11 Work Space\\Eclipse Work Space\\042_Java11_Serialization\\src\\com\\veysel\\ogrenciBilgisi.txt");
			ObjectOutputStream write = new ObjectOutputStream(file);
			write.writeObject(ogrenci);
			write.close();
		} catch (Exception e) {
			System.out.println("Dosya yazma işleminde hata" + e.toString());
		}

	}

	private static Ogrenci dosyadanOku() {
		Ogrenci ogrenci = null;
		try {
			FileInputStream file = new FileInputStream(
					"C:\\Users\\VK\\Desktop\\Java11 Work Space\\Eclipse Work Space\\042_Java11_Serialization\\src\\com\\veysel\\ogrenciBilgisi.txt");
			ObjectInputStream read = new ObjectInputStream(file);
			ogrenci = (Ogrenci) read.readObject();
		} catch (Exception e) {
			System.out.println("Dosya Okuma Hatası...."+e.toString());
		}return ogrenci;
	}
}
