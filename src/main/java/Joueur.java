package main.java;

import java.util.ArrayList;
import java.util.List;

public class Joueur {
	public int argent;

	public String nom;

	public List<CasePropriete> l;

	public Case current;

	public Joueur(String nom) {
		this.nom = nom;
		l = new ArrayList<CasePropriete>();
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
		CasePropriete c = (CasePropriete) current;
		c.acheterCase(this);
	}

	public void acheterMaison(String cmd) {
		int m = Integer.parseInt(cmd);
		List<CasePropriete> l1 = getListeCaseConst();
		if( m >= 0 && m < l1.size()) {
			CasePropriete c = (CasePropriete) current;
			if (c.estConstructible(this)) {
				l1.get(m).construireMaison();
			}
		}else {
			System.out.println("Le chiffre entré est incorrect");
		}
	}

	public void debiterJoueur(int prix) {
		argent -= prix;
	}

	public void crediterJoueur(int prix) {
		argent += prix;
	}

	public List<CasePropriete> getListeCaseConst() {

		List<CasePropriete> l1 = new ArrayList<CasePropriete>();
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).estConstructible(this)) {
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

	public void afficherConstructible() {
		List<CasePropriete> l1 = getListeCaseConst();
		System.out.println("Entrez le numéro de la case");
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(i + " - " + l1.get(i).nom);
		}
	}
}
