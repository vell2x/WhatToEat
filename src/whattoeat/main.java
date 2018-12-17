package whattoeat;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String eventType = null;
		int partySize = 0;
		String eval = null;
		String pval;
		String result;
		boolean prep = true;
		boolean erep = true; 
		Scanner escnr = new Scanner(System.in).useDelimiter("\\n");
		Scanner pscnr = new Scanner(System.in);
		
		System.out.print("Welcome to What to Eat please select the following ");
		System.out.print("from the options below for a perfect suggestion ");
		System.out.println("on What to Eat!");
		
		System.out.println("Please enter your party size.");
		while(prep) {
			try {
				prep = false;
				partySize = pscnr.nextInt();
				if(partySize < 1)
					throw new IllegalArgumentException();
			} catch(IllegalArgumentException iae) {
				System.out.printf("Party size must be greater than 1.\n", iae.getMessage());
				prep = true;
			}
		}
		
		switch(partySize) {
		case 1: pval = "in the microwave";
				break;
		case 2: case 3: case 4:
		case 5: case 6: case 7:
		case 8: case 9: case 10:
		case 11: case 12: pval = "in your kitchen";
			break;
		default: pval = "by a caterer";
			break;
		}
		
		System.out.println("What type of event are you having?");
		
		while(erep)
		{
			erep = false;
			try {
				eventType = escnr.nextLine();
				
				if(eventType.equalsIgnoreCase("Casual"))
					eval = "sandwiches";
				else if(eventType.equalsIgnoreCase("Semi-Formal") || eventType.equalsIgnoreCase("Semi Formal"))
					eval = "fried chicken";
				else if(eventType.equalsIgnoreCase("Formal"))
					eval = "chicken parmesan";
				else
					throw new IllegalArgumentException();
			} catch(IllegalArgumentException iae) {
				System.out.printf("Invalid event type please try again.\n", iae.getMessage());
				erep = true;
			}
		}

		result = "You are hosting a " + eventType + " event for " + partySize +
				" paricipant(s), you should serve " + eval + " prepared " + pval + ".";
		System.out.printf("%s", result);
}
}