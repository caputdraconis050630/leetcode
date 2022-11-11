import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1_len = nums1.length;
        for (int i=m; i < nums1_len; i++) {
            nums1[i] = nums2[--n];
        }
        Arrays.sort(nums1);
    }
}