public boolean isValidBST(TreeNode root) {
        List<TreeNode> list = new LinkedList<>();
        traverse(root, list);
        
        boolean valid = true;
        TreeNode prev = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i).val <= prev.val){
                valid = false;
            }
            prev = list.get(i);
        }

        return valid;
}

private void traverse(TreeNode root, List<TreeNode> list) {
        if(root == null){
            return;
        }

        traverse(root.left, list);
        list.add(root);
        traverse(root.right, list);
}
