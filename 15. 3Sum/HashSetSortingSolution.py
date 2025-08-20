class HashSetSortingSolution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        #This below code is to handle the edge case of all numbers being 0 in the list. Instead of checking combinations for all of them we can simply return the result [[0,0,0]] as the answer will be the same.

        count0 = nums.count(0)
        if count0 == len(nums):
            return [[0,0,0]]

        #Code for the rest of the cases

        n = len(nums)

        #This is a generic 3sum problem where target can be any number, here it is 0
        target = 0
	
        #Using a set to store the combinations to take care of duplicate values
        resultSet = set()
        
        # Generating all pairs
        for i in range(n):

            #Creating a set for each iteration of i to keep a track of every j'th value that we have seen so far.
            visitedSet = set()

            for j in range(i + 1, n):

                #Calculating the complement that we need to look for in the set.
                complement = target - nums[i] - nums[j]
                
                #Check if this complement is already an element if we have seen before, if yes then we have found our triplet
                if complement in visitedSet:

                    #Converting each solution to a tuple as it is Hashable and when we try to insert the same solution again in the result set, it will not get inserted. We sort it so that e.g. results like -1,2,-1 and 2,-1,-1 are not considered as different results by the code but same instead.
                    curr = tuple(sorted([nums[i], nums[j], complement]))
                    resultSet.add(curr)
                
                #Add the j'th element to the set of elements we have seen so far in the i'th iteration.    
                visitedSet.add(nums[j])
        
        return list(resultSet)