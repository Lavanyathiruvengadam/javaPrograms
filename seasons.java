
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter Variable");
		int var = new java.util.Scanner(System.in).nextInt();
		switch(var)
		{
		    case 1:
		    case 2:
		    case 12:
		    System.out.println("WINTER");
		    break;
		     case 3:
		    case 4:
		    case 5:
		    System.out.println("SPRING");
		    break;
		     case 6:
		    case 7:
		    case 8:
		    System.out.println("SUMMER");
		    break;
		     case 9:
		    case 10:
		    case 11:
		    System.out.println("AUTUMN");
		    break;
		    default:
		    System.out.println("NO SUCH SEASON EXISTS");
		    
		}
	}
}
