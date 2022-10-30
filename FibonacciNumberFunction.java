    //Using Dynamic Programming
    static int fib(int n)
    {
    i
    f[1] = 1;
     
    for (i = 2; i <= n; i++)
    {
        f[i] = f[i-1] + f[i-2];
    }
      
    return f[n];
    }
