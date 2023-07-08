def second_largest(nums):
    largest = second_largest = 0 #or -math.inf if you want to account for any possible value
    for n in nums:
        if n > largest:
               second_largest = largest
               largest = n
        elif n > second_largest:
               second_largest = n
    return second_largest



nums = [4, 7, 9, 2, 10]
print(second_largest(nums))
