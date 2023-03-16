public class ThreadExample {
    synchronized void method1()
    {
        for(int i=1;i<10;i++)
        {
            if(i==3)
            {
                try {
                    System.out.println("Waiting for notify");
                    wait();
                    System.out.println("Got notified");
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
            }
            System.out.println("Called from methord 1:"+i);
        }
    }
    synchronized void method2()
    {
        for(int i=1;i<10;i++)
        {
            System.out.println("Calling from method 2:"+i);
        }
        notify();
    }
}
