/*Top K Frequent Elements in Array - 
Link:-https://www.geeksforgeeks.org/problems/top-k-frequent-elements-in-array/1
My Solution of GFG POTD is here:-Day04 completed of 75 Hard

 */


 class Solution {
    public int[] topK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
       for(int val: nums)
       map.put(val, map.getOrDefault(val, 0)+1);
       
       PriorityQueue<Integer> pQueue= new PriorityQueue<>((a,b)->{
        
          if(map.get(a)==map.get(b))
              return a-b;
          return map.get(a) - map.get(b);
          });
       for(int n: map.keySet())
       {
           pQueue.add(n);
           if(pQueue.size()>k)
           pQueue.poll();
       }
       int [] ans = new int[k];
       
   for(int i = k - 1; i >= 0;i--) {
            ans[i] = pQueue.poll();
        }
        return ans;
    }
}