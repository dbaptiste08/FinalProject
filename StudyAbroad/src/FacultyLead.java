import java.util.HashSet;
import java.util.Scanner;
public class FacultyLead extends Participant {
	
	private String name;
	private String countryLocation;
	private String subjectTaught;
	private HashSet <String> nameList;
	
	//constructor
	public FacultyLead() {
		super();
		subjectTaught = "TBD";
	}
	
	public void Faculty(String name, String countryLocation, String subjectTaught) {
		this.name = name;
		this.countryLocation = countryLocation;
		this.subjectTaught = subjectTaught;
		this.nameList = new HashSet <>();
	}
	
		public String getCountryLocation() {
			return countryLocation;
		}
		public String getsubjectTaught() {
			return subjectTaught;
		}
		public void addToNameList() {
			 Scanner keyboard = new Scanner(System.in);
		     System.out.print("Enter student name " );
		     String studentName = keyboard.nextLine();
		     nameList.add(studentName);
		}
		
	
		public void print() {
		//	System.out.println("***************************************");
			System.out.println("Faculty Name: " + name);
			System.out.println("Country Location: " + countryLocation);
			System.out.println("Subject Taught: " + subjectTaught);
			System.out.println("Student Names: " + nameList);
			System.out.println("****************************************************************************");
		}
       
		
		
	}
	
	
	


