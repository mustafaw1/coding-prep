def is_anagram(s):
    dict = {}
    for i in s:
       sortetlist = "".join(sorted(i))
       if sortetlist in dict:
          dict[sortetlist].append(i)
       else:
          dict[sortetlist] = [i]
    return dict
if __name__ == "__main__":
    s = [ "tan", "cat", "aba", "baa", "tac" ]
    print(is_anagram(s))
