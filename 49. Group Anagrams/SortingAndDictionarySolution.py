class SortingAndDictionarySolution:

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        #Make a dictionary with the sorted string as the key and the value as the index of the result array where corresponding array of anagrams for that string will be stored. It will start with 0.
        anagram = {}

        #Initialize a result array to store the result
        result = []

        #Initialize a result index which will be the value of the first sorted string in the dictionary and will be incremented after that
        resultIndex = 0

        for string in strs:

            #The sorted method take the string as the input, sorts it alphabetically and then returns a List. The list is then joined to make a string again.
            sortedString = "".join(sorted(string))

            #Check if the sorted string exists in the anagram dictionary already.
            if sortedString not in anagram:

                #If the key does not exist then add it and set its value as the corresponding index in the result array group where its respective original string will be appended
                anagram[sortedString] = resultIndex

                #Increment the index with one since this is a unique sorted string
                resultIndex += 1

                #Append the result array with a new sub array to accommodate the anagrams of this sorted string
                result.append([])

            #Append the corresponding original string for this sorted string at the index where the anagrams of the sorted string needs to be stored. To get this index we set the value of the sorted string key inside the dictionary with the resultIndex field when the key was created for the first time for each unique sorted string.
            result[anagram[sortedString]].append(string)

        return result     