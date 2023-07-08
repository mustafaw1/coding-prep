from collections import Counter
def wordpattern(pattern, s):
    words = s.split()
    pattern_counter = Counter(pattern)
    word_counter = Counter(words)
    pair_counter = Counter(zip(pattern_counter, word_counter))
    return len(pattern_counter) ==len(word_counter) == len(pair_counter) and len(pattern) == len(words)
# def wordPattern(pattern, s):
#     s = s.split(' ')
#     return len(set(zip(pattern, s))) == len(set(s)) == len(set(pattern)) and len(pattern) == len(s)

pattern = "abba"
s = "dog cat cat dog"

print(wordpattern(pattern, s))
