package com.veysel;

import com.veysel.entity.Urun;

public class Runner_Satis {

	public static void main(String[] args) {
		/*
		 * Ürün satışı yapacağız ve her satışta stoktan düşecek.
		 * 
		 * 
		 */
		Urun urun1 = new Urun();
		urun1.ad = "Şeker";
		urun1.fiyat = 360;
		urun1.stok--;
		System.out.println("Urun Stok...." + urun1.stok);

		Urun urun2 = new Urun();
		urun2.ad = "Un";
		urun2.fiyat = 54;
		urun2.stok--;
		System.out.println("Urun Stok...." + urun2.stok);

	}

}
