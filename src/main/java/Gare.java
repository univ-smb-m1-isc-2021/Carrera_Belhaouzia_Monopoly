package main.java;

public class Gare extends CasePropriete {
	int loyer;
    public Gare(String nom, int cout, int prixMaison,Quartier q) {
		super(nom, cout, prixMaison,q);
		loyer = 50;
	}

	public int calculLoyerGare() {
		return quartier.nbGares(j) * loyer;
    }

}
