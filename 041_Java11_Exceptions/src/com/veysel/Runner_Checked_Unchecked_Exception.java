package com.veysel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Runner_Checked_Unchecked_Exception {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		/*
		 * 
		 * İstisnaların her zaman hata verme olasılığının bazı kodlarda cok düşüktür.
		 * Bu nedenle her koda try... bloğu yazmak anlamsız olacaktır.Cünkü her yere try
		 * yazarsanız kodun okunurluğu azalacaktır. ve karmaşıklığı artacaktır.
		 * 
		 * 
		 */
		
		/*
		 * 
		 * Checked Exception: derleme zamanında kontrol edilirler bu nedenle bu kodları kullanacak olan programcının 
		 * bu istisnaları göz önünde bulundruarak ele alması zorunludur.
		 * methodların tanımlarında methodun bir hata fırlatacağı açık olarak belirtilir ve bu işlem
		 * kodsal olarak throws ile tanımlanır.Methodun read.me sine bakarsanız orada fırlatacağı hatayı
		 * ve detaylarını görebilirsiniz. 
		 * Checked exceptionları yönetmek;
		 * 1.Yöntem : ilgili methodun ad kısmından sonra gelen parantezlerin sonunu şu ifadeleri ekleyin.
		 * throws [ISTISNA TURU]
		 * 2.Yöntem: istisna fırlatacak olan kod bloğunun tamamını bir try..catch bloğu içine alınması ve tüm
		 * istisna türlerinin catch ile nitelemesi.
		 * 
		 */

		BufferedReader br;
		try {
			
			br= new BufferedReader(new FileReader("Deneme.txt"));
			String line=br.readLine();
			System.out.println("Okunan Date....:"+line);
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Okunmak istenilen dosya bulunamadı..");
		}catch (IOException e) {
			System.out.println("Dosya Okuma Yazma Hatası");
		}
		System.out.println("Dosya Okuma Tamamlandı.");
	}
	
	
	

}
