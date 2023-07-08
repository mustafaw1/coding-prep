from collections import Counter
def count_instace_of_balloons(text):
    cnt = Counter(text)
    return min(cnt["b"], cnt["a"], cnt["l"]//2, cnt["o"]//2, cnt["n"])

text = "loonbalxballpoon"
print(count_instace_of_balloons(text))