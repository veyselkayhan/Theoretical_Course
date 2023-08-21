package com.veysel.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.veysel.entity.Ogrenci;

public class Runner {

	public static void main(String[] args) {

		/*
		 * İçinde öğrenci barındıra bilen onlara bir sıra numarası veren bir liste
		 * sağlar...
		 * 
		 */
		ArrayList<Ogrenci> ogrenciList = new ArrayList<Ogrenci>();// tanımlama bu şekilde.....

		/*
		 * ekleme işlemi, 1-> add(DEGER)-> direkt sıraya ekleme yapar... 
		 * 2->add(Index,Deger)->Istenilen sıraya ekleme yapar. 
		 * 3-> addAll(Dizi)-> bir arrayliste başka bir arraylist i devamına gelecek şekilde ekler.
		 * 4->addAll(Index,Deger)->bir dizinin istenilen sırasından itibaren diğer
		 * diziyi ekler... 
		 * 5->
		 * 
		 */
		Ogrenci ogr = new Ogrenci("Veysel", "Kayhan", "Basri", "555 555 55 55", 105257L, "Mudur");
		Ogrenci ogr1 = new Ogrenci("Murat", "Kayhan", "Basri", "555 555 55 55", 105257L, "Mudur");
		Ogrenci ogr2 = new Ogrenci("Ali", "Kayhan", "Basri", "555 555 55 55", 105257L, "Mudur");
		ogrenciList.add(ogr);
		ogrenciList.add(ogr1);
		ogrenciList.add(ogr2);

		Ogrenci ogr3 = new Ogrenci("Ali Cabbar", "Kayhan", "Basri", "555 555 55 55", 105257L, "Mudur");
		ogrenciList.add(1, ogr3);// burda 1 numaraya 3 numaralı öğrenciyi ekledik...
		System.out.println("--------------------------------------");
		System.out.println("-------Listeden Eleman Çekmek---------");
		System.out.println();
		System.out.println(ogrenciList.get(2));
		Ogrenci ogrenci = ogrenciList.get(1);// öğrenci listesinin içerisinde öğrenci nesnesini ogrenci değişkenine
												// atadık.
		System.out.print(ogrenci.getAd());

		/*
		 * Liste içinden bir elemanı silme işlemi remove(INDEX); remove(Deger);
		 */
//		ogrenciList.remove(ogr1);
		System.out.println("---------------------");
		ogrenciList.forEach(System.out::println);
		System.out.println(ogrenciList.remove(ogr2));
		System.out.println("-------------------------");
		ogrenciList.forEach(System.out::println);

		List<Ogrenci> yeniListe = new LinkedList();
		Ogrenci ogr5 = new Ogrenci("a", "b", "b", "a", 123123L, "a");
		Ogrenci ogr6 = new Ogrenci("b", "b", "b", "a", 123123L, "a");
		Ogrenci ogr7 = new Ogrenci("c", "c", "c", "a", 123123L, "a");

		yeniListe.add(ogr7);
		yeniListe.add(ogr6);
		yeniListe.add(ogr5);
		
		for(Ogrenci a : yeniListe) {
			System.out.println("***************");
			System.out.println(a.getAd());			
		}

		/*
		 * İki listenin Birleştirilmesi
		 * 
		 */

		System.out.println("---------------");
		ogrenciList.forEach(System.out::println);
		ogrenciList.addAll(yeniListe);
		ogrenciList.forEach(System.out::println);

		/*
		 * 
		 * Bir listenin içinde bir nesnenin varlığını kontrol etmek için kullanılır.
		 * contains-> Stringler de kullandığımız için bir ifadenin içinde karakter ya da
		 * ifade aramak gibi bir listenin içinde nesne referasnının olup olmadığını
		 * control eder.Var ise true-yok ise false döner.
		 * 
		 */

		System.out.println("-----------------------------------------------------");
		System.out.println("---------Nesnelerin Arlığını Kontrol Etmek-----------");
		
		ogrenciList.contains(ogr7);
		
		System.out.println("Ogrenci 7 var mı..."+ogrenciList.contains(ogr7));
		ogr7=new Ogrenci("Zeynep", "b", "b", "b", 213L, "g");
		System.out.println("Ogrenci 8 var mı..."+ogrenciList.contains(ogr7));
	
		/*
		 * Bir nesnenin referanslarını tutar,bu nedenle kontrol ederken nesne referanslarını var olup olmadığına 
		 * bakar..
		 * 
		 */
//		ogrenciList.indexOf(ogr7);
//		ogrenciList.lastIndexOf(ogr7);-> eğer bir referans birden fazla kez eklemişse son bulunduğu indexi döner
//		System.out.println(ogrenciList.indexOf(ogr6));
//		ogreciList.clear();-> listeyi temizlemek için kullanılır.
		
		System.out.println("------------------------");
		System.out.println("Ogrenci Listesi boş mu? "+ogrenciList.isEmpty());
		ogrenciList.clear();
		System.out.println("Ogrenci Listesi boş mu? "+ogrenciList.isEmpty());
		
		yeniListe.forEach(System.out::println);
		yeniListe.set(1, ogr7);//-> 1. indexe ekledi.
		System.out.println("------------------------------");
		yeniListe.forEach(System.out::println);
		
		System.out.println("Listenin boyutu...."+yeniListe.size());
		/*
		 * Bazen listelerimiz çok uzun olabilir.Bunları ayrıştırmak isteyebilir. ya da listelerimizin içinde belli aralıklarda
		 * verileri ayrıştırarak okumak isteyebiliriz bu gibi işlemlerde sublist kullanırız.
		 * 
		 */
		System.out.println("--------------------------------------");
		System.out.println("--------Sublist Kullanımı-------------");
		yeniListe=Arrays.asList(ogr,ogr1,ogr2,ogr3,ogr5,ogr6,ogr7);
		yeniListe.forEach(System.out::println);
		System.out.println("--------------------------------------");
		System.out.println("---------Bölünmüş Liste---------------");
		yeniListe.subList(2, 5).forEach(System.out::println);//-> index numarası 2 dahil 5 e kadar olan 5 dahil değildir.
		// böyle tanımlamalarda verilen değerden ilk değer dahil son değer hariç alınır.
		
		yeniListe.subList(3, yeniListe.size());//{1,2,3,4,5,6} // size=6
		
		
	}

}
