def chec_difference(arr):
    increase_counter = 0
    decrease_counter = 0
    for i in range(0, len(arr) - 1):
        if arr[i + 1] - arr[i] > 5:
            increase_counter+=1
        elif arr[i + 1] - arr[i] < -5:
            decrease_counter += 1
    if increase_counter > 3:
        return "going"
    elif decrease_counter > 3:
        return "coming"

if __name__ == "__main__":
    arr = [10, 4, 14, 12, 54, 78, 23, 3, 12, 845]
    print(chec_difference(arr))

