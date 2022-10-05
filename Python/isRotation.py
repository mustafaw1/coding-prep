def is_rotation(s1, s2):
    if len(s1) != len(s2):
        return False
    s3 = s1 + s1
    if s2 in s3:
        return True
    else:
        return False


if __name__ == "__main__":
    s1 = "waterbottle"
    s2 = "terbottlewa"
    print(is_rotation(s1, s2))