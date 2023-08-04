package com.veysel;

import com.veysel.entity.Mudur;

public class Runner {
	public static void main(String[] args) {
		 Mudur mudur= new Mudur();
		 mudur.ad="Muhammet";
		 mudur.MaasHesapla();
		
		 //abstract sınıf kullanırsak interface gibi şartlar koşulabilir.
		 //neden Kullanalım??
		 /*
		  * Bir çok kullanım şekli vardır.Miras alsanız dahi içini doldurmak zorunda 
		  * olmadan boş gecilecebilecek olabilir.Bunun için abstract mantıklıdır.
		  */
	}

}
