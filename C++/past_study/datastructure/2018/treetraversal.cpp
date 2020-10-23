#include <iostream>
#include <string>

using namespace std;

class Node {
public:
	char data;
	int prio;
	Node* right;
	Node* left;
	Node(char data)
	{
		this->data = data;
		right = 0;
		left = 0;
    prio = 4;
	}
};

class Tree {
public:
	Node* root;
	Tree()
	{
		root = 0;
	}

	void Operand(Node* temp) 
	{
		if (root)
		{
			Node* p = root;
			while (p->right != NULL)
      {
				p = p->right;
      }
			p->right = temp;
		}
		else
		{
			root = temp;
		}
	}

	void Operator(Node* temp) 
	{
		if (root->prio >= temp->prio)
		{
			temp->left = root;
			root = temp;
		}
		else
		{
			temp->left = root->right;
			root->right = temp;
		}
	}

	int Eval(Node* temp)
	{
		int right, left;
		int result = 0;
		if (temp != NULL) 
		{
			if (temp->data - '0' < 10 && temp->data - '0' >= 0)
      {
				result = temp->data - '0';
      }
			else
      {
				left = Eval(temp->left);
				right = Eval(temp->right);
				switch (temp->data) 
				{
				case '+': 
					result = left + right; 
					break;
				case '-': 
					result = left - right; 
					break;
				case '*': 
					result = left * right; 
					break;
				case '/': 
					result = left / right; 
					break;
				}
			}
		}
		else
		{
			result = 0;
		}
		return result;
	}

	void inorder(Node* ptr) 
	{
		if (ptr) 
		{
			inorder(ptr->left);
			cout << ptr->data;
			inorder(ptr->right);
		}
	}

	void postorder(Node* ptr) 
	{
		if (ptr) 
		{
			postorder(ptr->left);
			postorder(ptr->right);
			cout << ptr->data;
		}
	}

	void preorder(Node* ptr)
	{
		if (ptr) 
		{
			cout << ptr->data;
			preorder(ptr->left);
			preorder(ptr->right);
		}
	}
};

int main() 
{
	string str1;

  cout << "input : ";
	cin >> str1;

  Node* temp;
  Tree* tree = new Tree();
	char prec[4][2] = {'*',2,'/',2,'+',1,'-',1};
  int i = 0;
  int j = 0;

	for (i = 0; str1[i] != '\0'; i++) 
	{
		temp = new Node(str1[i]);
		for (j = 0; j <= 3; j++) 
		{
			if (temp->data == prec[j][0]) 
			{
				temp->prio = prec[j][1];
				break;
			}
		}
		if (j == 4)
		{
			tree->Operand(temp);
		}
		else
		{
			tree->Operator(temp);
		}
	}

  cout << "Tree Traversal Output:" << endl;
	cout << "Inorder: ";
	tree->inorder(tree->root);
  cout << endl;
	cout << "Postorder: ";
	tree->postorder(tree->root);
  cout << endl;
	cout << "Preorder: ";
	tree->preorder(tree->root);
	cout << endl;
	cout << "Eval Tree: " << tree->Eval(tree->root) << endl;
  return 0;
}
