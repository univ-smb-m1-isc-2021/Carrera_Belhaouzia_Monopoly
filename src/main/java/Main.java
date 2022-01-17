package main.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Monopoly m = new Monopoly();
		m.enregistrerJoueur("Luc");
		m.enregistrerJoueur("Christine");
		m.enregistrerJoueur("Zoz");
		m.enregistrerJoueur("Thomas");
		
		System.out.println("La partie commence voici l'ordre de jeu : ");
		for(int i = 0;i < m.l.size();i++) {
			System.out.print( m.l.get(i).nom + " ");
		}
		System.out.println("");
		
		Joueur courant = m.lancerPartie();
		Plateau p = m.getPlateau();
		
		 
		Scanner scanner = new Scanner(System.in);
		String cmd ="";
		String [] words;
		
		while(!cmd.equals("quit")) {
			String option = p.lancerDe(courant);
			System.out.println(option);
	 		words = option.split("-", 3);
	 		cmd = scanner.nextLine();
			while(!cmd.equals("fin")) {
		 		if(contains("acheter case",words) && cmd.equals("acheter case")) {
					courant.acheterCase();
		 		}else if(courant.l.size() > 0  && cmd.equals("acheter maison")) {
		 			courant.afficherConstructible();
			 		cmd = scanner.nextLine();
		 			courant.acheterMaison(cmd);
		 		}else if(cmd.equals("ts")){
		 			m.tour = 4;
		 			m.l.get(0).current = m.p.l.get(32);
		 			m.l.get(1).current = m.p.l.get(29);
		 		}else {
		 			System.out.println("Commande incorrect");
		 		}
		 		cmd = scanner.nextLine();
			}
			courant = m.finisTour();
		}
		
	}

	private static boolean contains(String string,String [] w) {
		for(int i = 0 ; i < w.length ; i++ ) {
			if(w[i].equals(string)) {
				return true;
			}
		}
		return false;
	}

}
