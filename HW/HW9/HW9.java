public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      TreeNode curr = root;
      int pVal = p.val;
      int qVal = q.val;
      while(true){
          if(pVal < curr.val && qVal < curr.val){
              curr = curr.left;
          } else if(pVal > curr.val &&  qVal > curr.val){
              curr = curr.right;
          } else {
              return curr;
          }
      }
}
