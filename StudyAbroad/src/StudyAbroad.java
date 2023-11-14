import java.util.HashMap;

public class StudyAbroad {
	
private HashMap <String, Participant>participantList;

public StudyAbroad() { //default constructor
	participantList = new HashMap<String, Participant>();
		
}

//returns participantList
public HashMap<String,Participant> participantList(){
	return participantList;
}

//add participants
public void addParticpant(String name, String ctry)
{	
	Participant newParticipant = new Participant(name, ctry);
	participantList.put(newParticipant.getName(), newParticipant);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
