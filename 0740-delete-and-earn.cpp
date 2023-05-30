class Solution {
public:
    int solve(int i ,vector<int>&nums,vector<int>&freq,vector<int>&dp,int maxele){
        if(i>maxele)return 0;
        
        if(dp[i]!=-1)return dp[i];
        int nottake = solve(i+1,nums,freq,dp,maxele);

        int take = i*freq[i]+solve(i+2,nums,freq,dp,maxele);
        
        return dp[i]=max(take,nottake);
    }

    int deleteAndEarn(vector<int>& nums) {
        
        int n=nums.size();
        int maxele = *max_element(nums.begin(),nums.end());
            
        vector<int>dp(maxele+1,-1),freq(maxele+1,0);
            
        for(auto ele :nums)freq[ele]++;
            
        return solve(1,nums,freq,dp,maxele);
    }
};