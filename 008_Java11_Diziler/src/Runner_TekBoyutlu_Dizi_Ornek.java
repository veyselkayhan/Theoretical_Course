import java.util.Scanner;

public class Runner_TekBoyutlu_Dizi_Ornek {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
//		int[]sayilar=new int[4];
		// değer okumak ve değer atamak
		/*
		 * DİKKAT!!!!!!!
		 * dizilerde ki index numaraları 0 dan başlar.
		 * index=0,......
		 * 
		 */
		
//		sayilar[3]=43;//atama yorumu
//		System.out.println(sayilar[0]);
//		System.out.println(sayilar[1]);
//		System.out.println(sayilar[2]);
//		System.out.println(sayilar[3]);//çıktı 43
		
		
//		for(int i=0;i<6;i++)//index dediğimiz şey i nin kısaltmasıdır.Bundan dolayı sayacta kullanılır.
//			
//		System.out.println(sayilar[i]);// yukarıdaki yazımla aşağı aynısını yapıyor.
//		
		/*
		 *Kullanıcıdan istediği kadar sayı alabilen ve bunları ekrana yazdıran kodu yazınız.. 
		 */
		
		System.out.print("Kaç Sayı Girilecek: ");
		int adet=sc.nextInt();
		int[]sayı_dizisi=new int[adet];
		for(int i=0;i<adet;i++) {
			System.out.print(i+1+". Sayıyı Giriniz :");
			int sayi=sc.nextInt();
			sayı_dizisi[i]=sayi;
			
		}
		for(int i=0;i<adet;i++)
			System.out.println(sayı_dizisi[i]);
		
		
		
		
	}

}
