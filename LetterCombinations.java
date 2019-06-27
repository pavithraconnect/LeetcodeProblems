class Solution {
    Map<Character,String> map = new HashMap<Character,String>(){{
            put('0',"");
            put('1',"");
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length()==0 || digits == null)
            return result;
        recursiveFunction(result,0,digits,new StringBuffer());
        return result;

    }
    public void recursiveFunction(List<String> result, int index, String digits, StringBuffer sb){
        if(index == digits.length()){
            result.add(sb.toString());
            return;
        }
        else{
            char digit = digits.charAt(index);
            String letters = map.get(digit);
            for(int i=0;i<letters.length();i++){
                String letter = letters.substring(i,i+1);
                sb.append(letter);
                recursiveFunction(result,index+1,digits,sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }  
    }
}
