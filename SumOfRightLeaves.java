public class SumOfRightLeaves {
    Node root;

    boolean isLeaf(Node root) {
        if(root == null) {
            return false;
        }

        if(root.left == null && root.right == null) {
//            System.out.println("root1 = " + root.data);
            return true;
        }
        return false;
    }

    int allRightLeavesSum(Node node) {

        if(node == null) {
            return 0;
        }
        int res = 0;
        if(isLeaf(node.right)) {
            res+= node.right.data;
        } else {
            res+= allRightLeavesSum(node.right);
        }
        res+= allRightLeavesSum(node.left);
        return res;
    }

    public static void main(String[] args) {
        SumOfRightLeaves tree = new SumOfRightLeaves();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(2);
        tree.root.right.left = new Node(2);
        tree.root.right.right = new Node(3);

        int x = 2;

        System.out.println("Sum of Right leaves:" + tree.allRightLeavesSum(tree.root));
    }
}
