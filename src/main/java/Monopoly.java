package main.java;
import java.util.ArrayList;
import java.util.List;

public class Monopoly {
    public int tour;

    public Plateau p;

    public List<Joueur> l;
    
    public Monopoly() {
    	l =new ArrayList<Joueur> ();   	
    }

    public void enregistrerJoueur(String nom) {
    	l.add(new Joueur(nom));
    }

    public Joueur lancerPartie() {
    	
    	tour = 0;
    	
    	p = new Plateau();
    	p.creationCase();
    	for(int i = 0;i < l.size();i++) {
    		l.get(i).setCase(p.l.get(0));
    	}
		return l.get(tour);
    }

    public Joueur finisTour() {
    	System.out.println("Fin du tour");
    	tour++;
    	if(tour >= l.size()) {
    		tour = 0;
    	}
		return l.get(tour);
    }

    public Plateau getPlateau() {
    	return p;
    }

}
