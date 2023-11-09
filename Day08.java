class Solution
{
    int columnWithMaxZeros(int arr[][], int N)
    {
        // code here 
           int max = 0;
        int sum = 0;
        int in = -1;
        for(int i = 0 ; i < N ; i++)
        {
            max = 0;
            for(int j = 0 ; j < N ; j++)
            {
                if(arr[j][i]  == 0)
                {
                    max++;
                }
            }
                if(max > sum)
                {
                    sum = max;
                     in = i;
                }
               
                
            
             
            
        }
        return in;
    }
}