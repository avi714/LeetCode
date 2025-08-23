class Solution:

    def isAnagram(self, s: str, t: str) -> bool:
        
        if len(s) != len(t):
            return False
            
        frequency = dict()

        for i in range(len(s)):
        
            character1 = s[i]
            character2 = t[i]
            
            if character1 in frequency:
                frequency[character1] += 1
                
            else:
                frequency[character1] = 1
                
            if character2 in frequency:
                frequency[character2] -= 1
                
            else:
                frequency[character2] = -1

        for letter in frequency:
        
            if frequency[letter] != 0:
                return False
        
        return True