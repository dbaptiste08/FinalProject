
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
		
		//First example
		Participant Kelly = new Participant("Kelly", "France", 248, "Maymester");
		Kelly.printInfo();
		
		Confirmation KellyPayment = new Confirmation("Kelly", 500, 248);
		KellyPayment.printFinal();
		
		//second example
		Participant Sophia = new Participant("Sophia", "Italy", 799, "Spring");
		Sophia.printInfo();
		
		Confirmation SophiaPayment = new Confirmation("Sophia", 500, 799);
		SophiaPayment.printFinal();
		
		//error example
		Participant Danielle = new Participant("Danielle", "Italy", 345, "Spring");
	    Danielle.printInfo();
	    
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
		
	}

}
