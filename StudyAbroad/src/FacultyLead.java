import java.util.HashSet;
public class FacultyLead {
	
	private String name;
	private String countryLocation;
	private String subjectTaught;
	private HashSet <String> nameList;
	
	public void Faculty(String name, String countryLocation, String subjectTaught) {
		this.name = name;
		this.countryLocation = countryLocation;
		this.subjectTaught = subjectTaught;
		this.nameList = new HashSet <>();
		
		
	}
	
	
	

}
