package tree;

public class BinarySearchTree {

    private TreeNode root;

    public class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
        }
    }

    private void insert(int value){
        root = insert(root,value);
    }

    private TreeNode insert(TreeNode root,int value){
        if(root == null){
            root = new TreeNode(value);
            return root;
        }

        if(value < root.data){
            root.left = insert(root.left,value);
        }else{
            root.right = insert(root.right,value);
        }
        return root;
    }

    private void inOrder(){
        inOrder(root);
    }

    private void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    private boolean searchKey(TreeNode root, int value){
        if(root == null){
            return false;
        }
        if(value == root.data){
            return true;
        }
        if(value < root.data){
            return searchKey(root.left,value);
        }else{
            return searchKey(root.right,value);
        }
    }



    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(6);
        bst.insert(2);
        bst.insert(1);
        bst.insert(7);
        bst.insert(9);
        bst.inOrder();
        System.out.println(bst.searchKey(bst.root,3));
    }
}
