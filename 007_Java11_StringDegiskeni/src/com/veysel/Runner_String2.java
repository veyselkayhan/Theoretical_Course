package com.veysel;

import java.util.Scanner;

public class Runner_String2 {

	public static void main(String[] args) {
		
		String ka="Admin",sf="123";
		Scanner sc=new Scanner(System.in);
		System.out.print("Kullanıcı Adı Giriniz :");
		String kullanici=sc.next();
		System.out.print("Şifre :");
		String sifre=sc.next();
		
		/*
		 * İşlemi iki nesne için adresleri eşit midir?diye kontrol yapar.nesnelerin içinde
		 * var olan bilginin eşitliğini sorgulamaz.Bu nedenle iki String değişkenini 
		 * adresleri eşit midir? diye kontrol eder.
		 * 
		 * Bu tarz referans data typeların bileşenlerini properties kontrolü meyhodları
		 * aracılığı ile yapılır.
		 * String için by equalsdır.
		 * 
		 */
		
		if(ka.equals(kullanici) && sf.equals(sifre)) {
			
			System.out.println("Sisteme Girildi");
		}
		else {
			System.out.println("Kullanıcı Adı veya Şifre Hatalı");
		}
	}

}
