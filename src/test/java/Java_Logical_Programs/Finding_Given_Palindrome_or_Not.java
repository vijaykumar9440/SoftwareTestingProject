package Java_Logical_Programs;

public class Finding_Given_Palindrome_or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int originalvalue = 123456;
		 int reversevalue = 0;
		 int temp= originalvalue;
		 
		 
		 while (temp!=0)
		 {
			 int digit = temp%10;
			 
			 
			 reversevalue	= reversevalue*10+digit;
			 temp= temp/10;
		 }
		if (originalvalue==reversevalue)
		{
			System.out.println("given number is palindrome");
		}
		else
		{
			System.out.println("given number is not palindrome");
		}
		

	}

}
