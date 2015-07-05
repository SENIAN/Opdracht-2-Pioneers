package com.practicum1;

import java.util.Scanner;

public class Persoon {

	public static String telefoonboekregel = null;
	static String naam;
	static String achternaam;
	static String telefoonnummer;

	public Persoon() {			
	}
	
	public String getArray() {
		return telefoonboekregel;
	}

	public String setArray() {
		return this.telefoonboekregel;
	}

	public String getNaam() {
		return naam;
	}
		
	public String setNaam() {
		return this.naam;
	}
		
    public String getAchternaam() {
		return naam;
	}
    
	public String setAchternaam() {
		return this.achternaam;
	}
	public String getTelefoonnummer() {
		return telefoonnummer;
	}
	public String setTelefoonnummer() {
		return this.telefoonnummer;
	}
	
	public void addPersoon() {
		Scanner comm = new Scanner(System.in);
		System.out.print("Toets je naam in");
		Persoon.naam = comm.next();
		
		System.out.print("Toets je achternaam in");
		Persoon.achternaam = comm.next();
		
		System.out.print("Toets je telefoonnummer in");
		Persoon.telefoonnummer = comm.next();   			
		telefoonboekregel = Persoon.naam + "," + Persoon.achternaam + "," + Persoon.telefoonnummer;
	}
}




