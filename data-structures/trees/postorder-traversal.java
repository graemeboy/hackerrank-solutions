void Postorder(Node root) {
    // Traverse the tree recursively.
    if (root.left != null) {
        Postorder(root.left);
    }
    
    if (root.right != null) {
        Postorder(root.right);
    }
    
    // Process the node.
    System.out.print(root.data + " ");
}