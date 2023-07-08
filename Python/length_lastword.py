def lengthlastword(s):
    end = len(s) - 1
    while(end >= 0 and s[end] == " "):
        end -= 1
    last_index = end
    while(last_index > 0 and s[end] != " "):
        end -= 1
    return last_index - end
# def lengthOfLastWord(s):
#     return len(s.split()[-1])

s = "   fly me   to   the moon  "
print(lengthlastword(s))
    