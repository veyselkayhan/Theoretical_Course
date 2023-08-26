package com.veysel;

public class KumesIslemleri {
	
	/*
	 * 
	 * Bir kullanıcının kümesleri var ve buralarda tavuk besleniyor.
	 * 
	 * 1-10-> kümeslerde et tavukları bulunur.Bunlar yumurtlamaz.
	 * her kümeste 10 hayvan bulunur...
	 * 11-30-> yumurta tavukları var bunlar günde 1 yumurta verirler ve
	 * her kümeste 40 hayvan olur.
	 * 31-n->yumurta tavukları olur ve bunlar günde en az 2 yumurta verir
	 * Her kümeste 20 hayvan olur
	 * 
	 */
	private final static int kumesSayisi=43;
	
	public int getHayvansayisi(int kumesNumarasi) throws Exception {
		if(kumesNumarasi>kumesSayisi) {
			throw new ArithmeticException("Geçersiz Kümes Numarası");
		}
		if(kumesNumarasi>0 && kumesNumarasi<11) {
			return 40;
		}else if(kumesNumarasi>10 && kumesNumarasi<31) {
			return 40;
		}else {
			return 20;
		}
	}
	public int getYumurtaSayisi(int kumesNumarasi) {
		if(kumesNumarasi>0 && kumesNumarasi<11) {
			return 0;
		}else if(kumesNumarasi>10 && kumesNumarasi<31) {
			return 40;
		}else {
			return 60;
		}
		
	}
}
