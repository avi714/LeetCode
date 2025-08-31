import java.util.HashMap;
import java.util.List;

class SortingAndHashMapSolution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
	{

		//Creating a list of lists for the result
        List<List<String>> result = new ArrayList<>();
	
		//Creating a HashMap to store the sortedString as the key
        HashMap<String, Integer> anagrams = new HashMap<>();

		//Initializing the result array index as 0
        int i = 0;

        for (String string1 : strs)
        {
		
			//Converting each String to a char array
            char[] tempArray = string1.toCharArray();

			//Sorting the char array
            Arrays.sort(tempArray);

			//Converting the sorted char array back to string
            String sortedString = new String(tempArray);
            
			//If the sortedString is not present as a key in the HashMap
            if (!anagrams.containsKey(sortedString))
            {

				//Then put the sortedString as a key and the value should be the corresponding index of the subarray in the result array where the anagrams of the original string will be stored
                anagrams.put(sortedString,i);

				//Add a new ArrayList to the result array to accommodate for the anagram group of this new sortedString
                result.add(new ArrayList<>());
            }

			//First get the subarray index for this sortedString and then append the original string to this anagram group subarray.
            result.get(anagrams.get(sortedString)).add(string1);
        }

        return result;
    }
}