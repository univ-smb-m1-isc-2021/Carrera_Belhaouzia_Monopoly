package main.java;

public class Quartier {
    public String couleur;
    public int taille;

    public Quartier(String couleur,int taille) {
    	this.couleur = couleur;
    	this.taille = taille;
    }
    
    public boolean possedeQuartier(Joueur p1) {
    	int nb = 0;
    	for(int i = 0 ; i < p1.getListeCase().size();i++) {
    		if(p1.getListeCase().get(i).getQuartier().equals(this)) {
    			nb++;
    		}
    	}
    	return nb == taille;
    }

    public void rendreQuartierConstructible(Joueur p1) {
    	System.out.println("Le quartier devient constructible");
    	for(int i = 0 ; i < p1.getListeCase().size();i++) {
    		if(p1.getListeCase().get(i).getQuartier().equals(this)) {
    			p1.getListeCase().get(i).setEtat(new Constructible(p1.getListeCase().get(i)));
    		}
    	}
    }

    public int nbGares(Joueur p1) {
    	int nbGare = 0;
    	for(int i = 0 ; i < p1.getListeCase().size();i++) {
    		if(p1.getListeCase().get(i) instanceof Gare) {
    			nbGare++;
    		}
    	}
    	return nbGare;
    }

}
