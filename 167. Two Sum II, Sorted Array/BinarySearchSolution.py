class BinarySearchSolution:

    #Binary Search function
    def binarySearch(self, left, right, nums, target):
        
        #Base condition in case the index is not found in this iteration
        if left > right:
            return -1

        mid = (left+right)//2

        if nums[mid] == target:
            return mid

        elif nums[mid] > target:
            return self.binarySearch(left, mid-1, nums, target)

        else:
            return self.binarySearch(mid+1, right, nums, target)


    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        
        length = len(numbers)
	
        #Iterating over the list using the index as we have to return indices here
        for i in range(len(numbers)):

            #Calculating the result of the target-nums[i] to find in the list
            remaining = target - numbers[i]

            #Using Binary search to get the index of the array
            j = self.binarySearch(i+1, length-1, numbers, remaining)

            #If index is not negative, return the indices+1 as this is a 1 based index array.
            if j != -1:
                return [i+1,j+1]
