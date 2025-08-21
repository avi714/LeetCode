import java.util.HashSet;

class HashSetSolution 
{
    public boolean containsDuplicate(int[] nums) 
	{
        
		//Create a HashSet to store each element
        HashSet<Integer> frequency = new HashSet<>();

		//Iterate through each element of the array
        for (int num : nums)
        {
			//Check if the element already exists in the HashSet, if it does then return true.
            if (frequency.contains(num))
            {
                return true;
            }
            else
            {
                frequency.add(num);
            }
        }
        return false;
    }
}
