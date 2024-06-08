package Java_Logical_Programs;

public class Finding_LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		// this is input, from this array we should find largest number
		int[] numbers = {32,53,113,567,321,7896,245,356};
		 
		// here we initializing a temparary largest number 
		 int largestnumber = numbers[0];
		 
		 
		 // here we are iterating for loop untill largest number is identified 
		 for(int i =1; i<numbers.length;i++)// iterarting with tempararyly stored variable 
			 
		 {
			 if(numbers[i]>largestnumber){
		   largestnumber = numbers[i];
			 }
		 }
		 //printing largest number
		 
		 System.out.println("printing largest number is:- "+" "+largestnumber);
	}

}
