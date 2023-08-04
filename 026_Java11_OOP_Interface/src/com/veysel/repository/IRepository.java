package com.veysel.repository;

import java.util.List;

public interface IRepository {

	
	/*
	 * 
	 * Interface ler sözleşmeler olarak nitelendirilir.
	 * yazılım geliştirirken belli kurallara uymak 
	 * yazılım düzenini korumak için kullanılır.Ayrıca sınıfların
	 * referanslarını taşıyabilirler.
	 * 
	 * 1-Interface lerde  method tanımları erişim belirteci içermezler..(public private protect gibi....)
	 * 2-Methodların gövdesi yoktur.Methodlara gövde yazılmaz...
	 * 
	 */
	
	void save();
	void uptade();
	boolean delete(Long id);
	List<?>findAll();
	List<?>findByAd(String ad);
	
	
	
}
