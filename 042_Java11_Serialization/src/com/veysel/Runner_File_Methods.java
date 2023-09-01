package com.veysel;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Date;

public class Runner_File_Methods {
	public static void main(String[] args) throws Exception {

		File file= new File("C:\\Java11Logs\\hata.log");
		System.out.println("Dosya mevcut mudur?...."+file.exists());
		System.out.println("Dosyanın Tam Yol Adı...:"+file.getAbsolutePath());
		System.out.println("Dosyanın Adı...:"+file.getName());
		System.out.println("Dosyanın Konumu"+file.getParent());
		System.out.println("Erişmeye Çalıştığınız yol dosya mıdır..."+file.isFile());
		System.out.println("Dosyanın Boyutu"+file.length()+" byte");
		System.out.println("Dosyanın Değiştirilme Zamani..:"+file.lastModified());
		System.out.println("Dosyanın Değiştirilme Zamanı...."+new Date(file.lastModified()));
		
		/*
		 * Dosyalari manipüle etmek,silmek yerdeğiştirmek gibi işlemler yapabiliriz.
		 * 
		 */
		
		Path path = Path.of("C:\\Java11Logs\\silinecekdosya.txt");
//		Files.delete(path);
		Files.deleteIfExists(path);
		Path pathLog = Path.of("C:\\Java11Logs\\hata.log");
		Files.copy(pathLog, Path.of("C:\\Java11Logs\\Tamamlanan\\bitti.log"),StandardCopyOption.REPLACE_EXISTING);
		Files.move(pathLog, Path.of("C:/Java11Logs/tasinan/tasinan.log"));
		
	}
}
