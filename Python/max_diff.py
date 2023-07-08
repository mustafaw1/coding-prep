def max_dif(nums, k):
    length = len(nums)
    nums.sort()
    a = 0
    b = k -1
    res = float('inf')
    while(b < length):
        res = min(res, nums[b] - nums[a])
        a = a + 1
        b = b + 1
    return res

nums = [9,4,1,7]
k = 2
print(max_dif(nums, k))