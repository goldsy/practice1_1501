import java.math.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class Combinations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        // Prompt the user to enter the number of bits to
		// get the possible combinations for.
        System.out.print("Enter number of bits: ");
        
        // Open up a standard input.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String userInput = "";

        boolean exitFlag = false;
        
        while (!exitFlag) {
        	// Read the input from the command line.  Need to use the try/catch
        	// with the readline() method.
        	try {
        		userInput = br.readLine();
        	} catch (IOException ioe) {
        		System.out.println("IO error trying to read your input!");
        		System.exit(1);
        	}
            
        	if (userInput == "quit") {
        		exitFlag = true;
        	}
        	else {
        		// Check if the input is integer.
                Pattern p = Pattern.compile("[0-9].*");
                Matcher m = p.matcher(userInput);
                
                if (!m.matches()) {
                	int numBits = Integer.parseInt(userInput);
                	new Combinations(numBits);
                }
                else {
                    System.out.println("Your input must be an integer.");
                }
        	}
        }
	}
	
	/**
	 * @param n  Indicates the number of bits.
	 */
	public Combinations(int n){
		// TODO: (goldsy) Add the next overloaded ctor here.
		new Combinations(new int[n], 0);
	}
	
	
	/**
	 * @param box
	 */
	public Combinations(int [] box, int n){
		if (n == box.length){
			// TODO: (goldsy) Add the print function here.
		}
	}

}
