def median_matrix(num1, num2):
    new_list = []
    new_list = num1
    for i in range(len(new_list) - 1):
        new_list.extend(num2)
        median = int(len(new_list)/2)
    return median



num1 = [1, 2]
num2 = [3, 4]

print(median_matrix(num1, num2))

