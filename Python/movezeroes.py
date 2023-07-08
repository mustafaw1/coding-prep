def move_zeroes(nums):
    for i in range(len(nums))[::-1]:
        if nums[i] == 0:
            nums.pop(i)
            nums.append(0)
    return nums

    
    
  

nums = [0,1,1,0,1,1,1,0,0,0]
print(move_zeroes(nums))
        