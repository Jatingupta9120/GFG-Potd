/*Minimum distance between two numbers
Question Link:-https://www.geeksforgeeks.org/problems/minimum-distance-between-two-numbers/1
My Solution of GFG POTD is here:-Day01 completed of 75 Hard
*/
class Solution {
    int minDist(int a[], int n, int x, int y) {
        int ans=Integer.MAX_VALUE;
        int idx1=-1;
        int idx2=-1;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                idx1=i;
            }
            if(a[i]==y){
                idx2=i;
            }
            if(idx1!=-1&&idx2!=-1){
                ans=Math.min(ans,Math.abs(idx2-idx1));
            }
        }
        if(idx1==-1||idx2==-1){
            return -1;
        }
        return ans;
    }
}