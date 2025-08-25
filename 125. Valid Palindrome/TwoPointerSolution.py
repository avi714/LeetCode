class TwoPointerSolution:

	#Creating a method that checks if the character is alphanumeric based on its ascii value.
    def alphanumeric(self, s):
    
        if ((ord('a') <= ord(s.lower()) <= ord('z'))
        or
        (ord('0') <= ord(s.lower()) <= ord('9'))):
            return True

    def isPalindrome(self, s: str) -> bool:

        left = 0
        right = len(s) - 1
		
        while left < right:
		
            while (not self.alphanumeric(s[left])) and left < right:
                left += 1
				
            while (not s[right].isalnum()) and left < right:
                right -= 1

            if s[left].lower() == s[right].lower():
                left += 1
                right -= 1
				
            elif left < right:
                return False

        return True   
        