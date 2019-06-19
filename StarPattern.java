import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		
		
	        System.out.println("Print upper side of the Diamond ");
	       starPattern();
	       System.out.println("Print the lower side of the Diamond");
	       starPattern();
	       
	    }

	    
	    public static void starPattern() {
	    	//for upper part
	        for (int i = 0; i <10; i++) {
	        	//for space
	            for (int j = 1; j <  10- i; j++) {
	                System.out.print(" ");
	            }
	            //for star
	            for (int k = 1; k <= i-1; k++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	     for (int i = 9; i <=i-1; i++) {
	    	 for (int j=1; j<=i; j++){
	    	 
	    	 System.out.print(" ");
	    	 for(int k = 1; k<= i-1; k++) {
	    		 System.out.print(" *");
	    	 }
	      
	        
	        }
	        
	        
	    }
}
	    
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


