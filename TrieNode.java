import java.util.HashMap;

class TrieNode {
    public HashMap<Character, TrieNode> node = new HashMap<>();
    public int size;
    public void putChildAbsent(char ch){
        node.putIfAbsent(ch,new TrieNode());
    }
    public TrieNode getChild(char ch){
        return node.get(ch);
    }
}