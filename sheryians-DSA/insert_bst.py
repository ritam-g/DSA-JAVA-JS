# -------------------------------
# BST Insertion with Diagram
# -------------------------------
#  Root: 10
#     L--- 5
#         L--- 3
#         R--- 7
#     R--- 15
#         L--- 12
#         R--- 18
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class BST:
    def insert(self, root, val):
        """
        Insert a value into BST recursively
        """
        if root is None:
            return TreeNode(val)

        if val < root.val:
            root.left = self.insert(root.left, val)
        else:
            root.right = self.insert(root.right, val)

        return root

    def print_tree(self, node, indent="", last='updown'):
        """
        Print ASCII diagram of the tree
        """
        if node != None:
            nb_spaces = 4
            up = '┌' + '─'*nb_spaces
            down = '└' + '─'*nb_spaces
            if last == 'up':
                start_shape = up
            elif last == 'down':
                start_shape = down
            else:
                start_shape = ""
            print(indent + start_shape + str(node.val))
            indent += " " * nb_spaces
            if node.left or node.right:
                if node.left: 
                    self.print_tree(node.left, indent, 'up')
                if node.right: 
                    self.print_tree(node.right, indent, 'down')

# -------------------------------
# Example Usage
# -------------------------------
if __name__ == "__main__":
    bst = BST()
    root = None

    # Insert values into BST
    values = [10, 5, 15, 3, 7, 12, 18]
    for v in values:
        root = bst.insert(root, v)

    # Print the BST diagram
    print("\nBinary Search Tree Diagram:\n")
    bst.print_tree(root)