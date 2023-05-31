/*
    팩토리얼 계산값을 저장하여 Dynamic Programming 방식으로 해결하려고 했지만, 계산 값의 OverFlow 로 인해 실패
*/

class Solution {
public:
    int factorial(int n, vector<long long> &facSave) {
        if (n==0) return 1;
        else if (n <= 2) return n;
        if (facSave[n] == -1) {
            facSave[n] = n * factorial(n-1, facSave);
            return facSave[n];
        } else {
            return facSave[n];
        }
    }

    int uniquePaths(int m, int n) {
        vector<long long> facSave(m+n-1, -1);
        return factorial(m+n-2, facSave) / (factorial(m-1, facSave) * factorial(n-1, facSave));
    }
};