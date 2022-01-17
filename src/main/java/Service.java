package main.java;

import java.security.SecureRandom;

public class Service extends CasePropriete {
	
    public Service(String nom, int cout, int prixMaison,Quartier q) {
		super(nom, cout, prixMaison,q);
		loyer = 15;
	}

	public int calculLoyer() {
		int mult = 4;
		if(quartier.possedeQuartier(j)) {
			mult = 10;
		}
		int r = lancerdeService();
		System.out.println("Le loyer de la compagnie est de 15 multiplié par " + mult + " le score des dé est : " + r );
		return loyer * mult * r; 
    }

    public int lancerdeService() {
    	SecureRandom random = new SecureRandom(); 
    	byte bytes[] = new byte[20];
    	random.nextBytes(bytes);
    	int i = bytes[0];
    	return i% 12;
    	
    }

}
