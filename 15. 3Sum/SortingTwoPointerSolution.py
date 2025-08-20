class SortingTwoPointerSolution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        nums.sort()
        length = len(nums)
        result = []

        for i in range(length):
        
            #Eliminating duplicate values for nums[i]
            if i!= 0 and nums[i] == nums[i-1]:
                continue
            
            left = i+1
            right = length-1

            while left<right:
            
                total = nums[left] + nums[right] + nums[i]
                
                if total > 0:
                    right -=1
                    
                elif total < 0:
                    left += 1
                    
                else:
                    result.append([nums[i],nums[left],nums[right]])
                    left += 1
                    
                    #Eliminating duplicate values for nums[left]
                    while nums[left] == nums[left-1] and left<right:
                        left += 1


        return result
