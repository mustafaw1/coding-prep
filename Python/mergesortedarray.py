# def remove_zeroes(nums):
#     for i in range(len(nums))[::-1]:
#         if nums[i] == 0:
#             del nums[i]
#     return nums
# def merge(nums1, m, nums2, n):
#     remove_zeroes(nums1)
#     nums1.extend(nums2)
#     nums1.sort()
#     return nums1

def merge(nums1, m, nums2, n):
    """
    Do not return anything, modify nums1 in-place instead.
    """
    for i in range(m,m+n): 
        nums1[i]=nums2[i-m]
    nums1.sort()
    return nums1
            
nums1 = [1,2,3,0,0,0]
m = 3 
nums2 = [2,5,6]
n = 3 
print(merge(nums1, m, nums2, n))  
   