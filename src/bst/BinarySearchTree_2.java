package bst;

public class BinarySearchTree_2 {
	Node root;
	BinarySearchTree_2(){
		this.root = null;
	}
	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
	public int height(Node n) {  // n를 루트로하는 (서브)트리의 높이
		if (n == null)   
			return 0;    // null이면 0 리턴
		else  
			return (1 + Math.max(height(n.getLeft()), height(n.getRight()))); 
	}
	
	//중위 우선 조회-오름차순
	public void display(Node n){
		if(n != null){
			display(n.getLeft());
			System.out.print(n.getKey() + " ");
			display(n.getRight());
		}
	}
	
	public boolean find(int id){
		Node current = root;
		int cnt = 0;
		while(current != null){
			cnt++;
			System.out.println(cnt);
			//System.out.println(id+":"+current);
			if(current.getKey() == id){
				return true;//id 있다
			}else if(current.getKey() > id){
				current = current.getLeft();
			}else {
				current = current.getRight();
			}
		}
		return false;//id 없다
	}
	//전체갯수 / 2 
	public void insert(int id){
		Node newNode = new Node(id);
		if(root == null){//트리구성노드 x
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true){
			parent = current;
			//현재노드보다 작으면
			if(current.getKey() > id){
				//왼쪽노드로 설정
				current = current.getLeft();
				if(current == null){//왼쪽자식 없다면
					parent.setLeft(newNode);
					return;
				}
			}
			else{
				current = current.getRight();
				if(current == null){
					parent.setRight(newNode);
					return;
				}
			}
			
		}
	}//insert end
	
	// 키 값이 key인 노드를 삭제
	public boolean remove(int key) {
		Node p = root;							// 스캔 중인  노드
		Node parent = null;						// 스캔 중인  노드의 부모 노드
		boolean isLeftChild = true;						// p는 parent의 왼쪽 자식 노드인가?

		while (true) {
			if (p == null) {								// 더 이상 진행하지 않으면
				return false;							// 그 키 값은 없습니다. 
			}
			if(key == p.getKey()) {						//같으면 검색 성공
				break;
			}
			else {
				parent = p;								// 가지로 내려가기 전에 부모를 설정
				if (key < p.getKey()) {					// key 쪽이 작으면
					isLeftChild = true;					// 왼쪽 자식으로 내려감
					p = p.left;							// 왼쪽 서브트리에서 검색
				} else {								// key 쪽이 크면
					isLeftChild = false;				// 오른쪽 자식으로 내려감
					p = p.right;						// 오른쪽 서브 트리에서 검색
				}
				
			}

		}//while end(삭데할 노드 찾기완료)
		

		//이제 해당 노드 삭제시 삭제 노드의 자식들을 삭제 노드의 부모로 연결
		if (p.left == null) {							// p에는 왼쪽 자식이 없음
			if (p == root)					 
				root = p.right;
			else if (isLeftChild)
				parent.left  = p.right;					// 부모의 왼쪽 포인터가 오른쪽 자식을 가리킴
			else
				parent.right = p.right;					// 부모의 오른쪽 포인터가 오른쪽 자식을 가리킴
		} else if (p.right == null) {					// p에는오른쪽 자식이 없음
			if (p == root)
				root = p.left;
			else if (isLeftChild)
				parent.left  = p.left;					// 부모의 왼쪽 포인터가 왼쪽 자식을 가리킴
			else
				parent.right = p.left;					// 부모의 오른쪽 포인터가 왼쪽 자식을 가리킴
		} else {     //자식 2개 모두 있음
			parent = p;
			Node left = p.left;					// 서브 트리 가운데 가장 큰 노드
			isLeftChild = true;
			while (left.right != null) {				// 가장 큰 노드 left를 검색
				parent = left;
				left = left.right;
				isLeftChild = false;
			}
			p.key  = left.key;							// left의 키 값을 p로 옮김
			if (isLeftChild)
				parent.left  = left.left;				// left를 삭제
			else
				parent.right = left.left;				// left를 삭제
		}
		return true;
	}

}

