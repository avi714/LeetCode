class PrefixPostfixArraySolution:

    def productExceptSelf(self, nums: List[int]) -> List[int]:

        #Initialize a Prefix and Postfix Array
        prefix = [0]*len(nums)
        postfix = [0]*len(nums)

        #Loop through the nums array from start to end and store the prefix multiplication of each place. For 0th position the prefix will be 1.
        for i in range(len(nums)):
            if i == 0:
                prefix[i] = 1
            
            else:
                prefix[i] = prefix[i-1] * nums[i-1]

        #Loop through the nums array from end to start and store the postfix multiplication of each place. For last position the prefix will be 1.
        for i in range(len(nums)-1,-1,-1):
            if i == len(nums)-1:
                postfix[i] = 1
            
            else:
                postfix[i] = postfix[i+1] * nums[i+1]
                       
        result = [0]*len(nums)
        
        #Loop through the postfix and prefix array simultaneously and multiple the postfix and prefix multiplication of each position to get the value of product of the array except the product of that element.
        for i in range(len(nums)):
            result[i] = prefix[i]*postfix[i]

        return result

