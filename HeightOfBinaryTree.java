class HeightOfBinaryTree{
  Node root;
  public int heightOfBT(Node node){
    if(node == null){
      return 0;
    }
    else{
      int lDepth = heightOfBT(node.left);
      int rDepth = heightOfBT(node.right);
      return Math.max(lDepth,rDepth)+1;
    }
  }
  public static void main(String[] args) {
  HeightOfBinaryTree tree = new HeightOfBinaryTree();
  tree.root = new Node(1); 
  tree.root.left = new Node(2); 
  tree.root.right = new Node(3); 
  tree.root.left.left = new Node(4); 
  tree.root.left.right = new Node(5); 
  tree.root.left.right = new Node(5); 
  System.out.println("Height of tree is : " +tree.heightOfBT(tree.root));  
  }
}