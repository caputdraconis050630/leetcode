class Solution {
public:
    int fib(int n) {
        if (n==0) return 0;
        int *F = new int[n+1]; // Array
        F[0] = 0; F[1] = 1; // Initialization
        for (int i=2; i<=n; i++) 
            F[i] = F[i-1] + F[i-2];
        return F[n];
    }
};