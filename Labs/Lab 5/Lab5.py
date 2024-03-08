def isValidBST(self, root):
        def traverse(root, list):
            if root is None:
                return
        
            traverse(root.left, list);
            list.append(root)
            traverse(root.right, list)
       
        list = []
        traverse(root, list)
        prev = list[0]

        for i in range(1, len(list)):
           
           if list[i].val <= prev.val:
                return False
           prev = list[i] 
        
        return True
