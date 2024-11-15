# https://leetcode.com/problems/squares-of-a-sorted-array/
from typing import List
class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        n = len(nums)
        res = [0] * n
        left, right = 0, n - 1
        i = n - 1

        while left <= right:
            left_num = nums[left] ** 2
            right_num = nums[right] ** 2

            if left_num > right_num:
                res[i] = left_num
                left += 1
            else:
                res[i] = right_num
                right -= 1

            i -= 1
        return res