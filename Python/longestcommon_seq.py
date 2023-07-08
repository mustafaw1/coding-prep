def longest_common_sequence(nums):
    if len(nums) == 0:
        return 0
    nums = sorted(set(nums))
    cur_length = 1
    last_element = nums[0]
    res = 1
    for i in range(len(nums)):
        if nums[i] == last_element + 1:
            cur_length += 1
        else:
            cur_length = 1
        res = max(res, cur_length)
        last_element = nums[i]
    return res

nums = [9,1,4,7,3,-1,0,5,8,-1,6]
print(longest_common_sequence(nums))









    
    
    



    
