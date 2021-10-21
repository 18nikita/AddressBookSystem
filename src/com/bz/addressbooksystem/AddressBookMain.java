package com.bz.addressbooksystem;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("....WELCOME TO ADDRESS BOOK....");
		Contacts newContact = new Contacts();
		newContact.setFirstName("Nikita \n");
		newContact.setLastName("Rajput \n");
		newContact.setAddress("Tal-Shirol, Dist-Kolhapur, State-Maharastra \n");
		newContact.setCity("Kolhapur \n");
		newContact.setState("Maharashtra \n");
		newContact.setZip(416106);
		newContact.setEmail("rajputnikita5666@gmail.com \n");
		newContact.setPhoneNumber(1234567890);
		System.out.println("The Contact is : " + newContact);

	}
}