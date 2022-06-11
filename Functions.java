
	public class Functions {
		public static int even(int num) {
		        if(num % 2 == 0)
		        {System.out.print("The given number is Even: ");}
		        else
		        {System.out.print("The given number isn't even ");}
				return num;}
		public static int oddno(int num) {
	        if(num % 2 != 0)
	        {System.out.print("The given number is Odd: "); }
	        else
	        { System.out.print("The given number isn't odd: ");}
			return num;}
	public static int Prime(int num) {  
		    boolean flag = false;
		    for (int i = 2; i <= num / 2; ++i) {
		      if (num % i == 0) {
		        flag = true;
		        break;}}
		    if (!flag)
		      System.out.print("the number is prime number: ");
		    else
		      System.out.print("the number is not prime number: ");
			return num;}
	public static int Factorial(int num){
		int i,fact=1;  
	  for(i=1;i<=num;i++){    
	      fact=fact*i;  }    
	  System.out.print("Factorial of "+num+" is: ");
	return fact; }
public static void main(String[]args) {
	int even= even(4);
	System.out.println(even);
	int odd= oddno(5);
	System.out.println(odd);
	int prime= Prime(7);
	System.out.println(prime);
	int factorial= Factorial(6);
	System.out.println(factorial); }

}
