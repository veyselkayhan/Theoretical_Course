
public class Runner {

	public static void main(String[] args) {
		/*
		 * LOOP CONTROL - DÖngü
		 * 
		 * 1-For Loop
		 * Tanımla
		 * ------ i 0 dan başlayacak 1 er artarken i belli bir değerden küçük olduğu müddetçe döngü devam edecek. 
         * Parantezin içinde bulunan koşul doğru olduğu sürece döngü devam eder.  
         *   
		 * for(int i=0;i<[değer];i++){
		 * // döngüye tabi tutulacak kodlar
		 * }
		 * 
		 * 2-while Loop
		 * () parantezlerin içi doğru-true olduğu sürece döngü çalışmaya devam eder.
		 * while (true){
		 * 
		 * }
		 * NOT: Tüm döngüler birbirleri yerine kullanılabilir ancak kodlama gereği belli 
		 * koşullarda kodun okunulabilirliği ve büyük döngülerde performans için döngü tercihleri değişebilir.
		 * 
		 * 3-> do .. while Loop
		 * dikkat ediceleği üzere diğer döngülerin aksine önce koşul kontrolü yapılmıyor.Önce kod gövdesi 
		 * 
		 * 
		 */
		/*
		System.out.println("********While Döngüsü*************");
		int sayac=5;
		while(sayac<20) {
			System.out.println("Sayac.....:"+sayac);
			sayac++;
		*/
		
		// }
	
		//for (int sayac=5;sayac<20;sayac++){} ------> for daha derli topludur while göre for döngüsünde kendimize ait değişken tanımlanır.
		
		 /*Adımızı 10 defa ekrana yazdırma
		  * 1.Adım --> i=0, i 10 dan küçük müdür true-doğru o zaman kod bloğu çalıştır.i bir arttır.
		  * 2.Adım -> i=1, i 10 dan küçük müdür
		  * 
		  */
	
		/* System.out.println("********For Döngüsü*************");
		  for(int i=0;i<10;i++) {
			System.out.println(i+"Kayhan");
			  
		  }
		 */// System.out.println("Program Sonlandı");
		
		 
		 /*Onemli!!!
		  * 
		  * Herhangi bir method,if for vs. yapısının sınırlarını belirlemek üzere {} parantez kullanılır.
		  * Bunlar sınırları belirler ve kodlar bu bloklara yazılır.Ancak belli durumlarda parantezlerin olmaması ilgili kodların bu bloklar
		  * içinde yer almasına engel değildir.
		  * 1-if blogundan sonra ilk kod satırı if'e aittir.
		  * 2-kodlama kod satırı ile ifade edilene şey kodun yazıldığı yer ile; arasında kalan kıs
		  * 
		  */
		/* System.out.println("Buradan başlayalım");int i=0;i=34;int toplam=i+6974;System.out.println("Sonuc.....");
		 
		 for(int i1=3;i1<9;i1++) 
			 System.out.println("Bunu tekrar et");
		 
		 
		 /*
		  * Dikkat!!
		  * kodlama yaparken en çok karşılacağımız hatalardan biri,
		  * genellikle kodlama satırı bitince ; ile kodu sonlandırırız,ancak döngüsü ()leri
		  * olan kodlardan kullanmak döngünün işlevini yitirmesine sebebiyet verir.
		  * 
		  */
		 
		 /*int k =234;
		 System.out.println("sdsdad");
		 for (int ahmet_amca_nasılsın=0;ahmet_amca_nasılsın<4;ahmet_amca_nasılsın++) {
			 System.out.println("Burası Döngü olarak çalışamayacak");
			 
		 }
		 System.out.println("Program Sonlandı");
		 
		 /*
		  * Sonsuz Döngüler
		  * 
		  * Dikkat!!
		  * döngüler koşul sağladığı müddetçe döngü devam eder,
		  * 
		  */
		 // Sonuza Gider !!!!!!!!!!!!!!!!!!!!
		 /*
		 int dongu=0;
		 for(;dongu<1;){
				 System.out.println("Dongü Devam ediyor......");
				 
		 }*/
		 
		/* int dongu=0;
		 for(;dongu<1;){
				 System.out.println("Dongü Devam ediyor......");
				 dongu++;
		 }
		 
		 /*Dikkat!!!!!
		  * bir yerde sonsuz bir döngü var ise devamında ki kodların bir önemi yoktur.
		  * 
		  */
		 //for(;;)
			// System.out.println("Sonsuza Kadar Dönerim");
		 
		// System.out.println("Program Sonlandı.");
		 
		 System.out.println("******** While-Do ********");
		
		 
		 
		 int d =1;
		 
		 while(d<=1) {
			 System.out.println("While döngüsü çalışıyor");
			 d++;
		 }
		 do {
			 System.out.println("Do döngüsü çalışıyor");
			 d++;
		} while (d <= 1);
}
	
}
