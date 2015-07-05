package com.practicum3;


import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class Kleurtest {

	public Kleurtest() {
	}
	
	public void Kleurentest() {

		UIManager.put("JOptionPane.background", new ColorUIResource(Color.red));
		UIManager.put("Panel.background", Color.red);
		String inputUser;
		inputUser = JOptionPane.showInputDialog(null,"Welke kleur heeft de achtergrond van dit venster","Kleurenblindtest 2015",
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, inputUser);
	}

}
