class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=arr[0];
        int res=0;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max,arr[i]);
        }
        Arrays.sort(arr);
        for(int j=arr.length-1;j>=0;j--)
        {
            if(max>arr[j])
            {
                // res+=arr[j];
                return arr[j];
                // break;
            }
        }
        return -1;
    }
}