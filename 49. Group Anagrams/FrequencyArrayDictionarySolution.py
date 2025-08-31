class FrequencyArrayDictionarySolution(object):

    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        
        #Creating a frequency dictionary to store the frequency array strings
        frequencymap = dict()

        #Initializing the result array index
        i = 0

        result = []

        for str1 in strs:

            #Calculating the key value for the dictionary
            hash1 = hashvalue(str1)
            
            #If the key does not exist in the dictionary
            if hash1 not in frequencymap:

                #Add the key to the dictionary and set its value as the index of the result array where the subarray for this anagram will be stored
                frequencymap[hash1] = i

                #Increment the result array index with 1
                i += 1
	
                #Append an empty subarray to accommodate the anagrams of this key
                result.append([])
            
            #Get the index of the subarray for this key and append the original string corresponding to this key in the subarray
            result[frequencymap[hash1]].append(str1)

        return result

def hashvalue(string1):

    #Initialize a frequency array for all letters of the alphabet with value as 0
    frequencyArray = [0]*26
   
 
    #Iterate over each character of the string
    for character in string1:

        #Calculate its position in the frequency array 
        position = ord(character) - ord('a')

        #Increment the value at the index by one for
        frequencyArray[position] += 1
    
    #Return the frequency array as a string with a delimiter so that values don't overlap. E.g. for 'bdddddddddd' and 'bbbbbbbbbbc' the frequency string is '010100000000000000000000000' which is the same.
    return ",".join(map(str, frequencyArray))
    