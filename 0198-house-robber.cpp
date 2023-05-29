class Solution
{

    /*
        Recursive + Memoization:
        Time Complexity : O(n)
        Space Complexity : O(n) + O(n)
    */

private:
    int solve(int i, vector<int> &nums, vector<int> &dp)
    {
        if (i == 0)
            return nums[0];
        if (i < 0)
            return 0;

        if (dp[i] != -1)
            return dp[i];

        int pick = nums[i] + solve(i - 2, nums, dp);
        int notPick = 0 + solve(i - 1, nums, dp);

        return dp[i] = max(pick, notPick);
    }

public:
    int rob(vector<int> &nums)
    {
        int n = nums.size();

        if (n == 1)
            return nums[0];

        vector<int> dp(n, -1);

        solve(n - 1, nums, dp);
        return dp[n - 1];
    }
};