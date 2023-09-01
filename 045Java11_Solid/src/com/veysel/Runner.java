package com.veysel;

public class Runner {

	public static void main(String[] args) {
		
		/*
		 * 
		 * SOLID
		 * Amaç;
		 * 1-Yazmış olduğunuz kodun daha esnek ve geliştirilebilir olmasını sağlar..
		 * 
		 * 2-Yeniden kullanılabilirliği artırır.
		 * 
		 * 3-Kodlarınızın anlaşışır olmasını sağlar böylelikle kodunuzun okunurluğunu artırırsınız..
		 * 
		 * 4-Kodların tekrar etmesini önler.Gereksiz tekrarları ortadan kaldırır.
		 * 
		 * 5-Eğer SOLID uyumlu kod yazarsanız kod düzenlemeleri azalır ve zamandan tasarruf sağlar.
		 * 
		 * ----- *S->Single Responsbility-Tek Görev İlkesi; -----
		 * 
		 * Bir sınıf interface yada methodun sadece tek bir görevinin olması durumudur.//tek bir görev vereceksin......
		 * 
		 * Orn : save();-IPostRepository.class-findById();-findAllByUserNameAndGreaterThenMemberDate();
		 * 
		 * ----- *O-> Open/Closed -> Aciklik Kapalilik ilkesi; -----
		 * 
		 * Bir sinif ya da method tanimlanacaği en son nihayi haliyle kodlanir.Böylece değişme kapali olur..
		 * 
		 * Ancak,bu sinif ya da methodların tümü gelişime açık olmalıdır.
		 * 
		 * 
		 * ----- *L-Liskov Substutition -> Liskov İlkesi -----
		 * 
		 * Gereksiz method kullanımlarından ve tanımlarından uzak durulmalıdır.Ortak kullanılan method 
		 * 
		 * tanımlarını miras alarak azaltmak doğru yöntemdir.Ancak ek özellik olarak extends Interface kullanarak eklemelisiniz.
		 * 
		 * 
		 * ----- *I-Interface Segregation - Genel Arayüz Tanımlama İlkesi -----
		 * 
		 * Uygulama içinde tanımlı olan sorumlulukları ve arayüzleri mümkün olduğunca tekbir çatı altında toplamaya çalışın..
		 * 
		 * 
		 * ORN..: IPostRepository
		 *        ICommentRepository.....
		 *        ->JpaRepository
		 *          -> ListCr
		 *          
		 *          
		 * ----- *D-Dependency Inversion - 
		 * 
		 * Sınıflarımız arasında bağımlılıklar kaçınılmazdır ancak bunlar arasında kuracağımız ilişkiyi zayıflatmak zorundayız..
		 *          
		 */

	}

}
