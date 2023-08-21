package com.veysel.List.vector;

import java.util.Vector;

public class Runner {
	/*
	 * 
	 * vector==Arraylist seklinde tanımlaya biliriz ancak önemli bir fark var.
	 * Senkron-> peşi sıra gelen işlemlerdir ve biri itmeen diğeri başlamayan işlemlerdir.
	 * Asenkron->aynı anda birden fazla işlemin yapılması
	 * !!!!!!!!VECTOR SENKRON BİR ŞEKİLDE ÇALIŞIR!!!!!!!!!!
	 * 
	 * 
	 */
	
	
	/*
	 * 
	 * 3 adet is 
	 * 
	 * -------------------------
	 *                          -------------------------
	 *                                                   -------------------------
	 * 
	 * 100 kişilik bir liste var
	 * 1,2,3,4,5,6,7.....,100
	 * 1,4,2,3,8.........100,99
	 * 
	 * Arraylist asenkron işlem yapar.1000 bin data işlecekse aynı anda 10-10 işleyebilir.Böyle düşün.
	 * Performanslı olma sebeplerinden bir tanesi budur.
	 * 
	 * Vector öyle değildir.
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
	
		Vector<String>vectorList=new Vector<String>();
		vectorList.add("Muhammet");
		vectorList.add("Demet");
		vectorList.add("Derya");
		
		System.out.println(vectorList.toString());
		
		
	}

}
