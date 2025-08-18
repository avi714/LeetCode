class DictionarySolution:

    def twoSum(self, nums: List[int], target: int) -> List[int]:

        frequency = dict()
        
        for i in range(len(nums)):
        
            remainder = target - nums[i]
            
            if nums[i] in frequency:
                return [frequency[nums[i]],i]
                
            else:
                frequency[remainder] = i
