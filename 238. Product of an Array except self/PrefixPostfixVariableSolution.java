class PrefixPostfixVariableSolution 
{

    public int[] productExceptSelf(int[] nums) 
	{
        
        int len1 = nums.length;
		
        int prefix = 1;
        int postfix = 1;
		
        int[] result = new int[len1];

        for (int i = 0; i < len1; i++)
        {
            
            result[i] = prefix;
            prefix = prefix*nums[i];
        }

        for (int i = len1-1; i > -1; i--)
        {
            result[i] *= postfix;
            postfix = postfix*nums[i];
            
        }

        return result;
    }
}