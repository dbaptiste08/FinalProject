
public class Confirmation {
	protected String name;
	protected int payment;
	
	private static int participantCount = 0;
	
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

	public static int getParticipantCount() {
		return participantCount;
	}

	public static void setParticipantCount(int participantCount) {
		Confirmation.participantCount = participantCount;
	}
		

}