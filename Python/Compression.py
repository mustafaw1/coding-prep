def string_compression(string):
    count = 1
    compressed = ''
    for i in range(len(string) - 1):
        if(string[i] == string[i + 1]):
            count+=1
        else:
            compressed+=string[i] + str(count)
            count = 1
    compressed+=string[i] + str(count)
    return compressed        
    


if __name__ == "__main__":
    string = "wwwwaaadexxxxxxywww"
    print(string_compression(string))
    
