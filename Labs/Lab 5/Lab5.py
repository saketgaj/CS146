def isValidBST(self, root):
        minVal = float('-inf')
        if root is None:
            return True
        if not self.isValidBST(root.left):
            return False
        if minVal >= root.val:
            return False
        minVal = root.val
        if not self.isValidBST(root.right):
            return False
        return True
