/*Print Matrix in snake Pattern
https://www.geeksforgeeks.org/problems/print-matrix-in-snake-pattern-1587115621/1
My Solution of GFG POTD is here:-Day07 completed of 75 Hard
 * 
 */
class Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here
          ArrayList<Integer> ans = new ArrayList<Integer>();
        int n = matrix.length;
        for(int i =0;i<n;i++){
            int index = n-1;
            for(int j = 0; j<n;j++){
               if(i%2==0) ans.add(matrix[i][j]);
                else{
                   ans.add(matrix[i][index]);
                   index--;
               }
            }
        }
        return ans;
    }
}