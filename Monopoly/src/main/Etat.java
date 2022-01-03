package main;

public class Etat{

	public CasePropriete c;

	public Etat( CasePropriete c) {
		this.c = c;
	}
	
    public boolean estConstructible() {
		return false;
    }

    public void atterirJoueur(Joueur joueur) {
    }

    public void acheterCase(Joueur joueur) {
    }

    public boolean verifierQuartier(Joueur p1) {
		return false;
    }

    public void changerEtat(Etat p1) {
    }

    public void calculLoyer(int p1) {
    }

    public void construireMaison() {
    }

}
