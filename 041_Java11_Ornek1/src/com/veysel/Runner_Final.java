package com.veysel;

import java.io.File;
import java.io.FileInputStream;

public class Runner_Final {
	
	
public static void main(String[] args) {
	/*
	 * try satırlarında çalıştırılan kodlarda hata olması durumunda olmaması durumunda da çalışması istenilen kodlamalar olabilir.
	 * Bu kodlamaları yazmanın en doğru şekli finally bloğudur.Kodlar buraya yazılmalıdır..
	 * 
	 */
	
	
	
	try {
	FileInputStream f1= new FileInputStream(new File(""));
	
	}catch (ArithmeticException e) {
		// 
	}catch (NullPointerException e) {
		// 
	}catch (ArrayIndexOutOfBoundsException e) {
		// 
	}catch (Exception e) {
		// 
	}finally {
		/*
		 * 
		 * Buraya her hangi bir durumda olsa yapılması istenilen kodları yazıyoruz.
		 * 
		 */
	}
}
}
