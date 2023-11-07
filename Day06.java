/*Sum of upper and lower triangles
Link:-https://www.geeksforgeeks.org/problems/sum-of-upper-and-lower-triangles-1587115621/1
My Solution of GFG POTD is here:-Day06 completed of 75 Hard
*/
class Solution
{
  
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
         ArrayList<Integer>ans=new ArrayList<Integer>();
        int s1=0;
        int s2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>=i){
                    s1+=matrix[i][j];
                    
                }
                if(j<=i){
                    s2+=matrix[i][j];
                }
            }
        }
        
       
        ans.add(s1);
        ans.add(s2);
        // s2.add(ans);
        return ans;
    }
}