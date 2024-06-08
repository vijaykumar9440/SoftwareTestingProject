package Java_Logical_Programs;

public class Reversing_Words_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initializing original and results stroring variable that is reverse variabel 
		//and assigning another variable to store words to iterate and store 
		
		String originalvalue = " i am Boddupalli vijay kumar";
		String reversevalue = "";
		
		//converting original value into   separate arrays words
		String[] words = originalvalue.split(" ");
		  
		// Loop through the array of words in reverse order
		for(int i =words.length-1;i>=0;i-- ) {
			reversevalue = reversevalue+words[i];
		
		if (i!=0) {
			reversevalue = reversevalue+" ";
		}
		
		

		}
		System.out.println("given words reversevalue is :-"+" "+ reversevalue);
}
}
