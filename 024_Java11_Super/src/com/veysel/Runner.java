package com.veysel;

import com.veysel.entity.Araba;
import com.veysel.entity.Arac;
import com.veysel.entity.Ucak;

public class Runner {

	public static void main(String[]args) {
		
		Araba araba=new Araba(18,35);//1
		Ucak ucak=new Ucak();//2
		
		new Araba();//3
		new Ucak();//4
		new Ucak();//5
		ucak=new Ucak();//6
		Arac arac=new Arac();//7
		
		System.out.println("Uretilen Arac Sayısı..."+arac.getAracUretimSayısı());//7 çıkar çıktı
		
	}
}
