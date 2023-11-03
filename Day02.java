/*Pythagorean Triplet
Question Link:-https://www.geeksforgeeks.org/problems/pythagorean-triplet3018/1
My Solution of GFG POTD is here:-Day02 completed of 75 Hard
*/
class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // code here
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++)
        set.add(arr[i]*arr[i]);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int c=arr[i]*arr[i]+arr[j]*arr[j];
                if(set.contains(c))return true;
            }
        }
        return false;
    }
}