import java.util.HashMap;
import java.util.ArrayList;

public class StudyAbroad {
	
private HashMap <String, Participant>participantList;
private HashMap <String, Confirmation> confirmationList;

public StudyAbroad() { //default constructor
	participantList = new HashMap<String, Participant>();
		
}

//returns participantList
public HashMap<String,Participant> participantList(){
	return participantList;
}

//add participants - participant list
public void addParticpant(String name, String ctry)
{	
	Participant newParticipant = new Participant(name, ctry);
	participantList.put(newParticipant.getName(), newParticipant);
}

//add confirmation - confirmation list
public void addConfirmation(String name, int pay) {
	Confirmation newConfirmation = new Confirmation(name, pay);
	confirmationList.put(newConfirmation.getName(), newConfirmation);
	
}

//add faculty lead

public void addFacultyLead(String name, String countryLocation) {
	FacultyLead facultylead = new FacultyLead();
	facultylead.setName(name);
	facultylead.setCountry(countryLocation);
	
	participantList.put(facultylead.getName(), facultylead);
}


public void printCountries() {
	ArrayList<String> countries = new ArrayList<String>();
	countries.add("France");
	countries.add("Italy");
	countries.add("Greece");
	countries.add("Germany");
	countries.add("Spain");
		
}

public void printLength() {
	String [] programLength = {"Maymester", "Fall", "Spring"};
	
	for (String semester: programLength) {
		System.out.println(semester);
	
	}
}



}
