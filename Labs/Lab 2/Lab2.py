def anagram(s, t):
    if len(s) != len(t):
        return False
    sMap = {}
    tMap = {}
    for i in range(len(s)):
        sMap[s[i]] = 1
        tMap[t[i]] = 1
    return sMap == tMap

if __name__ == "__main__":
    print(anagram("listen", "silent"))
print(anagram("fried", "fresh"))
