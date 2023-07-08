from operator import itemgetter
from collections import Counter
numbers = [1, 2, 3, 4, 5]
from collections import defaultdict
# x = [i + i for i in numbers] double each number

#x = [numbers[i:i + n] for i in range(0, len(numbers), n)] divide list in chunks of n
# x = numbers[-1] get last number from a list

list_dict = {'Nama': "Taha", 'Gpa': 4.3, 'Name': 'Mustafa', 'Gpa': 4.3}
list_dict2 = {'Nama': 'Murtaza', 'Gpa': 4.6, 'Name': 'Mehdi', 'Gpa': 4.3}
# x2 = sorted(list_dict, key=lambda d: d["gpa"], reverse=True)sort dictionary using lambda
# x = sorted(list_dict, key=itemgetter("gpa"), reverse=True) sort dictionary using itemgetter
# x = [i for i in numbers if i % 2 == 0]print even numbers in list
# x = [key for key in list_dict] get keys from a dict using list comprehension
# x = list_dict.values() get all keys and values using built in
# keys = list_dict.keys()
# values = list_dict.values()
# x = list(zip(keys, values))get keys and values as a list of tuple
# count_freq = str(Counter(x))count frequency of all character in a string
l1 = [1, 2, 3, 4, 5]
l2 = [6, 7, 8, 9, 10]
# x = l1 + l2 concatinate using + operator, this operator return a new list after concatinating them 
# l1.extend(l2) using extends function, extend fucntion performs inplace concatination 
# x = [*l1, *l2] uisng a *operator it returned a new list after concatinating them
s  = "hello, im mustafa"
# x = defaultdict(lambda: 0)
# for i in s:
#     x[str(sorted(i))].append(i)
x = defaultdict(lambda: 0)
for i in s:
    x[i]+=1

print(x)
# a_list = []
# some_dict = {"firstname": "Albert", "nickname": "Albert", "surname": "Likins", "username": "Angel"}
# rev_multidict = {}
# for key, value in some_dict.items():
#     rev_multidict.setdefault(value, set()).add(key)
# print(rev_multidict)


