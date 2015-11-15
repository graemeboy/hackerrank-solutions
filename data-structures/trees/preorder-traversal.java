void Preorder(Node root) {
    // Process the node.
    System.out.print(root.data + " ");
        
    // Recurse in preorder.
    if (root.left != null) {
       Preorder(root.left);
    }

    if (root.right != null) {
       Preorder(root.right);
    }
}