package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

    private TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;  // root ---> first
        first.left = second;
        first.right = third; //  second <--- first ---> third
        second.left = fourth;
        second.right = fifth;
    }

    /*
    * Pre Order traversal is done in three steps as follows:-
    * 1. Traverse the rootNode.
    * 2. Traverse the Left subtree in Pre Order fashion.
    * 3. Traverse the Right subtree in Pre Order fashion.
    * */
    private void preOrderTraversalUsingRecursion(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraversalUsingRecursion(root.left);
        preOrderTraversalUsingRecursion(root.right);
    }


    private void preOrderTraversalUsingIteration(TreeNode root){
        if(root == null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }
    }

    /*
    * In Order Traversal done in three steps as follows:-
    * 1. Traverse the Left subtree in order fashion.
    * 2. Traverse the root Node.
    * 3. Travers the right subtree in order fashion.
    * */

    private void inOrderTraversalUsingRecursion(TreeNode root){
        if(root == null){
            return;
        }
        inOrderTraversalUsingRecursion(root.left);
        System.out.print(root.data + " ");
        inOrderTraversalUsingRecursion(root.right);
    }

    private void inOrderTraversalUsingIteration(TreeNode root){
        if(root == null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty() || temp != null){
            if(temp !=null){
                stack.push(temp);
                temp = temp.left;
            }else{
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }

        }
    }

    /*
    * Post Order Traversal done in three steps as follows:-
    * 1. Traverse the left subtree in Post Order fashion.
    * 2. Traverse the right subtree in Post Order fashion.
    * 3. Traverse the root Node.
    * */
    private void postOrderTraversalUsingRecursion(TreeNode root){
        if(root == null){
            return;
        }
        postOrderTraversalUsingRecursion(root.left);
        postOrderTraversalUsingRecursion(root.right);
        System.out.print(root.data + " ");
    }

    /*
    * Level Order Traversal is the Traversal where we print the exact element
    * */
    private void levelOrderTraversalUsingIteration(TreeNode root){
        if(root == null){
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if(temp.left != null){
                queue.offer(temp.left);
            }
            if(temp.right != null){
                queue.offer(temp.right);
            }
        }
    }


    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree();
        System.out.println("Pre Order Traversal");
        binaryTree.preOrderTraversalUsingRecursion(binaryTree.root);
        System.out.println();
        binaryTree.preOrderTraversalUsingIteration(binaryTree.root);
        System.out.println();
        System.out.println("In Order Traversal");
        binaryTree.inOrderTraversalUsingRecursion(binaryTree.root);
        System.out.println();
        binaryTree.inOrderTraversalUsingIteration(binaryTree.root);
        System.out.println();
        System.out.println("Post Order Traversal");
        binaryTree.postOrderTraversalUsingRecursion(binaryTree.root);
        System.out.println();
        System.out.println("Level Order Traversal");
        binaryTree.levelOrderTraversalUsingIteration(binaryTree.root);
    }
}
