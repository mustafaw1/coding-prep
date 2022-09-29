def isPalindrome(string):
    n = len(string)
    i = 0
    count = 0
    compressed = ''
    for i in range(len(string) - 1):
        if(string[i] == string[i + 1]):
            count = count+1
        else:
            compressed = compressed + string[i] +  str(count)
    print(compressed)


if __name__ == "__main__":
    string = "wwwwaaadexxxxxxywww"
    isPalindrome(string)
