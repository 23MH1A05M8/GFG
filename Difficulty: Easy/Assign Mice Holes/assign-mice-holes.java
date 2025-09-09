class Solution {
    public int assignHole(int[] mices, int[] holes) {
        // code here
        int max=0;
        Arrays.sort(holes);
        Arrays.sort(mices);
        for(int i=0;i<mices.length;i++)
        {
            max=Math.max(Math.abs(mices[i]-holes[i]),max);
        }
        return max;
    }
};