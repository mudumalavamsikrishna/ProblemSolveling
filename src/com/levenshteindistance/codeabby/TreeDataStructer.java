package com.levenshteindistance.codeabby;

public class TreeDataStructer {

	private static class Node {
		private int val;
		private Node lChild;
		private Node rChild;

		/*
		 * public Node(int val, Node lChild, Node rChild) { super(); this.val =
		 * val; this.lChild = lChild; this.rChild = rChild; }
		 */

		public Node(int val) {
			this.val = val;
			this.lChild = null;
			this.rChild = null;
		}

	}

	private Node root;

	public TreeDataStructer() {
		this.root = null;
	}

	public void preOrderTraversal(Node root) {

		if (root != null) {
			System.out.print(" " + root.val);
			preOrderTraversal(root.lChild);
			preOrderTraversal(root.rChild);
		}

	}

	public void inOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		inOrderTraversal(root.lChild);
		System.out.print(" " + root.val);
		inOrderTraversal(root.rChild);

	}

	public void postOrderTraversal(Node root) {
		if (root != null) {
			postOrderTraversal(root.lChild);
			postOrderTraversal(root.rChild);
			System.out.print(" " + root.val);
		}
	}

	public int sumOfTree(Node root) {
		if (root == null) {
			return 0;
		}
		return (root.val + sumOfTree(root.lChild) + sumOfTree(root.rChild));
	}

	public int heightOfTree(Node root) {
		if (root == null) {
			return 0;
		} else {
			int lHeight = heightOfTree(root.lChild);
			int rHeight = heightOfTree(root.rChild);
			if (lHeight > rHeight) {
				return lHeight + 1;
			} else {
				return rHeight + 1;
			}
		}
	}

	public void deleteNode(Node node) {

		root = null;
	}

	public void printGivenLevel(Node node, int level) {
		if (node == null) {
			return;
		}
		if (level == 1) {
			System.out.print(node.val + " ");
		} else if (level > 1) {
			printGivenLevel(node.lChild, level - 1);
			printGivenLevel(node.rChild, level - 1);
		}
	}

	public void printLevelOrder(Node node) {

		int h = heightOfTree(node);
		int i;
		for (i = 1; i <= h; i++) {
			printGivenLevel(node, i);
		}

		// printGivenLevel(node, h);
	}

	public static void main(String[] args) throws Exception {
		TreeDataStructer tree = new TreeDataStructer();
		tree.root = new Node(10);
		tree.root.lChild = new Node(8);
		tree.root.rChild = new Node(2);
		tree.root.lChild.lChild = new Node(3);
		tree.root.lChild.rChild = new Node(5);
		tree.root.rChild.lChild = new Node(2);
		System.out.println("Pre Order Traversal");
		tree.preOrderTraversal(tree.root);
		System.out.println();
		System.out.println("In Order Traversal");
		tree.inOrderTraversal(tree.root);
		System.out.println();
		System.out.println("Post Order Traversal");
		tree.postOrderTraversal(tree.root);
		System.out.println();
		System.out.println("Sum Of Tree ");
		System.out.println(tree.sumOfTree(tree.root));
		System.out.println();
		System.out.println("Height of the tree is ");
		System.out.println(tree.heightOfTree(tree.root));
		// System.out.println("Delete Tree");
		// tree.deleteNode(tree.root);
		// tree.preOrderTraversal(tree.root);
		tree.printLevelOrder(tree.root);

	}
}