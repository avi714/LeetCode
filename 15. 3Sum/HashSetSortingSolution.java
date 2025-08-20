import java.util.*;

class HashSetSortingSolution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        
        int arrayLength = nums.length;

		//Initializing the target value for this generic 3-sum problem.
        int target = 0;

		//Creating a result HashSet of Lists to avoid duplicate entries
        HashSet<List<Integer>> resultset = new HashSet<>();

		//Iterating through the array
        for (int i = 0; i < arrayLength; i++)
        {
	
			//Creating a HashSet to store the nums[j] values traversed so far
            HashSet<Integer> visitedSet = new HashSet<>();

            for (int j = i+1; j < arrayLength; j++)
            {
				//Calculating the complement and checking if it exists inside the set of elements that have been traversed from i+1 to the current jth-1 value
                int complement = target - nums[i] - nums[j];

				//If the value is previously seen then we have found our combination
                if(visitedSet.contains(complement))
                {
					//Creating a List of the result values
                    List<Integer> result = Arrays.asList(nums[i],nums[j],complement);

					//Sorting these values so that -1,2,-1 and 2,-1,-1 for example are considered as the same solution.
                    Collections.sort(result);

					//Adding this combination to our result set
                    resultset.add(result);
                }

				//Adding this current nums[j] value to our set as it is already visited.
                visitedSet.add(nums[j]);
            }
        }

		//Converting the result set to an ArrayList as it is the expected return type.
        return new ArrayList<>(resultset);
    }
}