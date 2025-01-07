class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        s = dict()
        for num in nums:
            if num in s:
                return True
            s[num] = 0

        return False