package com.veysel.repository;

import java.util.List;


/*
 * 
 * Interface i miras almak için implements keywords u kullanılır.
 * bir interface i implement ederseniz onunla yaptığınız sözleşme gereği
 * içerdiği tüm methodları almak zorunda ve içerikleri doldurmak zorundasınız.
 * 
 */

public class MusteriRepository implements IRepository{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void uptade() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<?> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findByAd(String ad) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
