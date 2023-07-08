# from operator import itemgetter
# import sys
# list = [1,2,3,4,5]
# tuple = (1,2,3,4,5)
# midpoint = len(list)//2
# new_list = list[0:midpoint] + [5] + list[midpoint:]

def second_largest(nums):
    largest = 0
    secondlargest = 0
    for n in nums:
        if n > largest:
            secondlargest = largest
            largest = n
        elif n > secondlargest:
            secondlargest = n
    return secondlargest
nums = [3,5,6,7,8,4]
print(second_largest(nums))






