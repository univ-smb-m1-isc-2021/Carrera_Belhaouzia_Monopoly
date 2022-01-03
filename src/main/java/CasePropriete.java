package main.java;


public class CasePropriete extends Case {
    
 	public Etat etat;
    public int loyer;
    public Joueur j;
    public int prixMaison;
    public int nbMaison;
    public Quartier quartier;
    
    public CasePropriete(String nom, int cout,int prixMaison,Quartier q) {
 		super(nom, cout);
 		this.prixMaison = prixMaison;
 		nbMaison = 0;
 		quartier = q;
 		etat = new Libre(this);
 		loyer = 50;
 	}
    
    
    public void atterirJoueur(Joueur joueur) {
    	etat.atterirJoueur(joueur);
    }

    public boolean estPropietaite(Joueur joueur) {
		return false;
    }

  
    public int recupererPrixAchat() {
		return cout;
    }
  
    public boolean estConstructible(Joueur j) {
    	return etat.estConstructible() && j.equals(this.j);
    }


    public void augmenterLoyer(int loyer) {
    }


    public void changerEtatCases(Etat etat) {
    }


    public void acheterCase(Joueur joueur) {
    	etat.acheterCase(joueur);
    	
    }


    public boolean verifierQuartier(Joueur p1) {
    	etat.verifierQuartier(p1);
		return false;
    }

  
    public void construireMaison() {
    	etat.construireMaison();
    }
    public Joueur getProprietaire() {
    	return j;
    }


	public void setProprietaire(Joueur j2) {
		j = j2;
		
	}

	public int getCout() {
		return cout;
	}
	public int getPrixMaison() {
		return prixMaison;
	}
	public void setNbMaison(int i) {
		nbMaison += i;
		this.loyer *= (nbMaison + 1);
		System.out.println("Le nouveau loyer est de " + loyer);
	}
	public Quartier getQuartier() {
		return quartier;
	}

	public void setEtat(Etat e ) {
		this.etat = e;
	}
}
