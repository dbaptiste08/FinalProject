
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Study Abroad!");
		System.out.println("Please write your name, country, year, and semester");
		
		Participant Kelly = new Participant("Kelly", "France", 2, "Maymester");
		Kelly.printInfo();
		
		Confirmation KellyPayment = new Confirmation("Kelly", 500);
		KellyPayment.printFinal();
		
		
		
		StudyAbroad info = new StudyAbroad();
		info.printCountries();
		info.printLength();
		
		FacultyLead faculty1 = new FacultyLead();
		faculty1.Faculty("Claire Fraiser", "Italy", "History");
		faculty1.addToNameList("Lucy");
		faculty1.addToNameList("Jamie");
		faculty1.print();
		
		FacultyLead faculty = new FacultyLead();
		faculty.Faculty("Karen Aguar", "Italy", "MIS");
		faculty.addToNameList("Danielle");
		faculty.addToNameList("Sophia");
		faculty.print();
		
	}

}
