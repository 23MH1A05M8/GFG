class Solution {
    public int findUnique(int k, int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int res=0;
        for(Map.Entry<Integer,Integer> i:map.entrySet())
        {
            if(i.getValue()<k)
            {
               res=i.getKey();
            }
        }
        return res;
    }
}