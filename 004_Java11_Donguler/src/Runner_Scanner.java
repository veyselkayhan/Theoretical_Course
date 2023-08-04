import java.util.Scanner;

public class Runner_Scanner {

	public static void main(String[] args) {
		
		
		/*
		 * scanner sc -> tarama işlemi yapmak..
		 * Scanner sc -> değişken 
		 * int sayı
		 * new Scanner() -> yeni bir tarama işlemi tanımla 
		 * System -> bu bilgisayar , işletim sistemi
		 * input -> sisteme yapılan girişleri tara..
		 * Sisteme yapılacak inputları scan et ara.....
		 * 
		 * 
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir Sayı Giriniz....");
		int sayı1=sc.nextInt();//Uygulamayı Çalıştırıp bekliycek bilgi girişi yapmayı bekler...
		System.out.println("Girmiş olduğunuz sayı......:"+sayı1);
		System.out.println("İkinci Sayıyı Gir");
		int sayı2=sc.nextInt();
		System.out.println("Girmiş olduğunuz ikinci sayı ......:"+sayı2);
		int toplam = sayı1+sayı2;
		System.out.println("Girilen sayıların toplammı"+toplam);		
	sc.close();
	}

}
