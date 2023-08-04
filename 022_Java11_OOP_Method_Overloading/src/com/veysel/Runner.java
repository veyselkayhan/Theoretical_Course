package com.veysel;



import com.veysel.repository.HizmetliRepository;
import com.veysel.repository.MudurRepository;
import com.veysel.repository.MuhendisRepository;
import com.veysel.repository.Repository;

public class Runner {
	
	public static void main(String[] args) {
		
	Repository repository=new Repository();
	repository.save();  
	
	MudurRepository mudurRepository=new MudurRepository();
	mudurRepository.save();
	
	HizmetliRepository hizmetliRepository=new HizmetliRepository();
	hizmetliRepository.save();
	
	MuhendisRepository muhendisRepository=new MuhendisRepository();
	muhendisRepository.save();
	

	}
}
