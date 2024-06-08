package Java_Logical_Programs;

public class Finding_Factorial_for_given_number {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// initializing i for loop counter and initializing fact to 1 and result will store in fact 
		
		int i, fact = 1;
		 
		// giving input 
		int inputnumber = 8;
		
		// here we are looping from 1 to given number
		
		for( i =1; i<=inputnumber; i++)
		{
			fact=fact*i;
		}
		System.out.println("THE FACTORIAL FOR GIVEN NUMBER IS :-"+" "+ fact);

	}

}
