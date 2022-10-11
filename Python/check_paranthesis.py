def is_balanced(s):
    stack = []
    for i in range(0, len(s)):
        c = s[i]
        if c == "(":
            stack.append(")")
        if c == "[":
            stack.append("]")
        if c == "{":
            stack.append("}")
        elif c == ")" or c == "]" or c == "}":
            if len(stack) == 0 or stack.pop() != c:
                return False
    
    return True


if __name__ == "__main__":
    s = "{[]]}"
    print(is_balanced(s))
