class Main extends Thread
{
    public static void main(String[] args)
    {
      Main ref =  new Main();
        ref.start();
        
    }
    @Override
    public void run()
    {
        for(int ind =0 ;ind <=5; ind++)
        
        {
            try {
                Thread.sleep(500);
                
            } catch(InterruptedException  ie) {
                System.out.println(ie);
            }
            System.out.print(ind);
            System.out.print("\r");
            }
            System.out.println("Thread is running");
        }
    }
