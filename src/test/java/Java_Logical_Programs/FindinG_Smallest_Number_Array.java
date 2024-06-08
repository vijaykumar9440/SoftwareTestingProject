package Java_Logical_Programs;

public class FindinG_Smallest_Number_Array {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		// actual input , we should find smallest numbers from given array
		int[] numbers = {35,656,76,323,245,2,3,51,9};
		
		// we are initialising a temparary smallest number to store for comparing with other 
	//	numbers untill smallest number is stored
		
		int smallestNumber = numbers[0];
		 
		//using iteration to find smallest number 
		for(int i =1; i<numbers.length;i++) { 
			// we have taken first number,and iterating untill last number.
			if(i<smallestNumber) { 
				// comparing every  each number in array with all numbers in arrray
				smallestNumber=numbers[i];// 
			}
		}
		
		//printing smallest number in array
		System.out.println("smallest number itn the given array is :-"+" "+smallestNumber );
		 
		
		

	}

}
