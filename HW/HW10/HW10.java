public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            List<Integer> subList = new LinkedList<>();
            int size = queue.size();

            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if(node != null){
                    subList.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
            
            if(!subList.isEmpty()){
                list.add(subList);
            }
        }

        return list;

}
