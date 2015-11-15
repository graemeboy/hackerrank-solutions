void top_view(Node root)
{
  ArrayList<Integer> leftStack = new ArrayList<>();
  Node leftNode = root.left;
  Node rightNode = root.right;
    
  while (leftNode != null) {
    leftStack.add(leftNode.data);
    leftNode = leftNode.left;
  } // if
  
  for (int i = leftStack.size() - 1; i >= 0; i--) {
    int data = leftStack.get(i);
    System.out.print(data + " ");
  }
        
  System.out.print(root.data + " ");
  
  while (rightNode != null) {
    System.out.print(rightNode.data + " ");
    rightNode = rightNode.right;
  } // if    
}