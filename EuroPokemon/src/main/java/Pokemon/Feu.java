package Pokemon;

public class Feu extends Pokemon {
	
	public Feu(int id, String nom, String type, String image) {
		super(id, nom, type, image); 
	}
	@Override
	public void effet() {
		setAttaque(getAttaque()+getEffet());
	}

}
