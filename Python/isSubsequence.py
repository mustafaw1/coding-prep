def is_subsequence(s,t):
    elements_in_t = iter(t)
    for elements in s:
        if elements not in elements_in_t:
            return False
    return True

s =  "axc"
t = "ahbgdc"
print(is_subsequence(s, t))
