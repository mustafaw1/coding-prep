from heapq import merge
import itertools
from operator import itemgetter
from pandas.core.common import flatten
list = [1,3,4,[5,6,7]]
# a,b, *c = list
# def merge(d1, d2):
    # return(d2.update(d1))using update method the update method doesn't create new list it appends in second list and return none
    # res = {**d1, **d2} the double asterik method iterate over both the dict and create a new list first append dict one and the append second dict
    # res = d1 | d2 the or operator method merge the two dict and create a new dict 
#     return res
d1 = {"Taha": 3.2, "Mustafa": 2.5}
d2 = {"Murtaza": 3.4, "Mehdi": 3.5}
# merge_dict = d1 | d2
# res = sorted(d1, key = itemgetter('gpa'))





# for i in l2:iterate over l2 and append all items in l1 using append method
#     l1.append(i)
# l3 = l1 + l2 using + operator + operator add elements of l1 and l2 in a third list
# l1.extend(l2) uisng extend method extend method doesnt create new list it concatinate list inplace
test_list = [[1,3,4], [4,5], [6,7]]
# test_list = [i for i in [[1,2,3], [4,5], [6,7]] for i in i]using list comprehension
 
# test_list = sum(test_list, [])flat list using sum method
#test_list1= list(itertools.chain(*test_list))using itertools chain method
test_list = flatten(test_list)
print(test_list)

 
