public class SumOfParentNodeHavingAScpecificChildNode {

    Node root;
    int sum = 0;

    int allParentNodeSumWithSpecificChildNode(Node root, int data) {

        if(root == null) {
            return 0;
        }
//        int sum = 0;
        if((root.left != null && root.left.data == data) || (root.right != null && root.right.data == data)) {
            sum+= root.data;
        }
        allParentNodeSumWithSpecificChildNode(root.left, data);
        allParentNodeSumWithSpecificChildNode(root.right, data);

        return sum;
    }

    public static void main(String[] args) {
        SumOfParentNodeHavingAScpecificChildNode tree = new SumOfParentNodeHavingAScpecificChildNode();
        tree.root= new Node(4);
        tree.root.left= new Node(2);
        tree.root.right= new Node(5);
        tree.root.left.left= new Node(7);
        tree.root.left.right= new Node(2);
        tree.root.right.left= new Node(2);
        tree.root.right.right= new Node(3);

        int x = 2;

        System.out.println("Sum of Parent Node having a Specific Child Node:" + tree.allParentNodeSumWithSpecificChildNode(tree.root,  x));
    }


}
