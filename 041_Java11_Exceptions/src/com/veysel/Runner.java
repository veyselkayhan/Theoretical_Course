package com.veysel;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
public static void main(String[] args) {
	
	/*
	 * Beklenmeyen durumları engellemek bazen mümkün olmaya olmaz,
	 * bu nedenle hata olabilecek tüm kod blokalrını hata olma durumunu
	 * istinaden kontrol altına almamız  gerekir.Bu işlemi yapmak üzere deneyenn
	 * ve bir sorun olduğunda bu sorunu yakalayan kod bloğu ekleriz..
	 * 
	 * 
	 */
	
	
	try {
		System.out.println("***********************************");
		System.out.println("*********Hesap İşlemleri***********");
		System.out.println("***********************************");
		System.out.println();
		Scanner sc= new Scanner(System.in);
		System.out.println("Kaç Sayı kullanacaksınız");
		int adet=sc.nextInt();
		int [] sayilar = new int[adet];
		for(int i=0;i<adet;i++) {
			System.out.println((i+1)+" . sayıyı giriniz...:");
			int sayi = sc.nextInt();
			sayilar[i]= sayi;
		}
		int bölüm=1;
		for(int s:sayilar)
			bölüm/=s;
		int toplam=0;
		for(int s:sayilar)
			toplam+=s;
		System.out.println("Girilen sayıların toplamı : "+bölüm);
		
	} catch (InputMismatchException ex) {
		System.out.println("Lütfen Geçerli bir sayısal değer giriniz"+ex.toString());
	}
	catch (ArithmeticException ex) {
		System.out.println("Lütfen 0 ile bölme işlemi yapmayınız");
	}
	
	catch (Exception ex) {
		System.out.println("Beklenmedik bir hata oluştu.Lütfen IT ekibi ile iletişime geciniz..");
	System.out.println("Oluşan sorun..."+ex.toString());
	System.out.println("Oluşma zamanı..."+System.currentTimeMillis());
	System.out.println("Kullanıcı.."+"Ali veli");
	
	}
	
	/*
	 * Eğer int yerine String verirseniz...: java.util.InputMismatchException
	 * Eğer aritmetik sorun oluyorsa....: java.lang.ArithmeticException:/by zero
	 */
	
	/*
	 * TODO finaly nedir nasıl çalışır??
	 */
	
}
}
