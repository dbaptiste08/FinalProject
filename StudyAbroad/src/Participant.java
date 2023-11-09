
public class Participant {
	
	protected String name;
	protected int year;
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
	public Participant(String name, int y) {
		this.name = name;
		year = y;
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
	
	
	
	
	
	
	
	
	
	
	
	

}
