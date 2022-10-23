package bst;

public class BinarySearchTree {

	Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	//중위 순회 - inorder 오름차순 정렬
	public void display(Node n) {
		if(n != null) {//현재 전달받은 node가 null이 아닐때까지
		display(n.getLeft());
		System.out.print(n.getKey()+" - ");
		display(n.getRight());
		}
	}
	
	public boolean find(int key) {
		Node current = root;//root부터 조회 시작
		while(current != null) {
		System.out.println(current.getKey()+": " + key + " 비교중");
		if(current.getKey() == key) {
			return true;
		}
		else if(current.getKey()>key) {//왼쪽이동
			current = current.getLeft();
			
		}
		else if(current.getKey()<key) {//오른쪽이동
			current = current.getRight();
		}
		}
		return false;
	}
	
	public void insert(int key) {
		Node newNode = new Node(key);
		if(root==null) {//트리구성노드 없다면
			root = newNode;
			return;
		}
		Node current = root;//트리구성노드 있다면 root 시작
		Node parent = null;
		//새로운 노드 삽입위치 지정, 부모와 자식 재연결
		while(true) {
			parent = current;
			//현재 노드보다 작으면
			if(current.getKey()>key) {
				//왼쪽노드로 설정
				current = current.getLeft();
				if(current==null) {//왼쪽 노드 없다면
					parent.setLeft(newNode);//newNode가 왼쪽 노드 설정
					return;
				}
			}
			
			//현재 노드보다 크면
			else {
				//오른쪽 노드로 이동
				current = current.getRight();
				if(current==null) {//왼쪽 노드 없다면
					parent.setRight(newNode);//newNode가 왼쪽 노드 설정
					return;
				}
				
			}
			
			System.out.println(parent.getKey());
			System.out.println(parent.getLeft().getKey());
			System.out.println(parent.getRight().getKey());
		}
		
		
		
		
	}
	
	

}
