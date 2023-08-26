package com.veysel;

public class Runner_Ornek2 {
public static void main(String[] args) throws Exception {
	String gizliSifre=sifreGirGizle("Ali");
}

/*
 * 
 * şifre 8 ile 16 haneli olmalıdır.
 * 
 * Exception -> girilen şifre kritere uymaz ise hata fırlatır....
 * 
 */

public static String sifreGirGizle(String sifre) throws Exception{
	if(sifre.length()>=8 && sifre.length()<=16) {
		return "gizlenmiştir";
	}else {
		throw new Exception("Salak mısın Cemile--->sifre gizleme hatası: sifre uzunlugu 8-16 karakter arası olmalıdır.");
		
	}
}

}
