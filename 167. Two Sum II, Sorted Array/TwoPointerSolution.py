class TwoPointerSolution:

    def twoSum(self, numbers: List[int], target: int) -> List[int]:
       
        length = len(numbers)

        #Initializing left and right pointers
        left = 0
        right = length - 1

        while left < right:

            #Check if the sum is equal to the target
            if numbers[left] + numbers[right] == target:
                return [left+1, right+1]

            #If the sum is greater than the target then shift the right pointer to left
            elif numbers[left] + numbers[right] > target:
                right -= 1

            #If the sum is less than the target then shift the left pointer to right
            else:
                left += 1