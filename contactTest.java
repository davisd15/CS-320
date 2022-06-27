package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import contact.Contact;

class contactTest {

	@Test
	void testContactClass() {
		Contact contact = new Contact("12368", "John", "Doe", "2033339850", "125 John Doe St");
		assertTrue(contact.getID().equals("12368"));
		assertTrue(contact.getFirstName().equals("John"));
		assertTrue(contact.getLastName().equals("Doe"));
		assertTrue(contact.getPhoneNum().equals("2033339850"));
		assertTrue(contact.getAddress().equals("125 John Doe St"));
	}
	@Test
	void testIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("12345678910", "John", "Doe", "2033339850", "125 John Doe St");
		});
	}
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("12368", "llllllllllllllll", "Doe", "2033339850", "125 John Doe St");
		});
	}
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("12368", "John", "1111111111111", "2033339850", "125 John Doe St");
		});
	}
	@Test
	void testPhoneNumNot10Digits() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("12368", "John", "Doe", "12033339850", "125 John Doe St");
		});
	}
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("12368", "John", "Doe", "2033339850", "this should be more than enough characters to ensure the address is too long");
		});
	}

}
