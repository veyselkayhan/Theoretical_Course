package Soru.repository;

import java.util.LinkedHashMap;
import java.util.Map;

public class HaftanınGunleriRepository {

	public  Map<String, Integer> gunler = new LinkedHashMap<String, Integer>();
	public   Map<String, Integer>degerler= new LinkedHashMap<String, Integer>();
	
	
	public HaftanınGunleriRepository() {
		gunlerListeOlustur();
	}
	public void gunlerListeOlustur() {
		gunler.put("Pazartesi", 1);
		gunler.put("Salı", 2);
		gunler.put("Çarşamba", 3);
		gunler.put("Perşembe", 4);
		gunler.put("Cuma", 5);
		gunler.put("Cumartesi", 6);
		gunler.put("Pazar", 7);

	}
	public void name() {
		for (Map.Entry<String, Integer> entry : gunler.entrySet()) {
            System.out.println("Key: " + entry.getKey());
        }
	}
	
	public void veriler(String gun,int sayi) {
		degerler.put(gun, sayi);
		for (Map.Entry<String, Integer> entry : degerler.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
	}
	
	
}
