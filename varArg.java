class DemoVar
{
    int total;
    void add(int... values)
    {
        for(int value : values)
        {
            total += value;
        }
      return total;
        //	System.out.println("total is :"+ total);
    }
}
public class Main
{
    
	public static void main(String[] args) {
	    
	DemoVar obj = new DemoVar();
	obj.add(12,67,9866);
		System.out.println("total is :"+ total);


	}
}