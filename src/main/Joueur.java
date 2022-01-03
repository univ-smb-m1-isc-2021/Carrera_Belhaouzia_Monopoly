package main;
import java.util.ArrayList;
import java.util.List;


public class Joueur {
    public int argent;

    public String nom;

    public List<CasePropriete> l;

    public Case current;
    
    public Joueur(String nom) {
    	this.nom = nom;
    	l   = new ArrayList<CasePropriete> ();
    	argent = 1500;
    	
    }

    public Case recupererCase() {
		return current;
    }

    public void avancer(Case caseDep) {
    	current = caseDep;
    	caseDep.atterirJoueur(this);
    }
	public void setCase(Case d) {
		current = d;
	}
    public void acheterCase() {
    	CasePropriete c = (CasePropriete)current;
    	c.acheterCase(this);
    }

    public void acheterMaison() {
    	CasePropriete c = (CasePropriete)current;
    	if(c.estConstructible(this)) {
    		l.get(0).construireMaison();
    	}
    }

    public void debiterJoueur(int prix) {
    	argent -= prix;
    }

    public void crediterJoueur(int prix) {
    	argent += prix;
    }

    public void construireMaison() {
    	List<CasePropriete> l1   = getListeCaseConst();
    	CasePropriete c = l.get(0);
    	c.construireMaison();
    }

    public List<CasePropriete> getListeCaseConst() {

    	List<CasePropriete> l1   = new ArrayList<CasePropriete> ();
    	for(int i =0 ; i < l.size();i++) {
    		if(l.get(i).estConstructible(this)) {
    			l1.add(l.get(i));
    		}
    	}
		return l1;
    }
    public void ajouterCase(CasePropriete c) {
    	l.add(c);
    }
    public List<CasePropriete> getListeCase() {
		return l;
    }
}
