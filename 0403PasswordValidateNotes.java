// Carrie Krueger
// 04-3-23
// Partial code for validatePassword() method from Project: Password Suite


public class PasswordValidateNotes {
	
	public static void main(String[] args) {
	    
	    // partial main method code
	    // input is the password that the user typed in to check 
	    
	    if(validatePassword(input) == true) {
	    	System.out.println("Password valid");
	    } else {
	        System.out.println("Password invalid");
	    }
	}
	

	public static boolean validatePassword(String input) {

        // PRE-CONDITIONS: The main method will pass in a String
		// POST-CONDITIONS: "true" will be returned if the parameter "input" is
		// a valid password, as per the specifications. "false" will be returned otherwise
		//
		// The specifications are:
		// 1. There are at least eight characters in the password
		// 2. At least one of the characters is capitalized
		// 3. There are at least two digits (0-9) in the password

           // ex. input = "ABcDEfg123!"

        // check length for 8 characters
        
        if(input.length() < 8) {
            return false;
        }

        // check for at least 1 capital letter

        int loopCounter = 0;
        int capitalCounter = 0;

        while(loopCounter < input.length()) {
            char ch = input.charAt(loopCounter);

            if(ch >= 'A' && ch <= 'Z'){
                capitalCounter++;
            }

            loopCounter++;
        }

        // check for at least 2 numbers 
        // ** WRITE THIS PART OF THE CODE ** //

        // returns true if password passes the above tests

        if(capitalCounter >= 1 && numberCounter >= 2) {
            return true;
        }
        return false;
    }

}
