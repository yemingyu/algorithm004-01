from typing import List


class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        i = j = 0
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[j], nums[i] = nums[i], nums[j]
                j += 1