// Number following a pattern

class Solution{
    static String printMinNumberForPattern(String S){
        // code here
        int n=S.length();
        int ct=1;
        char ans[]=new char[n+1];
        
        for(int i=0;i<=n;i++)
        {
            if(i==n||S.charAt(i)=='I')
            {
                for(int j=i-1;j>=-1;j--)
                {
                    ans[j+1]=(char)('0'+ct);
                    ct++;
                    if(j>=0&&S.charAt(j)=='I'){
                        break;
                    }
                }
            }
        }
        return new String(ans);
        
    }
}
