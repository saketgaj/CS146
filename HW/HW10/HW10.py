def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        list = []
        queue = collections.deque()
        queue.append(root)

        while queue:
            qLength = len(queue)
            subList = []

            for i in range(qLength):
                node = queue.popleft()
                if node:
                    subList.append(node.val)
                    queue.append(node.left)
                    queue.append(node.right)
            
            if subList:
                list.append(subList)
        
        return list
