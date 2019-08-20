package com.levenshteindistance.codeabby;

public class BinarySearchTree {

	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	Node root;

	public BinarySearchTree() {
		root = null;
	}

	void insert(int key) {
		root = insertRec(root, key);
	}

	private Node insertRec(Node root, int key) {

		if (root == null) {
			root = new Node(key);
			return root;
		}

		if (key < root.key) {
			root.left = insertRec(root.left, key);
		} else if (key > root.key) {
			root.right = insertRec(root.right, key);
		}
		return root;
	}

	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}

	void inorder() {
		inorderRec(root);
	}

	// A utility function to search a given key in BST
	public Node search(Node root, int key) {
		// Base Cases: root is null or key is present at root
		if (root == null || root.key == key)
			return root;

		// val is greater than root's key
		if (root.key > key)
			return search(root.left, key);

		// val is less than root's key
		return search(root.right, key);
	}

	// This method mainly calls deleteRec()
	void deleteKey(int key) {
		root = deleteRec(root, key);
	}

	/* A recursive function to insert a new key in BST */
	Node deleteRec(Node root, int key) {
		/* Base Case: If the tree is empty */
		if (root == null)
			return root;

		/* Otherwise, recur down the tree */
		if (key < root.key)
			root.left = deleteRec(root.left, key);
		else if (key > root.key)
			root.right = deleteRec(root.right, key);

		// if key is same as root's key, then This is the node
		// to be deleted
		else {
			// node with only one child or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			// node with two children: Get the inorder successor (smallest
			// in the right subtree)
			root.key = minValue(root.right);

			// Delete the inorder successor
			root.right = deleteRec(root.right, root.key);
		}

		return root;
	}

	int minValue(Node root) {
		int minv = root.key;
		while (root.left != null) {
			minv = root.left.key;
			root = root.left;
		}
		return minv;
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		// print inorder traversal of the BST
		tree.inorder();
	}
}
