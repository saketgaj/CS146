public boolean isValidBST(TreeNode root) {
        List<TreeNode> list = new LinkedList<>();
        traverse(root, list);
        
        TreeNode prev = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i).val <= prev.val){
                return false;
            }
            prev = list.get(i);
        }

        return true;
}

private void traverse(TreeNode root, List<TreeNode> list) {
        if(root == null){
            return;
        }

        traverse(root.left, list);
        list.add(root);
        traverse(root.right, list);
}
