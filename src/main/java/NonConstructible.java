package main.java;
public class NonConstructible extends Etat {
    public NonConstructible(CasePropriete c) {
		super(c);
	}

	public boolean estConstructible() {
		return false;
    }

    public void atterirJoueur(Joueur joueur) {
    	int loyer = c.loyer;
    	if(c instanceof Service) {
    		loyer = ((Service)c).calculLoyer(); 
    	}else if(c instanceof Gare) {
    		loyer = ((Gare)c).calculLoyerGare(); 
    	}
		joueur.debiterJoueur(loyer);
		c.getProprietaire().crediterJoueur(loyer);
		System.out.println("Le joueur " + joueur.nom +  " ("+ joueur.argent+") paye " + loyer + " a " + c.j.nom + " ("+ c.j.argent+")");
    }

    public void acheterCase() {
    }

    public boolean verifierQuartier(Joueur p1) {
    	boolean verif = c.getQuartier().possedeQuartier(p1);
    	if(verif) {
    		c.getQuartier().rendreQuartierConstructible(p1);
    	}
		return verif;
    }

    public void changerEtat(Etat p1) {
    }

    public void calculLoyer(int p1) {
    }

    public void construireMaison() {
    }
}
