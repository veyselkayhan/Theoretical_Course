package com.veysel;

public class Runner {

	/*
	 * 
	 * TODO : daha yapılacaklar için bu satırı ekleriz...
	 * 
	 * 
	 */
	public static void main(String[] args) {
		/*
		 * 
		 * 1-Kodlar temiz ve anlaşılır olmalıdır.(Clean code).(Code Smell :)
		 * 
		 * 2-Sınıflarınızda soyutlamaları yaparken,bir varlığın aksiyonlarını
		 * tanımladığınız methodlar mutlaka tek bir iş yapmalıdır.Mümkün olduğu kadar
		 * tek işe odaklandırılmalıdır. (Single responsbility)
		 * 
		 * 3-Sınıflarımızda tanımlamalar yaparken mümkün olduğu kadar az method
		 * kullanın.10-15 method bir sınıf için idealdir. NOT: methodlarınız da ve
		 * sınıflarınızda mutlaka açıklama (comment) satırları olmalıdır.Kendinizi
		 * anlayacak şekilde değil bilmeyen bir yazılımcı baktığında o methodun işlevini
		 * anlayacak şekilde açıklama satırlarını mutlaka ekleyiniz..
		 * 
		 * 4-Bir method tek bir iş yapmalı ve bir method içinde bulunan kod öbeği başka
		 * bir method içinde kopyala-yapıştır mantığı ile kullanılmamalıdır.Eğer
		 * copy-paste yapacağınız bir kod bloğu var ise bu kod öbeği method haline
		 * getirilir diğer methodlar çağrılır...
		 * 
		 * 5-Methodlarımız oluşturulurken kullanılmakta olduğumuz kod satırları
		 * olabileceğince az olmalıdır.Tabiki bunun kısıtşaması zor olsada genel kabul
		 * görmüs şekilde bir method içinde kullanılması gereken kod bloğu sayısı 20-25
		 * satırıdır diyebiliriz.Değişken ve göre kısıtlamasına denk gitmek
		 * gerekir.Mümkün olan argüman sayisi 2 dir.
		 * 
		 * 6-Methodlarınızda kullanmakta oldugunuz karar yapıları , bir method için max
		 * 7-8 karar yapısını geçmeyecek şekilde ilerleyiniz...
		 * 
		 * 7-Sınıfları içinde methodları ilk başlarda küçük olarak yazılır,sonrasında
		 * test e ve canlı ortamda test edilmeye başlanıp projede isterler artmaya
		 * methodlar içindeki kodlar hızla çoğalmaya başlar. Bu durumda kodlarımızın
		 * hızla revize edilmesi gereklidir ve 5.maddede yer aldığı şeklinde
		 * düzenlenmesi gereklidir.
		 * 
		 * 8-Nethodlarımız belli işleri yapmak üzere oluşturulurlar bu nedenle,bir
		 * method a isim verirken yapacağı işi anlatacak şekilde erken bir isim
		 * verilmelidir.
		 * 
		 * (kytPers)Yanlış-> personelKayit Doğru
		 * 
		 * 9-Methodlarımızı oluştururken isimlendirmelerde emir kipi kullanarak,yapacağı
		 * işe ile doğrudan ilişkili olacak şekilde yazacaksınız...
		 * 
		 * 10-Methodlarımızı isimlendirirken javada bir kısaltma yoktur.Bu nedenle
		 * lütfen uzun olacak şekilde isimlendiriniz.
		 * 
		 * Orn: musteriSatislariniUrunGirisTarihlerineGoreSıralıOlacak(long
		 * baslangicTarihi,long bitisTarihi);
		 * 
		 * *****11-Eğer bir methodun adını belirlemekte seçmekte zorluk çekiyor iseniz
		 * mutlaka muhtemelen o method birden çok iş yapıyordur ve yanliş
		 * kurgulanmiştir.
		 * 
		 * Metoda isim veremiyorsan o metodu yanliş yazmışsındır kesinlikle....
		 * 
		 */
	}
}
