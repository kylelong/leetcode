# https://leetcode.com/problems/two-sum/
from typing import List
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        indices = {}
        for index, num in enumerate(nums):
            diff = target - num
            if diff in indices:
                return [indices[diff], index]
            indices[num] = index