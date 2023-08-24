public class Main {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(60);
        root.left = new TreeNode<>(55);
        root.right = new TreeNode<>(100);
        root.left.left = new TreeNode<>(50);
        root.left.right = new TreeNode<>(57);
        root.right.left = new TreeNode<>(90);
        root.right.right = new TreeNode<>(110);
        System.out.println(root.search(51, root));
    }
}
