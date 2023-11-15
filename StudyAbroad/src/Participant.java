
public class Participant {
	
	protected String name;
	protected int year;
	protected String country;
	protected String semester;
	
	
	
	//default constructor
	public Participant () {
		name = "TBD";
		year = 0;
		country = "TBD";
	}
	
	//intialize constructor
	public Participant(String name, String ctry) {
		this.name = name;
		country = ctry;
	}
	
	public Participant (String name, String ctry, int y, String sem) {
		this.name=name;
		country = ctry;
		year = y;
		semester = sem;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	
	public void printInfo() {
		System.out.println("Thank you for your interest in study abroad!");
		System.out.println("Name: " + name);
		System.out.println("Year: " + year);
		System.out.println("Country: " + country);
		System.out.println("Semester: " + semester);

	}
	
	
	
	
	
	
	
	
	
	
	
	

}
