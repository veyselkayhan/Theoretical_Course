
public class Runner {

	public static void main(String[] args) {
	/*
	 * 
	 * Bir data type için çoklu veri saklama modeli olarak kullanabileceğimiz değişkenlere
	 * Array diyoruz.Kullanım şekli ve gösterimi şu şekildedir.
	 * int[] sayi_dizisi;
	 * String []ifade_dizisi;
	 * boolean[]onay_dizisi;
	 * İstediğimiz bir değişken türünün dizisini oluşturabiliriz.Yukarıda yapılan tanım değişken tanımıdır.
	 * Tam kullanım ve değer atama işlemi için initialize(başlatma)nız gereklidir.
	 * 
	 * sayi dizisi=new int[]; var olan değişken başlatma
	 * double[]tutarlistesi=new double[3];	
	 * değer atamaları yapılmamış anca başlatılmış dizi içinde ne barındırır??
	 * int inr_dizisi={4,333,-32,-3,-567,544}//dolu hali
	 * int_dizisi_bos={0,0,0,0,00//yani dizi olarak kullandığımız değişkenin default değeri ne ise o değer ile dizinin içi doldurulur.
	 * 
	 * 
	 * 
	 */

		int[] sayilar;//tanım
		sayilar=new int[5];//atama,başlatma.bir dizi mutlaka başlatılmalıdır.Yoksa "NullPointerException"fırlatır.
		//dizi başlatılırken boyutunu belirtmek zorundasınız.
		String[] gunler=new String[7];
		double[] fiyatlar=new double[7];//{0.0,0.0,0.0,0.0,0.0}
		
		
		
		
		
		
	}

}
