import java.util.Scanner;

public class Runner_Ornek {

	public static void main(String[] args) {
		/*
		 * Girilen 6 adet sayıdan em büyük,en küçük ve ortalamasının bulan kodu yazınız..
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		
		int[] sayilar=new int[6];
		
		for (int i=0;i<6;i++) {
			
			System.out.print(i+1+"Sayı : ");
			int sayi=sc.nextInt();
			sayilar[i]=sayi;
			
		}
		int max=sayilar[0];
		for(int i=1;i<6;i++) {
			if(max<sayilar[i])
				max=sayilar[i];}
		System.out.println("En büyük sayı....: "+max);
		
		
		
		int min=sayilar[0];
		for(int i=1;i<6;i++) {
			if(min>sayilar[i])
				min=sayilar[i];}
		System.out.println("En küçük sayı....: "+min);
		
		
		
		
	}

}
