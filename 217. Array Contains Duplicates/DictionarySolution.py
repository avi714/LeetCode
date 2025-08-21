class DictionarySolution:

    def containsDuplicate(self, nums: List[int]) -> bool:
	
        #Create a dictionary to store each element of the List
        frequency = defaultdict(int)

        for num in nums:
		
            #If the element already exists in the dictionary then return True
            if num in frequency:
                return True
		
            #Else add it to the dictionary and set its value as one
            else:
                frequency[num] = 1
        
        return False