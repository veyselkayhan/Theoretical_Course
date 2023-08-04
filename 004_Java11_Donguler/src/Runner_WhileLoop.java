import java.util.Scanner;

public class Runner_WhileLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("*******************************");
		System.out.println("********HESAP İŞLEMLERİ********");
		System.out.println("*******************************");
		System.out.println("1-Toplama");
		System.out.println("2-Çıkarma");
		System.out.println("3-Çarpma");
		System.out.println("4-Bölme");
		System.out.println("5-Mod");
		System.out.println("0-ÇIKIŞ");
		
		int secim=1;
		while(secim!=0 && secim<=5) {
			System.out.println("Seçiniz.......");
			secim=sc.nextInt();//kulanıcıdan  bir değer almaya yarıyor seçim değişkenine atıyor....!!!! öncesinde class oluşturman lazım 1
		}
		System.out.println("Uygulama Sonlandı....");
sc.close();
	}

}
