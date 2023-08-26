package com.veysel.exception;

public class PersonelException extends RuntimeException{
/*
 * Hangi yazdığımız uygulamalarda exception sınıfımız olmalıdır...
 * Uygulama içinde herhangi bir yerde hata fırlatmak istiyorsak olmalıdır. 
 * 
 */
	public PersonelException(String message) {
		super(message);
	}
}
