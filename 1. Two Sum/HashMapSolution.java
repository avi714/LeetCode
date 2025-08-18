import java.util.HashMap;

class HashMapSolution 
{
    public int[] twoSum(int[] nums, int target) 
	{
        
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i <nums.length; i++)
        {
            int tempResult = target - nums[i];
            if (frequency.containsKey(nums[i]))
            {
                result[0] = frequency.get(nums[i]);
                result[1] = i;
                return result;
            }
            else
            {
                frequency.put(tempResult,i);
            }
        }
	
		//Just to avoid compile time error of return type being an array for the function. Although we are returning above the result array we still need to include a return statement for the function at the end.
        return new int[] {};
    }
}
