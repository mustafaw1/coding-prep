def Anagrams(list):
       dictionary = {}
       for word in list:
           sortedWord = ''.join(sorted(word))
           if sortedWord not in dictionary:
               dictionary[sortedWord] = [word]
           else:
               dictionary[sortedWord] += [word]
       return [dictionary[i] for i in dictionary]

if __name__ == '__main__':
   list = ["tan", "cat", "aba", "baa", "tac" ]
   print(Anagrams(list))

