# https://leetcode.com/problems/majority-element/
from typing import List
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        counts = {}
        max_count = 0
        res = 0
        for n in nums:
            counts[n] = counts.get(n, 0) + 1
            if counts[n] > max_count:
                max_count = counts[n]
                res = n
        return res

s = Solution()
assert s.majorityElement([3,2,3]) == 3
assert s.majorityElement([2,2,1,1,1,2,2]) == 2