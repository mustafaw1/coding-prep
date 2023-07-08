# def findDisappearedNumbers(nums):
#     nums.sort()
#     # t = set(nums)
#     misssing_elements = []
#     for i in range(0, len(nums)):
#         if i not in nums:
#             misssing_elements.append(i)
#     return misssing_elements
def findDisappearedNumbers(nums):
        res = []
        for x in nums:
            if nums[abs(x)-1] > 0:
                nums[abs(x)-1]*=-1
        for i, x in enumerate(nums):
            if x> 0:
                res.append(i+1)
        return res

nums = [1,1]
print(findDisappearedNumbers(nums))


