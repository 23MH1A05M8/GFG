// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        Set<Character> set=new LinkedHashSet<>();
        for(char ch:s.toCharArray())
        {
            set.add(ch);
        }
        StringBuilder sb=new StringBuilder();
        for(Character c:set)
        {
            sb.append(c);
        }
        return sb.toString();
    }
}
