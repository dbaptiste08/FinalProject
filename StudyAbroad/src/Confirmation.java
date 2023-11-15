
public class Confirmation {
	protected String name;
	protected int payment;
	
	
	//default
	public Confirmation () {
		name = "TBD";
		payment = 0;
	}
	
	//intialize constructor
	public Confirmation(String name, int pay) {
		this.name = name;
		payment = pay;
		
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

	
	public void printFinal() {
        System.out.println("********************************************************");
        System.out.println("You officially have a spot for the study abroad program!");
        if (payment < 500) {
            System.out.println("Error: Payment must be at least 500 for confirmation. You are not signed up for the study abroad program.");
        } else {
            System.out.println("You have officially signed up! We are so excited to have you!");
        }
        System.out.println("********************************************************");
	}		

}