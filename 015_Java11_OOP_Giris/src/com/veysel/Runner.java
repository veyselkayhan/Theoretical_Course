package com.veysel;

import com.veysel.nesnesoyutlama.Kedi;//farklı package olduğu için import et önce

public class Runner {

	public static void main(String[] args) {
		
		Kedi kediAnkara=new Kedi();
		Kedi kediVan=new Kedi();
		System.out.println("Ankara kedisi ac mi??...."+kediAnkara.acMi);
		System.out.println("Ankara kedisi ac mi??...."+kediVan.acMi);
		
		
		
		

	}

}
