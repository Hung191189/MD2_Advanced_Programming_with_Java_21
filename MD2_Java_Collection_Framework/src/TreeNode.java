public class TreeNode<E> {
    protected E element;
    protected
    TreeNode<E> left;
    protected TreeNode<E> right;
    public TreeNode(E e) {
        element = e;
    }
    public Integer search(Integer element, TreeNode<Integer> tree) {
        TreeNode<Integer> current = tree;

        while (current != null) {
            if (element < current.element) {
                current = current.left;
            } else if (element > current.element) {
                current = current.right;
            } else
                return current.element;
        }
        return null;
    }
}


