class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int max_far=0;
        int max_sum=0;
        int c=0,min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            min=Math.max(min,arr[i]);
            if(arr[i]<0)
            {
                c++;
            }
        }
        if(c==arr.length)
        {
            return min;
        }
        for(int i=0;i<arr.length;i++)
        {
            max_far+=arr[i];
            if(max_far>=max_sum)
            {
                max_sum=max_far;
            }
            if(max_far<0)
            {
                max_far=0;
            }
        }
        return max_sum;
    }
}
