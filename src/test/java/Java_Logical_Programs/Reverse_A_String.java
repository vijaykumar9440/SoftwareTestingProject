package Java_Logical_Programs;

public class Reverse_A_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// initializing varaiables 
		
		String originalvale = "vijaykumar";
		// initializing a empty variable to store result reverse value
		String reversevalue = "";
		 // initializing char variable to store every char at once while reversing string variable 
		
		char ch;
		
		for( int i =0; i<originalvale.length();i++)
		{
			ch = originalvale.charAt(i);
			reversevalue = ch+reversevalue;
		}
		System.out.println("reverse string value for "+originalvale+"is:-"+reversevalue);
		

	}

}
