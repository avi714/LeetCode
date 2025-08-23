class ArraySolution 
{
    public boolean isAnagram(String s, String t) 
	{
        //Base condition to check for strings of unequal lengths
        if(s.length() != t.length())
        {
            return false;
        }

        int[] frequency = new int[26];

        for (int i= 0; i< s.length() ; i++)
        {
            //Subtracts 'a' from each character to get an index. E.g. 'a' - 'a' = 0, 'b' - 'a' = 1  
            frequency[s.charAt(i)-'a']++;
            frequency[t.charAt(i)-'a']--;
        }

        for(int count : frequency)
        {
            if (count != 0)
            {
                return false;
            }
        }

        return true;
    }
}