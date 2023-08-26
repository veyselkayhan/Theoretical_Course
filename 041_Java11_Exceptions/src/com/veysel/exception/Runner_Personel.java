package com.veysel.exception;

import java.util.List;

public class Runner_Personel {
public static void main(String[] args) {
	PersonelRepository repo = new PersonelRepository();
	List<String> arananPersonel = repo.findById(-2L);
	arananPersonel.forEach(System.out::println);
}
}
