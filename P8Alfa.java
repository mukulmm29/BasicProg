package basicprog;

import java.util.Arrays;

public class P8Alfa {
	public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();
 
        // Sorting temp array using
        Arrays.sort(tempArray);
 
        // Returning new sorted string
        return new String(tempArray);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Mukul Mayacharya";
        String outputString = sortString(inputString);
 
        // Print and display commands
 
        // Input string
        System.out.println("Input String : " + inputString);
        // Output string
        System.out.println("Output String : "+ outputString);
	}

}