class TwoPointerSolution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        
        int left = 0;
        int right = numbers.length - 1;

        while (left < right)
        {

            if (numbers[left] + numbers[right] == target)
            {
                return new int[] {left+1, right+1};
            }

            else if (numbers[left] + numbers[right] > target)
            {
                right-- ;
            }

            else
            {
                left++ ;
            }

        }
	
		//This will never get executed but we add it to avoid compilation error as the function has a return type of array.
        return new int[2];
    }
}