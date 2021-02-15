package projet;

public class Objet extends Element {
	private String desc = null;
	
	public  String getDescription() {
		return this.desc == null ? "c'est un objet" : this.desc;
	}
	
	public  void setDescription(String s){
			this.desc = s;
	}

	public  String getType() {
		
		return "OBJET";
		
	}

}
