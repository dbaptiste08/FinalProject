
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudyAbroad welcome = new StudyAbroad();
		welcome.printWelcomeStatement();
		
		StudyAbroad info = new StudyAbroad();
		info.printCountries();
		info.printLength();
		
		
		StudyAbroad prompt = new StudyAbroad();
		prompt.printPrompt();
		
		//First example - first scenario
		Participant Kelly = new Participant("Kelly", "France", 248, "Maymester");
		StudyAbroad KellyList = new StudyAbroad();
		KellyList.addParticipant("Kelly", "France", 248);
		Kelly.printInfo();
		
		//First example - second scenario
		Confirmation KellyPayment = new Confirmation("Kelly", 500, 248);
		KellyPayment.printFinal();
		
		//second example - first scenario
		Participant Sophia = new Participant("Sophia", "Italy", 799, "Spring");
		Sophia.printInfo();
		
		//second example - second scenario
		Confirmation SophiaPayment = new Confirmation("Sophia", 500, 799);
		SophiaPayment.printFinal();
		
		//error example
		Participant Danielle = new Participant("Danielle", "Italy", 345, "Spring");
	    StudyAbroad DanielleList = new StudyAbroad();
		DanielleList.addParticipant("Danielle", "Italy", 345);
		 Danielle.printInfo();
		
		Participant Dani = new Participant("Danielle", "Italy", 345, "Spring");
	    StudyAbroad DaniList = new StudyAbroad();
	    DaniList.addParticipant("Danielle", "Italy", 345);
	    Dani.printInfo();
	    
	    Confirmation DaniellePayment = new Confirmation("Danielle", 300, 345);
		DaniellePayment.printFinal();
	    				
		
		
		FacultyLead faculty1 = new FacultyLead();
		faculty1.Faculty("Claire Fraiser", "France", "History");
		faculty1.addToNameList("Kelly");
		faculty1.print();
		
		FacultyLead faculty = new FacultyLead();
		faculty.Faculty("Karen Aguar", "Italy", "MIS");
		faculty.addToNameList("Sophia");
		faculty.print();
		
		
		//participantlist
		/*StudyAbroad checkPlist = new StudyAbroad();
		checkPlist.printParticipantList();
		
		
		//confirmationlist
		StudyAbroad checkClist = new StudyAbroad();
		checkClist.printConfirmationList();
		*/
	}

}
