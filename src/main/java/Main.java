package main.java;

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
		p.lancerDe(courant);
		courant.acheterCase();
		courant = m.finisTour();
		
		p.lancerDe(courant);
		courant.acheterCase();
		courant = m.finisTour();
		
		p.lancerDe(courant);
		courant = m.finisTour();
		
		p.lancerDe(courant);
		courant.acheterCase();
		courant = m.finisTour();
		
		p.lancerDe(courant);
		courant = m.finisTour();
		
		p.lancerDe(courant);
		courant.acheterCase();
		courant = m.finisTour();
		
		p.lancerDe(courant);
		m.tour = 4;
		courant = m.finisTour();
		
		System.out.println("Le jeu avance un peu c'est au tour de luc et il est sur la case Avenue des champs-élysée et chrisitine etait sur la case Avenue Fosch");
		m.l.get(0).current = m.p.l.get(32);
		m.l.get(1).current = m.p.l.get(29);
		
		p.lancerDe(courant);
		courant.acheterCase();
		courant.acheterMaison();
		courant = m.finisTour();
		
		p.lancerDe(courant);
	}

}
