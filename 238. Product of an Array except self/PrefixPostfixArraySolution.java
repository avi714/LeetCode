class PrefixPostfixArraySolution 
{
    public int[] productExceptSelf(int[] nums) 
	{
        
        int len1 = nums.length;
        int[] prefix = new int[len1];
        int[] postfix = new int[len1];
        int[] result = new int[len1];

        for (int i = 0; i < len1; i++)
        {
            if (i == 0)
            {
                prefix[i] = 1;
            }
            else
            {
                prefix[i] = prefix[i-1]*nums[i-1];
            }
        }

        for (int i = len1-1; i > -1; i--)
        {
            if (i == len1-1)
            {
                postfix[i] = 1;
            }
            else
            {
                postfix[i] = postfix[i+1]*nums[i+1];
            }
        }

        for (int i = 0 ; i < len1 ; i ++)
        {
            result[i] = prefix[i]*postfix[i];
        }

        return result;
    }
}