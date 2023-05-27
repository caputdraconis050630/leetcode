class Solution
{
private:
    int F[33];

public:
    int fibon(int n)
    {
        int ans, f1, f2;
        if (n < 2)
            return n;
        else
        {
            if (F[n - 1] == -1)
                f1 = fibon(n - 1);
            else
                f1 = F[n - 1];

            if (F[n - 2] == -1)
                f2 = fibon(n - 2);
            else
                f2 = F[n - 2];

            ans = f1 + f2;
            F[n] = ans;
            return ans;
        }
    }

    int fib(int n)
    {
        memset(F, -1, 33 * sizeof(int));
        int ans = fibon(n);
        return ans;
    }
};