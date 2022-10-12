def roman_2int(s):
    roman_dict = {"I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000}
    result = 0
    for i in range(len(s) - 1):
        if roman_dict[s[i]] >roman_dict[s[i + 1]]:
            result +=roman_dict[s[i]]
        else:
            result -=roman_dict[s[i]]
    result = result +roman_dict[s[len(s) - 1]]
    return result


if __name__ == "__main__":
    s = "IX"
    print(roman_2int(s))
