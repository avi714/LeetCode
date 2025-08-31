import java.util.HashMap;
import java.util.List;

class FrequencyArrayHashMapSolution 
{

    public List<List<String>> groupAnagrams(String[] strs) 
	{

        List<List<String>> result = new ArrayList<>();
		
        HashMap<String, Integer> anagrams = new HashMap<>();
		
        int i = 0;

        for (String string1 : strs)
        {
            String frequencyHash = getHash(string1);
            
            if (!anagrams.containsKey(frequencyHash))
            {
                anagrams.put(frequencyHash,i);
                i++;
                result.add(new ArrayList<>());
            }
			
			//Retrieving the nested list in the result list at the index returned from the HashMap and appending the original string to it.
            result.get(anagrams.get(frequencyHash)).add(string1);
        }

        return result;
    }

    public String getHash(String str1)
    {
        int[] frequency = new int[26];
		
		//Initializing all values to 0 in frequency array
        Arrays.fill(frequency,0);

        for(char c : str1.toCharArray())
        {
            int position = c - 'a';
            frequency[position] ++;
        }

        StringBuilder sb = new StringBuilder("");
		
        for (int i : frequency)
        {
            sb.append("#");
            sb.append(i);
        }

        return sb.toString();
    }
}