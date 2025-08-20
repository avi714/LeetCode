import java.util.*;

class SortingTwoPointerSolution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        
        int arrayLength = nums.length;

		//Sorting the Array so that we can use two pointers
        Arrays.sort(nums);
        
		//Creating a result arraylist of lists
        ArrayList<List<Integer>> resultArray = new ArrayList<>();

        for (int i = 0; i < arrayLength && nums[i] <=0 ; i++)
        {
			//If the i'th element is getting repeated then skip it.
            if ((i!=0)&&(nums[i] == nums[i-1]))
            {
                continue;
            }

			//Initialize the left and right pointers
            int left = i+1;
            int right = arrayLength - 1;

            while(left < right)
            {
                int result = nums[left] + nums[right] + nums[i];
                if(result == 0)
                {

					//Converting the solution elements to a list and adding it to the result list
                    List<Integer> tempResult = Arrays.asList(nums[left], nums[right],nums[i]);
                    resultArray.add(tempResult);

					//Incrementing the left pointer as we have found a solution for this combination of i, left and right and don't want a repetition.
                    ++left ;

					//If the left pointer elements are repeated then skip them as there will be repetition.
                    while((nums[left] == nums[left-1] )&&(left < right))
                    {
                        ++left;
                    }
                }
                else if(result>0)
                {
                    --right ;
                }
                else
                {
                    ++left;
                }
                
            }
        }
        return resultArray;
    }
}