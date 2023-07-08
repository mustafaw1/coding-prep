# def maxsum(nums, key):
#     max_sum = -1
#     n = len(nums)
#     for i in range(0, n - key + 1):
#         temp = 0
#         for j in range(i, i + key):
#             temp += nums[j]
#         if temp > max_sum:
#             max_sum = temp
#     return max_sum
def maxSum(arr, n, k):
    if n < key:
        print('invalid')
    res = 0
    for i in range(k):
        res += nums[i]
    cur_range = res
    for i in range(k, n):
        cur_range += nums[i] - nums[i - k]
        res = max(res, cur_range)
    return res

nums = [3, 8, 2, 5, 9, 1, 2]
n = len(nums)
key = 3
print(maxSum(nums,n, key))

    