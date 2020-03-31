public class SumOfAllNodes {

    Node root;

    int allNodeSum(Node root) {
        if(root == null) {
            return 0;
        }
        return root.data + allNodeSum(root.left) + allNodeSum(root.right);
    }

    public static void main(String[] args) {
        SumOfAllNodes tree = new SumOfAllNodes();
        tree.root= new Node(1);
        tree.root.left= new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.left.right= new Node(5);

        System.out.println("Sum of all Nodes of Binary tree:" + tree.allNodeSum(tree.root));

    }

}
