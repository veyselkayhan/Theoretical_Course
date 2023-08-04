
public class Runner_ForLoop {

	public static void main(String[] args) {


		
		
		//1 ile 10 dahil arasındaki sayıları ekrana yazdıran program
		
		//!!ÇÖZÜM
		//for(int i=1;i<=10;i++) {
			//System.out.println(i);
			  
		 // }
		
		//8 ile 21 arasındaki sayıların toplamını bulan kod (8-21);
		
		//toplam döngünün dışında olması lazım çünkü her seferinde kendini sıfırlıyor.
		/*Toplam döngünün içinde -> i=9,i=9 toplam=9
		/*Toplam döngünün içinde -> i=9,i=10 toplam=19
		/*Toplam döngünün içinde -> i=19,i=11 toplam=30
		 *
		 * 
		 */
		/*
		int toplam=0;
		for (int i1=9;i1<21;i1++) {
			toplam += i1;
		}
		System.out.println(toplam);
		// döngüde toplayıp dışarıda yazdırdık 
		
		*/
		
		//1 ile 54 arasındaki tek sayıların toplamını bulup ekrana yazdırma
		// önce tek sayılarıı bul problemi adım adım çöz bütün olarak çözme !!!!!!!!
		
		
		/*
		int toplam=0;
		for (int i=1;i<55;i+=2) {
			toplam+=i;
			}
		System.out.println("Toplam....."+toplam);
		
		*/
		
		// 100 den 33 e kadar çift sayıların toplamını bulun
		/*
		int toplam=0;
		for (int i=100;i>33;i-=2) {
			toplam+=i;
			System.out.println(i);

		}
		System.out.println("Toplam....:"+toplam);
		*/
		



	}

}
