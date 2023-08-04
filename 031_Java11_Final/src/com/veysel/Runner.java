package com.veysel;

public class Runner {

	public static final double PI=3.14;
	// böyle sabit değişmez parametreler varsa onları tanımlamak için yapıyoruz..
	public static void main(String[] args) {
		/*
		 * final->önüne geldiği tanımın değişmezliğini garanti eder.
		 * eğer final değişkeni bir değeri tanımlıyor ise bu değişken sadece 1 kez değer ataması yapılabilir.
		 * final değişkenler mutlaka ama mutlaka değer atanarak kullanılmalıdır,yani uygulama ayağa kalkmadan
		 * sınıf içinde tanımının atamasının yapılmış olması gereklidir.
		 * 
		 */

		int sayi=5;
		sayi=453;
		final int degizmez_deger=90;
//		degizmez_deger=554; değer atadık final olduğu için değer atamasını kabul etmedi....Tek 1 sefer değer ataması yapılır.
		
		
	}

}
