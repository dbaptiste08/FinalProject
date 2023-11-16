import java.util.ArrayList;
import java.util.Scanner;

public class Participant {
	
	protected String name;
	protected int id;
	protected String country;
	protected String semester;
	
	
	
	
	//default constructor
	public Participant () {
		name = "TBD";
		id = 0;
		country = "TBD";
	}
	
	//intialize constructor
	public Participant(String name, String countryLocation) {
		this.name = name;
		country = countryLocation;
	}
	
	public Participant (String name, String countryLocation, int dent, String sem) {
		this.name=name;
		country = countryLocation;
		id = dent;
		semester = sem;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int dent) {
		this.id = dent;
	}


	public String getCountry() {
		return country;
	}

	public void setCountry(String countryLocation) {
		this.country = countryLocation;
	}

	
	//prompt user
	public void getUserInput() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your name:");
        name = keyboard.nextLine();

        System.out.println("Enter your ID:");
        id = keyboard.nextInt();
        keyboard.nextLine(); 

        System.out.println("Enter your country:");
        System.out.println("Countries to choose from: ");
        System.out.println("France");
        System.out.println("Italy");
        System.out.println("Greece");
        System.out.println("Spain");

        boolean validCountry = false;
        while (!validCountry) {
            String inputCountry = keyboard.nextLine();
            if (inputCountry.equalsIgnoreCase("France") || inputCountry.equalsIgnoreCase("Italy") ||
                    inputCountry.equalsIgnoreCase("Greece") || inputCountry.equalsIgnoreCase("Spain")) {
                country = inputCountry;
                validCountry = true;
            } else {
                System.out.println("Error: Please enter a valid country (France, Italy, Greece, or Spain):");
            }
        }
    }
     
	
	

	
	
	
	public void printInfo() {
		//System.out.println("********************************************************");
		System.out.println("Thank you for your interest in study abroad!");
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
		System.out.println("Country: " + country);
		System.out.println("Semester: " + semester);
		System.out.println("***************************************************************************************************************");

	}
	
	
	
	
	
	
	
	
	
	
	
	

}
