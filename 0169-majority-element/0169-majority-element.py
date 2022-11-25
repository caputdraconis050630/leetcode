class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        count = 0
        majorElement = None
        for num in nums:
            if count == 0:
                majorElement = num
            count += 1 if majorElement == num else -1
        return majorElement