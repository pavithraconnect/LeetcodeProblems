public class Tries1 {
    TrieNode root = new TrieNode();
    Tries1(){}
    Tries1(String[] words){
        for(String s : words){
            add(s);
        }
    }
    public void add(String word){
        TrieNode current = root;
        for(int i =0;i<word.length();i++){
            char ch = word.charAt(i);
            current.putChildAbsent(ch);
            current=current.getChild(ch);
            current.size++;
        }
    }
    public int find(String prefix){
        TrieNode current = root;
        for(int i=0;i<prefix.length();i++){
            char ch=prefix.charAt(i);
            current=current.getChild(ch);
            if(current==null){
                return 0;
            }
        }
        return current.size;
    }
}
