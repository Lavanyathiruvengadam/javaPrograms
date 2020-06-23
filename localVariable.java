
public class Main
{
    	public void display()
		{

	    System.out.println("Enter numbers");
		int num1=new java.util.Scanner(System.in).nextInt();
		int num2=new java.util.Scanner(System.in).nextInt();
		int result;
	
		    result=num1+num2;
		    System.out.println("The output is "+result);
		}
			public static void main(String[] args) {
			    Main obj=new Main();
			    obj.display();
			    
	}
}
