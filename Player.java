package Week05TeamMenuApp;

public class Player {
	
	private String name;
	private String position;
	private String specialty;
	
	
	public Player(String name, String position, String specialty) {
		this.name = name;
		this.position = position;
		this.specialty = specialty;	
	}
	
	//public method(s)
	
	public void describe() {
		System.out.println("\nPlayer: " + name + "\nPosition: " + position + "\nSpecialty: " + specialty);
	}
	
	
	
	//getters and setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
	
	

} //end of class
