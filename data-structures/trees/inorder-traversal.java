void Inorder(Node root) {
  if (root.left != null) {
      Inorder(root.left);
  }

  // Process the node.
  System.out.print(root.data + " ");
    
  if (root.right != null) {
      Inorder(root.right);
  }
}