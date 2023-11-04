/*Find Transition Point
Question Link:-https://www.geeksforgeeks.org/problems/-1587115620/1
My Solution of GFG POTD is here:-Day03 completed of 75 Hard
*/
class Solution {
    int transitionPoint(int arr[], int n) {
        // code here
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==0){
                lo=mid+1;
                }
            else if(arr[mid]==1){
                if(mid==0||(mid>0&&arr[mid-1]==0)){
                    return mid;
                }else{
                    hi=mid-1;
                }
            }    
        }return -1;
    }
}