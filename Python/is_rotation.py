def is_rotation(s1, s2):
    if len(s1) != len(s2):
        return False

    duals1 = s1 + s1

    if s2 in duals1:
        return True
    else:
        return False


if __name__ == "__main__":
    s1 = "waterbottle"
    s2 = "terbottlewa"
    print(is_rotation(s1, s2))
