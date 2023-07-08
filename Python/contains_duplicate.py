def find_duplicate(nums):
    nums.sort()
    for i in range(len(nums) - 1):
        if nums[i] ==  nums[i+1]:
            return True
    return False

if __name__ == "__main__":
    nums = [1,2,3]
    print(find_duplicate(nums))