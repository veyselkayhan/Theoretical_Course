package com.veysel.exception;

import java.util.Arrays;
import java.util.List;

public class PersonelRepository {

	public List<String>findById(Long personelId){
		if(personelId<1)
			throw new PersonelException("!!!!Personel id Hatası:Geçersiz Numara!!!!");
		return Arrays.asList("Veysel");
	}
}
