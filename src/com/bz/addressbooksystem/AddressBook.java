package com.bz.addressbooksystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {
	Scanner scan = new Scanner(System.in);
	ArrayList<Contacts> list = new ArrayList<>();

	public void operation() {
		boolean status = true;
		do {
			System.out.println("Enter the number according to to requirment");
			System.out.println("Enter 1 to Add");
			switch (scan.nextInt()) {
			case 1:
				add();
				break;
			}
		} while (status);
	}

	public void add() {
		Contacts contacts = new Contacts();
		System.out.println("Enter the First name:");
		String firstName = scan.next();
		contacts.setFirstName(firstName);

		System.out.println("Enter the Last name:");
		String lastName = scan.next();
		contacts.setFirstName(lastName);

		System.out.println("Enter the address:");
		String address = scan.next();
		contacts.setFirstName(address);

		System.out.println("Enter the City:");
		String city = scan.next();
		contacts.setCity(city);

		System.out.println("Enter the State:");
		String state = scan.next();
		contacts.setAddress(state);

		System.out.println("Enter the Pin Code:");
		int zip = (int) scan.nextLong();
		contacts.setZip(zip);

		System.out.println("Enter the Phone Number:");
		Long phoneNumber = scan.nextLong();
		contacts.setPhoneNumber(phoneNumber);

		System.out.println("Enter the Email");
		String email = scan.next();
		contacts.setEmail(email);
		list.add(contacts);
		print();

	}

	public void edit() {
		System.out.println("Enter your First name:");
		String firstName = scan.next();

		Iterator<Contacts> iterator = list.listIterator();

		while (iterator.hasNext()) {
			Contacts contacts = iterator.next();

			if (firstName.equals(contacts.getFirstName())) {
				System.out.println("Choose field you want to add:");
				System.out.println("1.Last Name\t2.Address\t3.City\t4.State\t5. Zip\t6.Phone Number\t7.Email");
				switch (scan.nextInt()) {
				case 1:
					System.out.println("Re-Correct your Last Name");
					contacts.setLastName(scan.next());
					break;
				case 2:
					System.out.println("Re-Correct your Address");
					contacts.setAddress(scan.next());
					break;
				case 3:
					System.out.println("Re-Correct your City");
					contacts.setCity(scan.next());
					break;
				case 4:
					System.out.println("Re-Correct your State");
					contacts.setState(scan.next());
					break;
				case 5:
					System.out.println("Re-Correct your Zip");
					contacts.setZip((int) scan.nextLong());
					break;
				case 6:
					System.out.println("Re-Correct your Phone Number");
					contacts.setPhoneNumber(scan.nextLong());
				case 7:
					System.out.println("Re-Correct your Email");
					contacts.setEmail(scan.next());
				}
			}
		}
	}

	public void delete() {
		System.out.println("Enter your First name:");
		String firstName = scan.next();

		Iterator<Contacts> iterator = list.listIterator();
		while (iterator.hasNext()) {
			Contacts contacts = iterator.next();

			if (firstName.equals(contacts.getFirstName())) {
				list.remove(contacts);
			}
		}
	}
	
	 public void sortCity() {
	        Collections.sort(list, Sort.compareCity);
	    }
	 
	    public void sortState() {
	        Collections.sort(list, Sort.compareState);
	    }
	    

	    public void countList() {
	        Long total = list.stream().count();
	        System.out.println(total);
	    }
	    
	    public void sortByFirstName() {
	        Collections.sort(list, Sort.compareFirstName);
	    }
	    
	    public void sortByZip() {
	        Collections.sort(list, Sort.compareZip);
	    }

	   @Override
	    public String toString() {
	        return "AddressBook{" +
	                "list=" + list +
	                '}';
	    }
	
	public void print() {
		Iterator<Contacts> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
