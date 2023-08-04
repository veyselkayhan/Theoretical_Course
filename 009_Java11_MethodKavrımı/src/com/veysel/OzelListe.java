package com.veysel;

public class OzelListe {
	int[] sayiDizisi;
	int boyut = 0;

	public void add(int sayi) {
		if (sayiDizisi == null) {
			sayiDizisi = new int[boyut + 1];// null tanımsız hemen boyutu tanımladık.
		}
		sayiDizisi[boyut] = sayi;
		boyut++;

	}

	/*
	 * 
	 * verilen index te bulunan sayısı diziden siler index-> silmek istediğiniz
	 * sayının index numarasını giriniz.
	 * 
	 * 
	 * Bir dizi içine istenilen index numarasını eleman eklemek için kullanılır.
	 * ÖRn{2,58,9,980,81,24} addIndex(3,900);// boyut=5;
	 * 
	 */

	public void remove(int index) {

	}

	public static void main(String[] args) {

	}

	public void addIndex(int index, int value) {
		int[] tmp = new int[boyut + 1];// 6 elemanlı boş dizi oluşturduk
		int j = 0;
		for (int i = 0; i < boyut + 1; i++) { // {2,58,9,980,0,0}
			if (index == i) {
				tmp[i] = value;
				j++;
			} else {
				tmp[i] = sayiDizisi[i - j];
			}
		}
		sayiDizisi = tmp;
		boyut++;

	}

}
