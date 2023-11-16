
public class Participant {
	
	protected String name;
	protected int id;
	protected String country;
	protected String semester;
	
	
	
	//default constructor
	public Participant () {
		name = "TBD";
		id = 0;
		country = "TBD";
	}
	
	//intialize constructor
	public Participant(String name, String countryLocation) {
		this.name = name;
		country = countryLocation;
	}
	
	public Participant (String name, String countryLocation, int dent, String sem) {
		this.name=name;
		country = countryLocation;
		id = dent;
		semester = sem;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int dent) {
		this.id = dent;
	}


	public String getCountry() {
		return country;
	}

	public void setCountry(String countryLocation) {
		this.country = countryLocation;
	}

	
	
	public void printInfo() {
		//System.out.println("********************************************************");
		System.out.println("Thank you for your interest in study abroad!");
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
		System.out.println("Country: " + country);
		System.out.println("Semester: " + semester);
		System.out.println("***************************************************************************************************************");

	}
	
	
	
	
	
	
	
	
	
	
	
	

}
