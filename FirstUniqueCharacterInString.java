class Solution {
    public int firstUniqChar(String s) {
        if(s==null || s.length()==0){
            return -1;
        }
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int count = map.get(s.charAt(i));
                map.put(s.charAt(i),count+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i =0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return s.indexOf(s.charAt(i));
            }
        }
        return -1;
    }
}