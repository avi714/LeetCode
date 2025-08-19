class BinarySearchSolution 
{

    public int binarySearch(int[] nums, int target, int left, int right)
    {
        int mid = (left+right)/2;

		//Base condition
        if(left > right)
        {
            return -10000;
        }

        if(nums[mid] == target)
        {
            return mid;
        }

        else if(nums[mid] > target)
        {
            return binarySearch(nums,target,left, mid-1);
        }

        else
        {
            return binarySearch(nums,target,mid+1, right);
        }
    }

    public int[] twoSum(int[] numbers, int target) 
    {
        
        for (int i = 0; i < numbers.length ;  i++)
        {
            int remaining = target - numbers[i];

            int index = binarySearch(numbers,remaining,i+1, numbers.length -1);

            if (index != -10000)
            {
                return new int[] {i+1,index+1};
            }
            
        }
		//To avoid compilation error
        return new int[2];
    }
}