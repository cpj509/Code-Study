#include <iostream>
#include <cstdlib>

using namespace std;

class Node {//tree의 node
private:
	int value;
	Node *left, *right;
	Node(int val) : value(val), left(NULL), right(NULL) {}
	friend class tree;
};

class tree {
private:
	Node *root;
public:
	tree() : root(NULL) { }
	void insert(int);
	void insertalgo(Node *&, int);
	void deleteTree(int);
	void deletealgo(Node *&, int);
	void drawTree();
	void drawBSTree(Node *, int);
	void search(int key);
	void searchalgo(Node *&, int key);
};

void tree::insertalgo(Node *&node, int val)
{
	if (node == NULL)
		node = new Node(val);//tree가 비어있으면 node 생성
	else if (val > node->value)
		insertalgo(node->right, val);//insert할 값이 node의 값보다 크면 right Child를 탐색
	else if (val < node->value)
		insertalgo(node->left, val);//insert할 값이 node의 값보다 작으면 left Child를 탐색
}

void tree::insert(int val)
{
	insertalgo(root, val);
}

void tree::deletealgo(Node *& node, int val)
{
	Node *removal = new Node(0);
	if (node == NULL) {
		cout << "Not Found" << endl;//값을 못찾았다면 출력
		return;//값을 못찾았다면 리턴, 함수종료
	}
	else if (val > node->value)
		deletealgo(node->right, val);//삭제할 값이 node의 값보다 크면 right Child를 탐색
	else if (val < node->value)
		deletealgo(node->left, val);//삭제할 값이 node의 값보다 작으면 left Child를 탐색
	else //찾았다면
	{
		if (node->left == NULL && node->right == NULL)//node의 Child가 X
		{
			delete node;
			node = NULL;
		}
		else if (node->left == NULL)//node의 Child가 right만 있으면
		{
			removal = node;
			node = node->right;
			delete removal;
		}
		else if (node->right == NULL)//node의 Child가 left만 있으면
		{
			removal = node;
			node = node->left;
			delete removal;
		}
		else//node의 Child가 두개
		{
			removal = node->right;
			while (removal->left != NULL)//node의 오른쪽 Subtree에서 최소값을 가진 node탐색.
				removal = removal->left;
			int minVal = removal->value;//min_node의 값 백업
			deletealgo(root, minVal);//min_node삭제
			node->value = minVal;//백업한 값을 실제로 삭제된 값을 가진 node에 덮어씀.
		}
	}
}

void tree::deleteTree(int val)
{
	deletealgo(root, val);
}

void tree::searchalgo(Node *& ptr, int key) {
	if (ptr == NULL)//찾는 값이 없다면
		cout << "NOT Found" << endl;
	else {
		if (key == ptr->value)
			cout << key << " found" << endl;//찾은 값 출력
		else if (key > ptr->value)//입력된 값 탐색
			searchalgo(ptr->right, key);
		else if (key < ptr->value)//입력된 값 탐색
			searchalgo(ptr->left, key);
	}
}

void tree::search(int key)
{
	searchalgo(root, key);
}

void tree::drawBSTree(Node *p, int level) {
	if (p != 0 && level <= 7) {
		drawBSTree(p->right, level + 1);
		for (int i = 1; i <= (level - 1); i++)
			cout << "   ";
		cout << "  " << p->value;
		if (p->left != 0 && p->right != 0)//left & right child 그려줌
			cout << "<" << endl;
		else if (p->right != 0)//right child 그려줌
			cout << "/" << endl;
		else if (p->left != 0)//left child 그려줌
			cout << "\\" << endl;
		else
			cout << endl;
		drawBSTree(p->left, level + 1);
	}
}

void tree::drawTree()
{
	drawBSTree(root, 1);
}

int main()
{
	tree T;
	int key = 0;//각 메뉴 호출용
	int num = 0;//값 입력 시 입력용

	while (1) {
		cout << "1. Insert, 2. Delete, 3.Search, 4.Print 5. Quit" << endl;
		cin >> key;//실행할 메뉴의 번호 입력.
		switch (key)
		{
		case 1:
		{
			cin >> num;
			T.insert(num);//insert실행
			break;
		}
		case 2:
		{
			cin >> num;
			T.deleteTree(num);//deleteTree실행
			break;
		}
		case 3 :
		{
			cin >> num;
			T.search(num);//search실행
			break;
		}
		case 4:
		{
			T.drawTree();//drawTree실행
			break;
		}
		case 5:
		{
			exit(1);//프로그램 종료
			break;
		}
		default:
		{
			cout << "input number 1~5" << endl;//메뉴의 범위를 벗어나는 숫자 입력 시 출력.
			break;
		}
		}
	}
}
