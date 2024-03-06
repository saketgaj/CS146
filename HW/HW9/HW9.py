def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        curr = root
        pVal = p.val
        qVal = q.val

        while True:
            if pVal < curr.val and qVal < curr.val:
                curr = curr.left
            elif pVal > curr.val and qVal > curr.val:
                curr = curr.right
            else:
                return curr
