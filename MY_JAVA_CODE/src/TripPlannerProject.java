import java.util.Scanner;

public class TripPlannerProject {

	
	public static void main(String[] args) {
		System.out.println("Hello, welcome to you in our office. ");
		System.out.println("What is your name? ");
		
			MyName();
			ThankYou();	
			YourDestination();
			CostAndTime();
	}			
		static void MyName() {
			Scanner sc = new Scanner (System.in);
		    System.out.print("Input your first name: ");
		    String fname = sc.next();
		    System.out.print("Input your last name: ");
		    String lname = sc.next();
		    System.out.println();
		    System.out.println("My name is  "+fname+" "+lname);
		}
		static void ThankYou() {
				
			System.out.println("Thank You. \nCould you please tell us where would you like to go?");
		}
		static void YourDestination() {
					
			System.out.print("It sounds like a great trip. ");
		}
			static void CostAndTime() {
				
			System.out.print("Could you tell me about your time and the budget. \nHow many days are you sepnding there on your desitination? . ");
		}
	}


