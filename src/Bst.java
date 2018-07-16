

public class Bst {

	Node root;

	public void insertNode(String key) {
		Node newNode = new Node(key);
		if (root == null) {

			root = newNode;

		} else {
			Node focusNode = root;

			Node parent;

			while (true) {
				parent = focusNode;
				if (key.compareTo(focusNode.name)<0) {

					focusNode = focusNode.left;

					if (focusNode == null) {

						parent.left = newNode;
						return; 
					}

				} else { 

					focusNode = focusNode.right;

					if (focusNode == null) {

						parent.right = newNode;
						return; 

					}

				}

			}
		}

	}
	
	public Node findNode(String node_name) {

		Node focusNode = root;

		while (!focusNode.name.equals(node_name) ) {

			if (focusNode.name.compareTo(node_name)==1) {

				focusNode = focusNode.left;

			} else {

				focusNode = focusNode.right;

			}

			if (focusNode == null)
				return null;

		}

		return focusNode;

	}
	public void inOrderTraverse(Node focusNode) {

		if (focusNode != null) {

			inOrderTraverse(focusNode.left);

			System.out.println(focusNode);

			inOrderTraverse(focusNode.right);

		}

	}
	
	class Node 
	{
		String name;

		Node left;
		Node right;

		Node(String name) 
		{
			this.name = name;

		}

		public String toString() 
		{

			return name ;
			}

	}
	
	
   } 
	
	





	