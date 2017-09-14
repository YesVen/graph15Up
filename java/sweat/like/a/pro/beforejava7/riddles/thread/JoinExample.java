package sweat.like.a.pro.beforejava7.riddles.thread;

/*
 * Wait for the thread to die.
 * 
 * If we call join on thread t1. t1.join()
 * 
 * main thread will wait for thread t1 to die and then main thread will start further execution
 */
public class JoinExample
{
   public static void main(String[] args) throws InterruptedException
   {
      Thread t = new Thread(new Runnable()
         {
            public void run()
            {
               System.out.println("First task started");
               System.out.println("Sleeping for 2 seconds");
               try
               {
                  Thread.sleep(2000);
               } catch (InterruptedException e)
               {
                  e.printStackTrace();
               }
               System.out.println("First task completed");
            }
         });
      Thread t1 = new Thread(new Runnable()
         {
            public void run()
            {
               System.out.println("Second task completed");
            }
         });
      t.start(); // Line 15
      
      //main thread will wait for thread t1 to die and then main thread will start further execution
      t.join(); // Line 16
      t1.start();
   }
}
