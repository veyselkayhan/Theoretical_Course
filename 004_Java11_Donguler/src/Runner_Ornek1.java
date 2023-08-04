import java.util.Scanner;

public class Runner_Ornek1 {

	public static void main(String[] args) {

		/**
		 * Kullanıcıdan 3 sayı alıp aldığı sayıyı ekrana yazdıracak
		 * 
		 */
		/*
		 * Scanner sc=new Scanner(System.in); System.out.print("1.sayıyı Giriniz"); int
		 * sayı1=sc.nextInt(); System.out.print("2.sayıyı Giriniz"); int
		 * sayı2=sc.nextInt(); System.out.print("3.sayıyı Giriniz"); int
		 * sayı3=sc.nextInt(); int toplam=sayı1+sayı2+sayı3;
		 * System.out.println("Toplam...."+toplam);
		 * 
		 */
		/*
		 * 
		 * Ödev!!!!!!!! Kullanıcadan kaç adet sayı girmek istediğini bilgisini alan ve
		 * istediği kadar sayıyı kullanıcıdan alıp toplamını bulup ekrana yazdıracak
		 * (for döngüsü kullanılacak)
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);// input alım için
		System.out.print("Kaç Adet Sayı Gireceksiniz..:");// Girilecek Sayı adeti
		int i = sc.nextInt();
		int toplam = 0;
		int n = i;
		for (int j = 1; j <= i; j++) {
			System.out.print((n--) + " Sayıyı Giriniz :");
			int k = sc.nextInt();
			toplam += k;
		}
		System.out.print("Toplam...:" + toplam);
		sc.close();
	}// main sonu
}// class sonu
