import java.util.Scanner;

public class Runner_Okul_Otomasyonu {

	public static void main(String[] args) {
		/*
		 * 
		 * Okul Otomasyonu yazılacak.
		 * Sınıf listesi tanımlanacak.
		 * Öğrenciler eklenecek
		 * ders notları girilecek.
		 * sınıf listeleri olacak.
		 * not ortalaması listenecek 
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int sinif_mevcudu=3;
		String[][] sinifLİstesi=new String[sinif_mevcudu][3];
		String[] mat_notlari=new String[sinif_mevcudu];
		
		
		
		int secim=1;
		while(secim!=0) {
		System.out.println("*******************");
		System.out.println("**Okul Otomasyonu**");
		System.out.println("*******************");
		System.out.println("");
		System.out.println("1-Öğrenci Tanımlama");
		System.out.println("2-Öğrenci Listesi");
		System.out.println("3-Not Girişi");
		System.out.println("4-Sınıf Notları");
		System.out.println("0-Çıkış");
		System.out.println("");
		System.out.println("İslem Seciniz");
		int secim1=sc.nextInt();
		
		
		
		switch(secim1) { 
		case 1:
			System.out.println("*********************");
			System.out.println("**Öğrenci Tanımlama**");
			System.out.println("*********************");
			
			//!!DİKKAT!! Scanner farklı tür inputlarda kapatılmalıdır,tekrardan açılmamlıdır.//Diğer türlü Buga giriyor.
			for (int i = 0; i < sinif_mevcudu; i++) {
			    System.out.println((i + 1) + ". Öğrencinin Okul Numarası.....:");
			    sinifLİstesi[i][0] = sc.next();
			    
			    sc.nextLine(); // Consume the newline character left in the buffer
			    
			    System.out.println((i + 1) + " Öğrencinin Adı...");
			    sinifLİstesi[i][1] = sc.nextLine();
			    
			    System.out.println((i + 1) + " Öğrencinin soyadı..:");
			    sinifLİstesi[i][2] = sc.nextLine();
			}

			
		break;
		case 2:
			System.out.println("********************");
            System.out.println("**Öğrenci Listesi**");
            System.out.println("*******************");
            System.out.println(" ");
            
            for (int i = 0; i < sinif_mevcudu; i++) {
                System.out.printf("%s    %s   %s  \n", sinifLİstesi[i][0], sinifLİstesi[i][1], sinifLİstesi[i][2]);
            }
			
			break;
		
		case 3:
			System.out.println("**************");
			System.out.println("**Not Girişi**");
			System.out.println("**************");
		
			
			for (int i = 0; i < sinif_mevcudu; i++) {
				
				System.out.println("Kaçıncı Öğrenci");
				int secilen=sc.nextInt();
				 System.out.println(sinifLİstesi[i][0]+sinifLİstesi[i][1]+sinifLİstesi[i][2]);
				System.out.println("Öğrencinin Puanı:");
			    sinifLİstesi[i][secilen] = sc.next();
			    
			   
			    
			   
				
				
				
				
				
				
            }
			
			
			
			
			break;
		
		case 4:
			System.out.println("******************");
			System.out.println("**Sınıf Notları**");
			System.out.println("*****************");
		break;
		case 0:
			System.out.println("Çıkış Yapıldı");
			
		default:
			System.out.println("Geçersiz İşlem");
			break;
		
		}
		
		
		
		
		}
		
		
	}

}
