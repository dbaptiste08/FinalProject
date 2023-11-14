
public class Participant {
	
	protected String name;
	protected int year;
	protected int payment;
	protected String city;
	protected String country;
	
	private static int participantCount = 0;
	
	//default constructor
	public Participant () {
		name = "TBD";
		year = 0;
		city = "TBD";
		country = "TBD";
	}
	
	//intialize constructor
	public Participant(String name, int y, String town, String ctry) {
		this.name = name;
		year = y;
		city = town;
		country = ctry;
	}
	
	//payment constructor
	public Participant(String name, int y, int pay, String town, String ctry) {
		this.name = name;
		year = y;
		payment = pay;
		city = town;
		country = ctry;
		participantCount++;	
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public static int getParticipantCount() {
		return participantCount;
	}

	public static void setParticipantCount(int participantCount) {
		Participant.participantCount = participantCount;
	}
	
	public void printInfo() {
		System.out.println("Thank you for your interest in study abroad!");
		System.out.println("Name: " + name);
		System.out.println("Year: " + year);
		System.out.println("City: " + city);
		System.out.println("Country: " + country);
<<<<<<< HEAD
=======
		System.out.println("Random");
>>>>>>> d3bf01c275784fa9308d1c2ea706cbb6308252b4
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
