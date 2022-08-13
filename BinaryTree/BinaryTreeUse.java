package BinaryTree;

import java.util.Scanner;

public class BinaryTreeUse {

    public static void printTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);

    }

    public static BinaryTreeNode<Integer> takeTreeInput(boolean isRoot, int parentData, boolean isLeft) {
        if (isRoot) {
            System.out.println("Enter root data");
        } else {
            if (isLeft) {
                System.out.println("Enter left Child of " + parentData);
            } else {
                System.out.println("Enter right Child of " + parentData);
            }
        }

        Scanner sdata = new Scanner(System.in);
        int rootData = sdata.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInput(false, rootData, true);
        BinaryTreeNode<Integer> rightChild = takeTreeInput(false, rootData, false);
        root.left = leftChild;
        root.right = rightChild;
        return root;

    }

    public static void printTreeDetail(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " : ");
        if (root.left != null) {
            System.out.print("L" + root.left.data);
        }
        if (root.right != null) {
            System.out.print("R" + root.right.data);
        }
        System.out.println("");
        printTreeDetail(root.left);
        printTreeDetail(root.right);
    }

    public static int nodeCount(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftNodeCount = nodeCount(root.left);
        int rightNodeCount = nodeCount(root.right);
        return 1 + leftNodeCount + rightNodeCount;
    }

    public static void main(String[] args) {
        // BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
        // BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
        // BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);

        // root.left = rootLeft;
        // root.right = rootRight;

        // BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
        // BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);

        // rootLeft.right = twoRight;
        // rootRight.left = threeLeft;

        // printTree(root);
        BinaryTreeNode<Integer> root = takeTreeInput(true, 0, true);
        printTreeDetail(root);
        System.out.println("Total nodes are " + nodeCount(root));
    }
}
