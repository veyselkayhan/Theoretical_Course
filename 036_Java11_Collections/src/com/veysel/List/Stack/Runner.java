package com.veysel.List.Stack;

import java.util.Stack;

public class Runner {

	public static void main(String[] args) {

		/*
		 * Stack-> Yığıt yığılma şeklinde çalışır.Son eklenen bilgi listesini tepesine
		 * devam eder.Bu yapıda son eklenen değer her zaman ilk çıkar. 
		 * LIFO->LastInFirstOut Ancak,tüm listeler gibi stack te List interface inin miras
		 * aldığı için liste ait tüm methodları destekler,Lİst içinde var olan methodlar
		 * LIFO mantığına ters gibi görünsede aslında arka planda olan işlemler normlain
		 * üzerinde yapılan aksiyonlarla sağlanır ve bu da performansa zarar verir.
		 * 
		 */

		Stack<String> yigitList = new Stack<String>();

		yigitList.add("Muhammet");
		yigitList.add("Deniz");
		yigitList.add("Hakan");
		yigitList.add("Bahar");
		

		yigitList.forEach(System.out::println);
		System.out.println("---------------------");
		System.out.println(yigitList.get(2));
		yigitList.push("Yeni Değer");
		System.out.println("----------------------");
		System.out.println("Son elaman oku....:"+yigitList.pop());
		System.out.println("-------------------------");
		System.err.println("Son elaman Oku.....:"+yigitList.peek());
		yigitList.forEach(System.out::println);
	
	}

}
