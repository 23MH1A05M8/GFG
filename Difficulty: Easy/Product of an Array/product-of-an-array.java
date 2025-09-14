/*
     arr[] is the array
*/
class Solution {
    public static long product(long arr[]) {
        // your code here
        int mod=1000000007;
        long m=1;
        for(int i=0;i<arr.length;i++)
        {
            m=(m * (arr[i] % mod)) % mod;
        }
        // if(m>1000000007)
        // {
        //   m%1000000007
        // }
        return  m;
    }
}