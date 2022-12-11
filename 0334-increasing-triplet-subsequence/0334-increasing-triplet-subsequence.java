class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        
        int small = nums[0];
        int mid = Integer.MAX_VALUE;
        
        for (int i = 1; i < nums.length; i++) {
            
            if(nums[i] <= small) {
                small = nums[i];
            }
            else if (nums[i] > mid) {
                return true;
            }
            else {
                mid = nums[i];
            }
        }
        return false;
    }
}
