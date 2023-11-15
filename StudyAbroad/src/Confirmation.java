
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
	 if (payment < 500) {
		this.payment = payment;
	 }
	 else {
		 System.out.println("Error");
	 }
		
	}

	
	public void printFinal() {
		System.out.println("You officially have a spot for the study aborad program!");
		System.out.println("We are so excited to have you!");
	}
		

}