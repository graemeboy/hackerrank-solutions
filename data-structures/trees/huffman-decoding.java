void decode(String S, Node root)
{
    Node curNode = root;
    String decoded = "";

    while (S.length() != 0) {
        if (S.charAt(0) == '0') {
          curNode = curNode.left;   
        } else {
          curNode = curNode.right;
        }
        
        // Check if not an internal node.
        if (curNode.data != '\0') {
            decoded += curNode.data;
            curNode = root;
        }

        S = S.substring(1);
    } // while

    System.out.print(decoded);
} // decode