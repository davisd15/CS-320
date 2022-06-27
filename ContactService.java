package contact;

import java.util.ArrayList;

import contact.Contact;

public class ContactService {
	public static ArrayList<Contact> contacts;
	
	public static boolean addContact(Contact contact) {
		boolean alreadyContact = false;
		
		for (Contact contactList : contacts) {
			if (contactList.getID().equals(contact.getID())) {
				alreadyContact = true;
			}
		}
		if (!alreadyContact) {
			contacts.add(contact);
		}
		return alreadyContact;
	}
	public static boolean deleteContact(Contact contact) {
		for (Contact contactList : contacts) {
		if (contactList.getID().equals(contact.getID())) {
		contacts.remove(contact);
		return true;
		}
		}
		return false;
		}
	public static boolean updateFirstName(Contact contact) {
		for (Contact contactList : contacts) {
		if (contactList.getID().equals(contact.getID())) {
		contactList.updateFirstName(contact.getFirstName());
		return true;
		}
		}
		return false;
		}
	public static boolean updateLastName(Contact contact) {
		for (Contact contactList : contacts) {
		if (contactList.getID().equals(contact.getID())) {
		contactList.updateLastName(contact.getLastName());
		return true;
		}
		}
		return false;
		}
	public static boolean updatePhoneNum(Contact contact) {
		for (Contact contactList : contacts) {
		if (contactList.getID().equals(contact.getID())) {
		contactList.updatePhoneNum(contact.getPhoneNum());
		return true;
		}
		}
		return false;
		}
	public static boolean updateAddress(Contact contact) {
		for (Contact contactList : contacts) {
		if (contactList.getID().equals(contact.getID())) {
		contactList.updateAddress(contact.getAddress());
		return true;
		}
		}
		return false;
		}

}
