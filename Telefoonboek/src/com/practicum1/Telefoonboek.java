package com.practicum1;

import java.util.ArrayList;
import java.util.Scanner;

public class Telefoonboek {
	static String answer = "ja";
	
	public Telefoonboek() {		
	}
	
	public void vulTelefoonBoek() {
		Persoon psn = new Persoon();
		Scanner scn =  new Scanner(System.in);
		ArrayList<String> Telefoonboek = new ArrayList<String>();
		Telefoonboek.add(Persoon.telefoonboekregel);
		System.out.println("tik nee om te stoppen");
		String xy = scn.nextLine();
		String yx = "nee";
		boolean x = true;
		boolean input = scn.equals(x);
		if(xy.equals(yx)) {
			System.out.println("u heeft nee getikt het programma wordt nu beeindigd");
			x = false;
			System.out.println(Telefoonboek);
		}
		while(x == input);
		psn.addPersoon();
		vulTelefoonBoek();
		System.out.println(Telefoonboek);
	}	
}
