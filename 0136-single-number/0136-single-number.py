class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        # XOR 사용
        t = 0
        for i in nums:
            t ^= i
        return t