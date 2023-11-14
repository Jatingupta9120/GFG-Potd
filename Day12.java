/*Link:-https://www.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1 */
class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
          s1 += s1;

        return s1.indexOf(s2) != -1;
    }
    
}