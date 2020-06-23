
public class Main
{
	 public static void main (String[] args) {
	   
	    System.out.println("Enter Variable");
		int var=new java.util.Scanner(System.in).nextInt();
		for(int num = 1;num <= var; num++)
		{
		    for(int num2 =1;num2 <= num;num2++)
		    System.out.print(num2+" ");
		    System.out.print("\n");
		}
	}
}

