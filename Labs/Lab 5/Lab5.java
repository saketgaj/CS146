public boolean isValidBST(TreeNode root) {
        long minVal = Long.MIN_VALUE;
        if(root == null){
            return true;
        }
        if(!isValidBST(root.left)){
            return false;
        }
        if(minVal >= root.val){
            return false;
        }
        minVal = root.val;
        if(!isValidBST(root.right)){
            return false;
        }
        return true;
}
