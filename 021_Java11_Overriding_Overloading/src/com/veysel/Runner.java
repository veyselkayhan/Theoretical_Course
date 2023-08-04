package com.veysel;

import com.veysel.entity.Hizmetli;
import com.veysel.entity.Mudur;
import com.veysel.entity.Muhendis;
import com.veysel.repository.PersonelRepository;

public class Runner {
	public static void main(String[] args) {
		
		PersonelRepository repository=new PersonelRepository();
		Mudur mudur=new Mudur("Ahmet");
		repository.save(mudur);
		Hizmetli hizmetli=new Hizmetli("Mustafa");
		repository.save(hizmetli);
		Muhendis muhendis=new Muhendis("Mehmet");
		repository.save(muhendis);
		

	}
}
