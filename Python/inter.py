def has(nums):
    has_pas = False
    has_neg = False
    for num in nums:
        has_pas = num > 0
        has_neg = num < 0
    return (has_pas, has_neg)

tree = has(list[1, 2])
print(tree)  










 