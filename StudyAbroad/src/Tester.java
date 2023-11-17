
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudyAbroad welcome = new StudyAbroad();
		welcome.printWelcomeStatement();
		welcome.printCountries();
		welcome.printLength();
		welcome.printPrompt();
		
		//First example - first scenario
		Participant part1 = new Participant();
		part1.getUserInput();
		part1.printInfo();
		
	    StudyAbroad part1List = new StudyAbroad();
	    part1List.addParticipant();
	    
	
	
		
		//First example - second scenario
		Confirmation partI = new Confirmation();
		partI.getUserInput();
		
		StudyAbroad partIList = new StudyAbroad();
		partIList.addConfirmation();
		
	
		
		FacultyLead faculty1 = new FacultyLead();
		faculty1.Faculty("Claire Fraser", "France", "History");
		faculty1.addToNameList();
		faculty1.print();
		
	
		
		//error example
		Participant promptII = new Participant();
		promptII.getUserInput();
		promptII.printInfo();
		
		StudyAbroad part3List = new StudyAbroad();
		part3List.addParticipant();
		
	   
		//error second scenario	
		Confirmation partII = new Confirmation();
		partII.getUserInput();
		
		StudyAbroad partIIList = new StudyAbroad();
		partIIList.addConfirmation();
		
		FacultyLead facultyII = new FacultyLead();
		facultyII.Faculty("Olivia Benson", "Italy", "Math");
		facultyII.addToNameList();
		facultyII.print();
		
		
	}

}
