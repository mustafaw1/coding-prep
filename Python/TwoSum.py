def two_sum(arr, target):
    dict = {}
    n = 2
    result = [None] * n
    for i in range(len(arr)):
        diff = target - arr[i]
        if diff in dict:
            result[0] = diff
            result[1] = arr[i]
        dict[arr[i]] = arr[i]
    return result


if __name__ == '__main__':
    arr = [2, 10, 9, 12, 8, 24]
    target = 12
    print(two_sum(arr, target))
