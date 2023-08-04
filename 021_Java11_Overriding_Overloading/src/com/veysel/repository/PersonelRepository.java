package com.veysel.repository;

import com.veysel.entity.Hizmetli;
import com.veysel.entity.Mudur;
import com.veysel.entity.Muhendis;

public class PersonelRepository {
	/*
	 * 
	 * Personellerin kayıt edilmesini sağlamak.
	 * 
	 * Burada işlemleri yapan tek bir sınıf ve işlem yapma 
	 * şekli tek.
	 * 
	 * O zaman farklı türleri tek bir method ile nasıl kayıt edeceğiz.
	 * 
	 * 
	 * 
	 */
	
	public void save(Mudur mudur) {
		
		System.out.println("Müdür "+mudur.ad+" bey kaydedildi" );
	}
	public void save(Hizmetli hizmetli) {
		
		System.out.println("Hizmetli "+hizmetli.ad+" bey kaydedildi" );
	}
	public void save(Muhendis muhendis) {
		
		System.out.println("Muhendis "+muhendis.ad+" bey kaydedildi" );
	}
	
	
	public void uptade(Mudur mudur) {
	}
	public void uptade(Hizmetli hizmetli) {
	}
	public void uptade(Muhendis muhendis) {

	}
	
	
	
	
	

	
	public void delete(Long id)	{
	}
	
	
	public void findAll() {
	}
	
	

}
