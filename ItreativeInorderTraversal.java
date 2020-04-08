import java.util.Stack;

public class ItreativeInorderTraversal {

    Node root;

    void  iterativeInorder(Node node) {
        if(node == null)
            return;

        Node current = node;
        Stack<Node> s = new Stack<Node>();
//        s.push(current);
        while(s.size() > 0 || current != null) {
            while(current != null) {
                s.push(current);
                current = current.left;
            }

            current = s.pop();
            System.out.print(" "+ current.data);

            current = current.right;
        }
    }



    public static void main(String[] args) {
        ItreativeInorderTraversal tree = new ItreativeInorderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
//        tree.root.right.left = new Node(2);
        tree.root.right.right = new Node(6);

        int x = 2;

        System.out.println("ITERATIVE INORDER:" );
        tree.iterativeInorder(tree.root);
    }

}
