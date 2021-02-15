package projet;

public class Personnage extends Element {
	private String name;
	private int vitalite;
	private int vitaliteMax;
	private Objet[] objets;
	private int cursor_obj = 0;
	private String desc = null;
		
	
	public Personnage(String name, int vitalite, int vitaliteMax) {
		this.name = name;
		this.vitalite = vitalite;
		this.vitaliteMax = vitaliteMax;
		
		this.objets = new Objet[3];
	}
	
	public  String getDescription(){
		return this.desc == null ?  this.name + " " + this.vitalite + " " + this.vitaliteMax : this.desc;
	}
	
	public void setDescription(String s){
		this.desc = s;
	}
	public  String getType(){
		return "Personnage";
	} 
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public  int getVitalite() {
		return this.vitalite;
	}
	
	public void setVitalite(int vitalite) {
		if (vitalite<this.vitaliteMax)
			this.vitalite = vitalite;
	}
	
	public  int getVitaliteMax() {
		return this.vitaliteMax;
	}
	public void  setVitaliteMax(int vitaliteMax) {
		this.vitaliteMax = vitaliteMax;
	}
	
	public  String afficheInventaire() {
		String s = "";
		for ( int i = 0; i < this.objets.length; i++ ) {
			if ( this.objets[i] != null )
				s += this.objets[i].getDescription();
			s += " ";
		}
		return s;
	}
	
	public void  ajouteObjet(Objet objet) {
		try {
			this.objets[this.cursor_obj++] = objet;
		}
		catch ( java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("Impossible d'ajouter un 4 eme objet");
		}
	}
	
	public Objet  poseObjet(int numero) {
		
		Objet []objs = new Objet[this.objets.length - 1];
		
		Objet foundObj = this.objets[numero];
		
		
		int k = 0;
		
		for (int i = 0; i < this.objets.length; i++) {
			if ( i == numero ) continue;
			
			objs[k++] = this.objets[i];			
		}
		
		this.objets = objs;
		
		this.cursor_obj--;
		
		return foundObj;
	}
	
}