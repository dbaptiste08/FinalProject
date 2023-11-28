import java.util.Scanner;

public class Confirmation {
	protected String name;
	protected int payment;
	protected int id;
	
	
	//default
	public Confirmation () {
		name = "TBD";
		payment = 0;
	}
	
	//intialize constructor
	public Confirmation(String name, int pay, int dent) {
		this.name = name;
		payment = pay;
		id = dent;
		
	}
	
	//overload
	public Confirmation (String name, int pay) {
		this.name = name;
		payment = pay;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {	
		this.payment = payment;
	 		
	}

	 public static void getUserInput() {
	        Scanner keyboard = new Scanner(System.in);
	        String name;
	        int id;

	        System.out.println("Enter your name:");
	        name = keyboard.nextLine();

	        System.out.println("Enter your ID:");
	        id = keyboard.nextInt();
	        keyboard.nextLine();

	        int paymentAmount;
	        do {
	            System.out.println("Enter your payment amount:");
	            paymentAmount = keyboard.nextInt();

	            if (paymentAmount < 500) {
	                System.out.println("Error: Payment amount must be 500 or more.");
	            }
	        } while (paymentAmount < 500);

	        System.out.println("You have officially signed up! We are so excited to have you!");
	        System.out.println("****************************************************************************");
	    }
	
	
}