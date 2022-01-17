package main.java;
import java.util.ArrayList;
import java.util.List;

public class Plateau {
    public List<Case> l;
    public int de_pipe[];
    public int current_de;
    
    public Plateau() {
    	l = new ArrayList<Case>();
    	current_de = 0;
    	de_pipe = new int[]{2,4,4,10,8,9,9,3,7,0};
    }

    public void creationCase() {
    	Quartier q1 = new Quartier("Marron",2);
    	Quartier q2 = new Quartier("Cyan",3);
    	Quartier q3 = new Quartier("Rose",3);
    	Quartier q4 = new Quartier("Orange",3);
    	Quartier q5 = new Quartier("Rouge",3);
    	Quartier q6 = new Quartier("Jaune",3);
    	Quartier q7 = new Quartier("Vert",3);
    	Quartier q8 = new Quartier("Bleu",2);
    	Quartier service = new Quartier("Service",2);
    	Quartier gare = new Quartier("gare",4);
    	l.add(new Case("Départ",0));
    	l.add(new CasePropriete("Boulevard de belleville",60, 100,q1));
    	l.add(new CasePropriete("Rue Lecourbe",60, 100,q1));
    	l.add(new Case("Impôts",0));
    	l.add(new Gare("Gare Montparnasse",200,0,gare));
    	l.add(new CasePropriete("Rue Vaugirard",100, 150,q2));
    	l.add(new CasePropriete("Rue de Courcelles",100, 150,q2));
    	l.add(new CasePropriete("Avenue de la République",120, 150,q2));
    	l.add(new Case("Prison",0));
    	l.add(new CasePropriete("Boulevard de la Villette",140, 200,q3));
    	l.add(new Service("Compagnie électrique",150, 0,service));
    	l.add(new CasePropriete("Avenue de Neuilly",140, 200,q3));
    	l.add(new CasePropriete("Rue du paradis",160, 200,q3));
    	l.add(new Gare("Gare Lyon",200,0,gare));
    	l.add(new CasePropriete("Avenue de Mozart",180, 250,q4));
    	l.add(new CasePropriete("Rue de Courcelles",180, 250,q4));
    	l.add(new CasePropriete("Avenue de la République",200, 250,q4));
    	l.add(new Case("Parc Gratuit",0));
    	l.add(new CasePropriete("Avenue de Matignon",220, 300,q5));
    	l.add(new CasePropriete("Rue de Courcelles",220, 300,q5));
    	l.add(new CasePropriete("Avenue de la République",240, 300,q5));
    	l.add(new Gare("Gare Nord",200,0,gare));
    	l.add(new CasePropriete("Faubourd Saint-Honoré",260, 350,q6));
    	l.add(new CasePropriete("Place de la bourse",260, 350,q6));
    	l.add(new Service("Compagnie de l'eau",150, 0,service));
    	l.add(new CasePropriete("Rue la fayette",280, 350,q6));
    	l.add(new Case("Allez en Prison",0));
    	l.add(new CasePropriete("Avenue de breteuil",300, 400,q7));
    	l.add(new CasePropriete("Avenue Fosch",300, 400,q7));
    	l.add(new CasePropriete("Boulevard des capucines",320, 400,q7));
    	l.add(new Gare("Gare Saint-Lazare",200,0,gare));
    	l.add(new CasePropriete("Avenue des champs-élysée",300, 400,q8));
    	l.add(new Case("Taxe de luxe",100));
    	l.add(new CasePropriete("Rue de la paix",320, 400,q8));
    }

    public String lancerDe(Joueur courant) {
    	Case c = courant.recupererCase();
    	int positionCase = l.indexOf(c);
    	int random = de_pipe[current_de];
    	current_de++;
    	int nouvellePosition = (positionCase + random) % l.size();
    	if(passerdepart(positionCase,nouvellePosition)) {
    		courant.crediterJoueur(200);
    		System.out.println("Le joueur " + courant.nom + " est passer par la case départ : " + courant.argent);
    	}
    	System.out.println("c'est le tour de " + courant.nom + " , il/elle a fait un " + random + " il/elle tombe sur la case " + l.get(nouvellePosition).nom);
    	courant.avancer(l.get(nouvellePosition));
    	
    	String res = "";
    	if(courant.current instanceof CasePropriete && ((CasePropriete)courant.current).etat instanceof Libre ) {
    		res += "acheter case-";
    	}
    	if(courant.getListeCaseConst().size() > 0) {
    		res += "acheter maison-";
    	}
    	if(res .equals("")) {
    		res = "Rien à faire";
    	}
		return res;
    }

    public boolean passerdepart(int positionCase, int nouvellePosition) {
		return nouvellePosition < positionCase;
    }
}
