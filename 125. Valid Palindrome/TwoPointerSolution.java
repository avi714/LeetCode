class TwoPointerSolution 
{
    public boolean isPalindrome(String s) 
	{

		//Initializing the left and right pointers
        int l = 0;
        int r = s.length() - 1;

        while (l < r)
        {
           
			//There maybe multiple non-alphanumeric characters, as a result we need a loop to avoid them each time.
            while (l < r && !Character.isLetterOrDigit(s.charAt(l)))
            {
                l++;
            }
            
            while (l < r && !Character.isLetterOrDigit(s.charAt(r)))
            {
                r--;
            }
            
			//Converting the alphanumeric characters to lowercase and checking them.
            if (Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r)))
            {
                l++;
                r--;
            }

            else
            {
                return false;
            }
        }

        return true;
    }
}