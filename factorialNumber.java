
public class Main
{
	public static void main(String[] args) {
	int fact =1;
	System.out.println("Enter Variable");
	int var = new java.util.Scanner(System.in).nextInt();
	for(int num = 1;num <= var;num++)
	{
	    fact = fact*num; 
	}
	System.out.println("The  factorial number is: "+fact);
	}
}

