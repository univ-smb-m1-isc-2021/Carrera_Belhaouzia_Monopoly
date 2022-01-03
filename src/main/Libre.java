package main;

public class Libre extends Etat {
    public Libre(CasePropriete c) {
		super(c);
	}

	public boolean estConstructible() {
		return false;
    }

    public void atterirJoueur(Joueur joueur) {
    }

    public void acheterCase(Joueur j) {
    	c.setProprietaire(j);
    	j.ajouterCase(c);
    	j.debiterJoueur(c.getCout());
    	Etat e = new NonConstructible(c);
    	c.setEtat(e);
    	c.verifierQuartier(j);
    	System.out.println("Le joueur "+ j.nom + " a acheté la case "+ c.nom + " nouveaux solde : " + j.argent);
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
