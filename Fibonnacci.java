
public class Main
{
	public static void main(String[] args) {
		int firstNum = 0,secondNum = 1,thirdNum=0;
		for(int var = 1 ;thirdNum <= 89;var++)
		{
		    thirdNum = firstNum + secondNum;
		    if(thirdNum <= 89)
		    System.out.print(thirdNum+" ");
		    firstNum=secondNum;
		    secondNum=thirdNum;
		}
	
	}
}
