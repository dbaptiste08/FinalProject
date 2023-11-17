import java.util.HashMap;
import java.util.ArrayList;

public class StudyAbroad {
	
private HashMap <String, Participant>participantList;
private HashMap <String, Confirmation> confirmationList;
String [] programLength = {"Maymester", "Fall", "Spring"};
ArrayList<String> countries = new ArrayList<String>();

public StudyAbroad() { 
	participantList = new HashMap<String, Participant>();
	confirmationList = new HashMap<String, Confirmation>();
		
}

//returns participantList
public HashMap<String,Participant> participantList(){
	return participantList;
}

//add participants - participant list
public void addParticipant()
{
	Participant newParticipant = new Participant();
	participantList.put(newParticipant.getName(), newParticipant);
}




public void addParticpant(String name, String countryLocation, int id)
{	
	Participant newParticipant = new Participant(name, countryLocation);
	participantList.put(newParticipant.getName(), newParticipant);
}

//default
public void addConfirmation() {
	Confirmation newConfirmation = new Confirmation();
	confirmationList.put(newConfirmation.getName(), newConfirmation);	
}


//add confirmation - confirmation list
public void addConfirmation(String name, String countryLocation, int id) {
	Confirmation newConfirmation = new Confirmation(name, id);
	confirmationList.put(newConfirmation.getName(), newConfirmation);
	
}

//add faculty lead

public void addFacultyLead(String name, String countryLocation) {
	FacultyLead facultylead = new FacultyLead();
	facultylead.setName(name);
	facultylead.setCountry(countryLocation);
	
	participantList.put(facultylead.getName(), facultylead);
}


public void printLength() {
	System.out.println("Here are the terms you can sign up for!");
	for (String semester: programLength) {
		System.out.println(semester);	
	}
	System.out.println("***********************************************");
}

public void printCountries() {
	System.out.println("Here are the countries you can study at!");
	countries.add("France");
	countries.add("Italy");
	countries.add("Greece");
	countries.add("Germany");
	countries.add("Spain");
	System.out.println(countries);
		
}

  
public void printWelcomeStatement() {
	System.out.println("Welcome to Study Abroad!");	
}

public void printPrompt() {
	System.out.println("Please write your name, country, year, identification number, and semester");
}







}
