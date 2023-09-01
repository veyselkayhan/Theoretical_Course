package com.veysel;

import com.veysel.entity.Log;
import com.veysel.io.FileIO;

public class RunnerOrnek {

	public static void main(String[] args) {
		int s1=4565;
		int s2=0;
		try {
		int bolum=s1/s2;
			
		}catch (Exception e) {
			Log log = new Log(e.getMessage(), "RunnerOrnek.class", 
					"main", System.currentTimeMillis(),
					"Bölme İşkemi yapılırken oluşan hatadır.Gelen değerleri kontrol" 
					+" edelim"+s1+s2);
			new FileIO().addFile(log, "C:\\Java11Logs\\islem.log");
		}
		System.out.println(new FileIO().getClass("C:\\\\Java11Logs\\\\islem.log"));
	}

}
