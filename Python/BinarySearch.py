def binarySearch(arr, left, right, num):
    while (left <= right):
        mid = left + right//2
        if arr[mid] == num:
            return mid
        if num > arr[mid]:
            left = mid + 1
        else:
            right = mid - 1
    return -1


if __name__ == '__main__':
    arr = [1, 2, 3, 4, 5, 6, 7, 8]
    num = 2
    left = 0
    right = (len(arr)-1)
    print(binarySearch(arr, left, right, num))