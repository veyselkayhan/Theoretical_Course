package com.veysel;

import java.util.Date;

import com.veysel.entity.BankaHesap;
import com.veysel.entity.Musteri;
import com.veysel.entity.Transfer;

public class RunnerBanka {

	public static void main(String[] args) {
		Musteri musteriMuhammet=new Musteri();
		musteriMuhammet.id=1;
		musteriMuhammet.ad="Muhammet";
		Musteri musteriBahar=new Musteri();
		musteriBahar.id=2;
		musteriBahar.ad="Bahar";
		
		BankaHesap bkh1=new BankaHesap();
		bkh1.id=1;
		bkh1.iban="TR00 0000 0000 0000 0000 0000 00";
		bkh1.tlBakiye=1_000_000d;
		bkh1.musteriId=1;
		BankaHesap bkh2=new BankaHesap();
		bkh2.id=2;
		bkh2.iban="TR00 0000 0000 0000 0000 0000 11";
		bkh2.tlBakiye=1_000_000d;
		bkh2.musteriId=2;
		BankaHesap bkh3=new BankaHesap();
		bkh3.id=3;
		bkh3.iban="TR54 0000 0000 0000 0000 0000 00";
		bkh3.usdBakiye=1_000_000_000d;
		bkh3.musteriId=2;
		
		Transfer transfer=new Transfer();
		transfer.aciklama="Kira Ödemesi";
		transfer.aliciId=musteriBahar.id;
		transfer.aliciIban=bkh2.iban;
		transfer.gonderenId=musteriMuhammet.id;
		transfer.gondericiIban=bkh1.iban;
		transfer.gonderimZamani=new Date().toLocaleString();
		transfer.kur="TRY";
		transfer.transferTuru="Fast";
		transfer.miktar=50_000;
		
		
		bkh1.tlBakiye -= transfer.miktar;
		bkh2.tlBakiye += transfer.miktar;
		
		System.out.println("Muhammet Bakiye..."+bkh1.tlBakiye);
		System.out.println("Bahar Bakiye..."+bkh2.tlBakiye);
		
		

	}

}
