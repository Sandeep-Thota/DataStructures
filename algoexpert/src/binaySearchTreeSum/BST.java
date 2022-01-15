package binaySearchTreeSum;

	public class BST extends Node {

		public BST(int value) {  
			super(value);
		}

		public BST insert(int value) {
			Node current = null;
			if (value < this.value) {
				if (this.left == null) {
					Node newBST = new Node(value);
					this.left = newBST;
					return this;
				} else {
					current = this.left;
				}
			} else {
				if (right == null) {
					Node newBST = new Node(value);
					this.right = newBST;
					return this;
				} else {
					current = this.right;
				}
			}
			while (true) {
				if (value < current.value) {
					if (current.left == null) {
						Node newBST = new Node(value);
						current.left = newBST;
						return this;
					} else {
						current = current.left;
					}
				} else {
					if (current.right == null) {
						Node newBST = new Node(value);
						current.right = newBST;
						return this;
					} else {
						current = current.right;
					}
				}
			}
		}
	}

