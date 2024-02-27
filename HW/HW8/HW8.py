def longestPalindrome(self, s):
    hash = set()
    max = 0
    for i in range(len(s)):
        if(s[i] in hash):
            max += 2
            hash.remove(s[i])
        else: 
            hash.add(s[i])
    
    if(len(hash) > 0):
        return max + 1
    else:
        return max
