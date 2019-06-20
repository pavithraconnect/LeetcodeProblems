public class BinarySearchTree {
    NodeForTree root;
    //insert
    public NodeForTree insertRecursive(NodeForTree current,int data){
        if(current==null){
            return new NodeForTree(data);
        }
        if(data<=current.data){
            current.left = insertRecursive(current.left,data);
        }
        else if(data>current.data){
            current.right=insertRecursive(current.right,data);
        }
        else {
            return current;
        }
        return current;
    }
    public void insert(int data){
        root=insertRecursive(root,data);
    }
    //find
   public boolean containsRecursive(NodeForTree current, int data){
       if(current.data==data){
           return true;
       }
       else if(data<current.data){
           if(current.left==null)
               return false;
           return containsRecursive(current.left,data);
       }
       else{
           if(current.right==null)
               return false;
           else
               return containsRecursive(current.right,data);
       }
   }
   public void contains(int data){
       if(containsRecursive(root,data))
           System.out.println(data+" is present");
       else
           System.out.println(data+" is not present");
   }
    //print InOrder
    public void printInOrderRecursive(NodeForTree current){
        if(current.left!=null){
            printInOrderRecursive(current.left);
        }
        System.out.println(current.data);
        if(current.right!=null){
            printInOrderRecursive(current.right);
        }
    }
    public void printInOrder(){
        System.out.println("InOder");
        printInOrderRecursive(root);
    }
    //print preOrder
    public void printPreOrderRecursive(NodeForTree current){
        System.out.println(current.data);
        if(current.left!=null){
            printPreOrderRecursive(current.left);
        }
        if(current.right!=null){
            printPreOrderRecursive(current.right);
        }
    }
    public void printPreOrder(){
        System.out.println("PreOrder");
        printPreOrderRecursive(root);
    }
    //print postOrder
    public void printPostOrderRecursive(NodeForTree current){
        if(current.left!=null)
            printPostOrderRecursive(current.left);
        if(current.right!=null)
            printPostOrderRecursive(current.right);
        System.out.println(current.data);

    }
    public void printPostOrder(){
        System.out.println("PostOrder");
        printPostOrderRecursive(root);
    }
    //To find the second largest element in BST reverse inorder traversal
    public class count {
        int c = 0;
    }
    void secondLargestRecursion(NodeForTree node, count C)
    {
        if (node == null || C.c >= 2)
            return;
        secondLargestRecursion(node.right, C);
        C.c++;
        if (C.c == 2) {
            System.out.println("2nd largest element is "+
                    node.data);
            return;
        }

        secondLargestRecursion(node.left, C);
    }

    // Function to find 2nd largest element
    void secondLargest(NodeForTree node)
    {
        // object of class count
        count C = new count();
        secondLargestRecursion(node, C);
    }
    //To find the kth smallest element
    public class count1{
        int key;
    }
    public void kthSmallestRecursion(NodeForTree current,count1 c1, int key){
        if(current== null || c1.key>key)
            return;
        if(current.left!=null)
            kthSmallestRecursion(current.left,c1,key);
        c1.key++;
        if(c1.key==key){
            System.out.println(key+" smallest element is "+current.data);
            return;
        }
        kthSmallestRecursion(current.right,c1,key);
    }
    public void kthSmallestElement(NodeForTree current,int key){
        count1 c1=new count1();
        kthSmallestRecursion(current,c1,key);
    }
    public static void main(String args[]){
        BinarySearchTree bt=new BinarySearchTree();
        bt.insert(2);
        bt.insert(5);
        bt.insert(6);
        bt.insert(1114);
        bt.insert(0);
        bt.insert(7011);
        bt.insert(109);
        /*bt.contains(9);
        bt.contains(10);*/
        bt.printInOrder();
        /*bt.printPreOrder();
        bt.printPostOrder();*/
//To find the second largest element in BST reverse inorder traversal
        bt.secondLargest(bt.root);
        bt.kthSmallestElement(bt.root,5);
    }
}
