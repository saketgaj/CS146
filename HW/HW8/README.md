My approach is to add each character of s to a HashSet and track the number of occurrences. The first step is to create a HashSet, a variable to maintain the longest length, and loop through string s adding any new characters to the set. If the character is already in the set, increase the max variable by 2 (since you found 2 of that character) and remove the character from the set to avoid checking it again. By the end of this loop, the max variable would have the longest length of palindrome from string s of only duplicate letters. Check if there are still any more characters left in the set, and if so, return max variable + 1. If not, then simply return the max variable, which have the length of the longest palindrome in string s.