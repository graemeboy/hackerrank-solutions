// A breadth-first traversal algorithm.
void LevelOrder(Node root)
    {
      Node curNode;
      // Create a queue for holding children in order for processing.
      Queue<Node> children = new ArrayDeque<Node>();
      
      children.add(root);
      
      while (!children.isEmpty()) {
        curNode = children.poll();
        System.out.print(curNode.data + " ");
          
        if (curNode.left != null) {
            children.add(curNode.left);
        }
        
        if (curNode.right != null) {
            children.add(curNode.right);
        }
      }
      
    }