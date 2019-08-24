public class Practice01MathIterative implements Practice01Math
{
    public int fact(int n) throws Exception
    {
        int factorial = 1;
        
        if (n < 0)
        {
            throw new Exception();
        }
        
        for (int i = 1; i <= n; i++)
        {
            factorial *= i;
        }

        return factorial;
    }

    public int fib(int n) throws Exception
    {
        if (n < 0)
        {
            throw new Exception();
        }
        
        if (n == 0 || n == 1)
        {
            return n;
        }

        else
        {
            int fibonacci = 1;
            int temp = 1;

            for (int i = 2; i < n; i++)
            {
                fibonacci += temp;
                temp = fibonacci - temp;
            }

            return fibonacci;
        }
    }
}