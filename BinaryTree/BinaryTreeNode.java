package BinaryTree;

public class BinaryTreeNode<T> {
    public T data;
    public BinaryTreeNode<T> right;
    public BinaryTreeNode<T> left;

    BinaryTreeNode(T data) {
        this.data = data;
    }
}