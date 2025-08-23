class Solution:

    def isAnagram(self, s: str, t: str) -> bool:
        
        if len(s) != len(t):
            return False
        
        letters = [0]*26
        
        for i in range(len(s)):
        
            pos1 = ord(s[i]) - ord('a')
            letters[pos1] += 1

            pos2 = ord(t[i]) - ord('a')
            letters[pos2] -= 1

        for letter in letters:
        
            if letter != 0:
                return False
        
        return True