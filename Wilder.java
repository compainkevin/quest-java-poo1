
public class Wilder {

	// attributs
	
	private String firstname;
	private boolean aware;
	
	// constructeurs
	
	
	public Wilder (String firstname, boolean aware) {
		this.firstname = firstname;
		this.aware = aware;
	}
	
	
	// getters
	
	public String getFirstname() {
		return this.firstname;
	}
	
	public boolean isAware() {
		return this.aware;
	}
	
	//setters
	
	
	public boolean setAware() {
		return this.aware;
	}
	
	public String whoAmI() {
		if (this.aware) {
			return " Je m'appelle " + this.getFirstname() + " et je suis aware";
		}
		
		else{
			return " Je m'appelle " + this.getFirstname() + " et je suis pas aware";
			
		}
	}
	
	

}
