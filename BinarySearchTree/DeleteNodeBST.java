public class DeleteNodeBST {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root , int val){
        if(root==null){
            return new Node(val);
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static Node delete(Node root, int key){
        if(root.data < key){
            root.right = delete(root.right, key);
        }else if(root.data > key){
            root.left = delete(root.left, key);
        }else{
            //Case 1 : No child
            if(root.left == null && root.right == null){
                return null;
            }
            //Case 2 : One child
            if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            }
            //Case 3 : Two child
            Node IS  = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,7};
        Node root = null;
        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        delete(root, 5);
        inorder(root);
    }
}