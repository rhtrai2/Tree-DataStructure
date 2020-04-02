public class SumOfLeftLeaves {
    Node root;
//    int sum = 0;

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


    int allLeftLeavesSum(Node root) {
        int sum = 0;
//        System.out.println("initialSum = " + sum);
        if(root != null) {
            if(isLeaf(root.left)) {
//                System.out.println("root = " + root.data);
                sum+= root.left.data;

                //allLeftLeavesSum(root.left)
            } else {
               sum+= allLeftLeavesSum(root.left);
            }
            sum+=allLeftLeavesSum(root.right);
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfLeftLeaves tree = new SumOfLeftLeaves();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(2);
        tree.root.right.left = new Node(2);
        tree.root.right.right = new Node(3);

        int x = 2;

        System.out.println("Sum of left leaves:" + tree.allLeftLeavesSum(tree.root));
    }
}
