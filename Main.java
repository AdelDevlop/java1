package projet;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * Testing Personnage class
		 */
		Personnage p1 = new Personnage("Aymane", 15, 100);
		
		p1.ajouteObjet(new Objet());
		p1.ajouteObjet(new Objet());
		p1.ajouteObjet(new Objet());
		p1.ajouteObjet(new Objet());
		
		p1.ajouteObjet(new Objet());
		
		//System.out.println(p1.getDescription());
		
		/**
		 * Testing Niveau class
		 * with the second constructor
		 */
		Niveau niveau = new Niveau(p1);
		//System.out.println( niveau.decritCarte() );
		
		/**
		 * tests tarritaire 
		 */
		
		int a = 3;
		String aEstSuperieur = a == 5 ? "Egale" : ( a > 5 ? "Superieur" : ( a < 4 ? "Beaucoup inférieure" : "inférieure" ) );
		
		System.out.println( aEstSuperieur );
		
	}

}
