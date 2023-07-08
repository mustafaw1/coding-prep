from itertools import accumulate
class numArray:
    def __init__(self, nums):
        self.arr = [0] + list(accumulate(nums))
    def sumRange(self, left, right):
        return self.arr[right + 1] - self.arr[left]


nums = [-2, 0, 3, -5, 2, -1]
num = numArray(nums)
num.sumRange(0,5)
print(num)

    