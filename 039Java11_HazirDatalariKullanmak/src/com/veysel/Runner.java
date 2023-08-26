package com.veysel;

import com.veysel.repository.UserRepositoryImpl;

public class Runner {

	
	
	public static void main(String[] args) {
		UserRepositoryImpl userRepositoryImpl = new UserRepositoryImpl();
		userRepositoryImpl.getAllUserList(300).stream().
		filter(x->x.getLocation().getCountry().equals("United States"))
		.forEach(System.out::println);
		
	}
}
