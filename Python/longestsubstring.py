def longest_substring(s):
    a_pointer = 0
    b_pointer = 0 
    max_len = 0
    hashset = set()
    while b_pointer < len(s):
        if s[b_pointer] not in hashset:
            hashset.add(s[b_pointer])
            b_pointer = b_pointer + 1
            max_len = max(max_len, len(hashset))
        else:
            hashset.remove(s[a_pointer])
            a_pointer = a_pointer + 1
    return max_len



s = "abcabcbb"
print(longest_substring(s))