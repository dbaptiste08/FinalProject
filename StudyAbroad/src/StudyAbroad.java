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
public void addParticipant(String name, String countryLocation, int id) {
    for (Participant participant : participantList.values()) {
        if (participant.getName().equals(name) && participant.getCountry().equals(countryLocation)
                && participant.getId() == id) {
            System.out.println("Error: You have already signed up for this program.");
            
        } else {
        	 Participant newParticipant = new Participant(name, countryLocation);
        	    participantList.put(newParticipant.getName(), newParticipant);
        }
    }   
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
	System.out.println("Here are the countries you can study at!");
	ArrayList<String> countries = new ArrayList<String>();
	countries.add("France");
	countries.add("Italy");
	countries.add("Greece");
	countries.add("Germany");
	countries.add("Spain");
	System.out.println(countries);
		
}

public void printLength() {
	System.out.println("Here are the terms you can sign up for!");
	String [] programLength = {"Maymester", "Fall", "Spring"};
	for (String semester: programLength) {
		System.out.println(semester);	
	}
	System.out.println("***********************************************");
}

  
public void printWelcomeStatement() {
	System.out.println("Welcome to Study Abroad!");	
}

public void printPrompt() {
	System.out.println("Please write your name, country, year, identification number, and semester");
}

public void printParticipantList() {
    System.out.println("Participants:");
    for (HashMap.Entry<String, Participant> entry : participantList.entrySet()) {
        String name = entry.getKey();
        Participant participant = entry.getValue();
        System.out.println("Name: " + name + ", Country: " + participant.getCountry());
        // You can add more details based on your Participant class structure
    }
}

public void printConfirmationList() {
    System.out.println("Confirmations:");
    for (HashMap.Entry<String, Confirmation> entry : confirmationList.entrySet()) {
        String name = entry.getKey();
        Confirmation confirmation = entry.getValue();
        System.out.println("Name: " + name + ", Payment: " + confirmation.getPayment());

    }
}





}
