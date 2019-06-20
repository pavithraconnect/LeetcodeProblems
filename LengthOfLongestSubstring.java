class Solution {
    public int lengthOfLongestSubstring(String s) {
       List list = new ArrayList<>();
        int i=0,max=0;
        while(i<s.length()){
            if(!list.contains(s.charAt(i))){
                list.add(s.charAt(i));
                i++;
            }
            else{
            list.remove(0);
            }
            if(max<list.size())
            max=list.size();
        }
       
        return max;
    }
}