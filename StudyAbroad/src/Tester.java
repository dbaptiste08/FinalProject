
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudyAbroad welcome = new StudyAbroad();
		welcome.printWelcomeStatement();
		welcome.printCountries();
		welcome.printLength();
		welcome.printPrompt();
		
		Participant prompt = new Participant();
		prompt.getUserInput();
		
		//First example - first scenario
		Participant Kelly = new Participant("Kelly", "France", 248, "Maymester");
		StudyAbroad KellyList = new StudyAbroad();
		KellyList.addParticpant("Kelly", "France", 248);
		Kelly.printInfo();
		
		//First example - second scenario
		Confirmation KellyPayment = new Confirmation("Kelly", 500, 248);
		KellyList.addConfirmation("Kelly", "France", 248);
		KellyPayment.printFinal();
		
		FacultyLead faculty1 = new FacultyLead();
		faculty1.Faculty("Claire Fraiser", "France", "History");
		faculty1.addToNameList("Kelly");
		faculty1.print();
		
		//second example - first scenario
		Participant prompt2 = new Participant();
		prompt2.getUserInput();
		Participant Sophia = new Participant("Sophia", "Italy", 799, "Spring");
		Sophia.printInfo();
		
		//second example - second scenario
		Confirmation SophiaPayment = new Confirmation("Sophia", 500, 799);
		KellyList.addConfirmation("Sophia", "Italy", 799);
		SophiaPayment.printFinal();
		
		FacultyLead faculty = new FacultyLead();
		faculty.Faculty("Karen Aguar", "Italy", "MIS");
		faculty.addToNameList("Sophia");
		faculty.print();
		
		//error example
		Participant prompt3 = new Participant();
		prompt3.getUserInput();
		Participant Danielle = new Participant("Danielle", "Italy", 345, "Spring");
	    StudyAbroad DanielleList = new StudyAbroad();
		DanielleList.addParticpant("Danielle", "Italy", 345);
		Danielle.printInfo();
		
	    
	    Confirmation DaniellePayment = new Confirmation("Danielle", 300, 345);
		DaniellePayment.printFinal();
		
		
	    				
		
		
		
		
		
		
		
		
		
	}

}
