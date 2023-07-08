from collections import Counter
def longest_common_substring(strs):
    strs.sort()
    first_element = strs[0]
    last_element = strs[-1]
    res = []
    for i in range(len(strs)):
        if first_element[i] != last_element[i]:
            break

    return first_element[:i]

strs = ["flower","flow","flight"]
print(longest_common_substring(strs))