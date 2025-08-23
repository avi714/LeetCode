import java.util.HashMap;
import java.util.Set;

class HashMapSolution 
{
    public boolean isAnagram(String s, String t) 
	{
        
        if(s.length() != t.length())
        {
            return false;
        }

        HashMap<Character, Integer> frequency = new HashMap<>();

        for (int i= 0; i< s.length() ; i++)
        {
            char key1 = s.charAt(i);

			//Get value for each key and if it does not exist then return 0
            int value1 = frequency.getOrDefault(key1, 0); 
            frequency.put(key1, value1 + 1); 

            char key2 = t.charAt(i);
			
            int value2 = frequency.getOrDefault(key2, 0); 
            frequency.put(key2, value2 - 1);
        }
	
		//Generating a set of keys of the HashMap to iterate over.
        Set<Character> keys1 = frequency.keySet();
		
        for (Character key: keys1)
        {
            if(frequency.get(key) !=0)
            {
                return false;
            }
        }

        return true;
    }
}