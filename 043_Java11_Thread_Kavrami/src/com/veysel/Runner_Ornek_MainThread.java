package com.veysel;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Runner_Ornek_MainThread {
public static void main(String[] args) throws MalformedURLException, IOException {
	 System.out.println("************************************");
     System.out.println("************************************");
     System.out.println("************************************");
     System.out.println("************************************");
     System.out.println("******** Günlük Burç Yorumu ********");
     System.out.println("************************************");
     System.out.println("************************************");
     System.out.println("************************************");
     System.out.println("************************************");

     System.out.println();
     String ay = "Temmuz";
     Scanner scBurc = new Scanner(System.in);
     System.out.print("Lutfen Burcunuzu Giriniz: ");
     String burcAdi = scBurc.nextLine();
     Scanner scSite = new Scanner(new URL("https://www.elle.com.tr/astroloji/" + burcAdi).openStream(), "UTF-8");
     boolean flag = false;
     while (scSite.hasNext()) {
         String okunan_satır = scSite.nextLine();
         if (okunan_satır.toLowerCase().contains(ay.toLowerCase())) {
             flag = true;
         }
         if (okunan_satır.contains("<p>") && flag) {
             String burcYorumu = okunan_satır.replace("</p>", "").replace("<br>", "").replace("<p>", " ");
             System.out.println(burcYorumu);
              // Exit the loop after retrieving one line.
        break;
         }
     }
     System.out.println();
     scSite.close(); // Close the Scanner to release resources.
}
}
