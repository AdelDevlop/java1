package projet;

public class Niveau extends Element {
	
	private Element [][] carte;
	private Personnage pj;
	private String titre;
	private String desc;
	
	public Niveau(String name, int vitalite, int vitaliteMax) {
		this.pj = new Personnage(name, vitalite, vitaliteMax);

		this.carte = new Element[10][10];
	}

	public Niveau(Personnage p) {
		this.pj = p;

		this.carte = new Element[10][10];
	}
	
	public  String getDescription() {
		return this.desc;
	}
	
	public void setDescription(String s) {
			this.desc = s;
	}
	
	public  String getType() {
		return "Niveau";
	}
	
	
	
	public void setElement(int i,int j,Element k) {
		this.carte[i][j]=k;
		
		
	}
	public Element getElement(int i,int j) {
		return this.carte[i][j];
		
	}
	
	public String decritCarte(int i, int j) {
		if (this.carte[i][j] != null)
			return this.carte[i][j].getDescription();
		
		return "Case vide";
	}
	
	public String decritCarte() {
		String result = "";
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				result += this.carte[i][j] != null ? this.carte[i][j].getDescription() : "Case vide";
				result += ", ";
			}
		}
		
		return result;
	}
	
	public Personnage getPersonnagePrincipal() {
		return this.pj;
	}
	
	public void setPersonnagePrincipal(Personnage p) {
		this.pj = p;
	}
	
	public String getTitre( ) {
		return this.titre;
	}
	
	public void setTitre(String t) {
		this.titre = t;
	}
	
}
