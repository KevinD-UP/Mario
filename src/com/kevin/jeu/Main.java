package com.kevin.jeu;

import javax.swing.JFrame;

public class Main {
	//**** VARIABLES ****//
	public static Scene scene; // Toutes les classes ont accès � l'objet scene (static)
	
	public static void main(String[] args) {		
		// Cr�ation de la fenetre de l'application
		JFrame fenetre = new JFrame("Jeu style Mario");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(700, 360);
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setAlwaysOnTop(true);
		// Instanciation de l'objet scene
		scene = new Scene();		
		fenetre.setContentPane(scene); // On associe la scene � la fen�tre de l'application
		fenetre.setVisible(true);
	}	
} 