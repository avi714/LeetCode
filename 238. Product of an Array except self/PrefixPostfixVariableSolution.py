class PrefixPostfixVariableSolution:

    def productExceptSelf(self, nums: List[int]) -> List[int]:

        #Initialize the prefix and postfix values to 1
        prefix = 1
        postfix = 1
        result = [0]*len(nums)

        #Loop through the nums array from start to end and store the value of prefix in result array then update the prefix with nums[i]* prefix
        for i in range(len(nums)):
            
            result[i] = prefix 
            prefix = nums[i] * prefix

        #Loop through the nums array from end to start and update result[i] with result[i]*postfix and update the postfix with postfix* nums[i]
        for i in range(len(nums)-1,-1,-1):
            
            result[i] = result[i] *postfix
            postfix = postfix*nums[i]          
        
        


        return result

