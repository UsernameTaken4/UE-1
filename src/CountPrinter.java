public class CountPrinter implements Runnable
{

    @Override
    public void run()
    {
        for (int i = 0; i <= 200000; i++)
        {
            System.out.println(i);
        }
    }
}
