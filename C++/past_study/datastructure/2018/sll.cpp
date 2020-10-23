#include <iostream>
#include <fstream>
#include <cstdlib>
#include <string>

using namespace std;

class Node {//list의 기능을 위한 node class 선언
private:
	string data;
	Node *next;
	friend class List;
};

class List {//list class 선언
private:
	Node *head;
public:
	List() { head = 0; }
	void insert(string info);//list에 값을 넣어줌
	bool isEmpty();//list 비어있는지 판단용
	void printA(char info);//'A'grade 출력용
	void printCS(char *info);//'CS'major 출력용
	void display();//list 출력용
	void sort();//오름차순 정렬용
	virtual ~List()//프로그램 종료 시 소멸자
	{
		Node *p;
		while (head != 0)
		{
			p = head;
			head = head->next;
			delete p;
		}
	}
};
void List::insert(string info)//list에 값을 넣어줌
{
	Node *temp = new Node;//node temp생성
	temp->data = info; //temp의 data에 입력된 값(info)를 넣어줌
	temp->next = 0; 
	if (isEmpty())//list가 비었는지 검사
	{
		head = temp;//비었으면 temp가 head
	}
	else 
	{
		Node *p = head;
		while (p->next != 0)//list의 끝까지 이동
			p = p->next;
		p->next = temp; //list의 끝 값이 temp
	}
}
void List::printA(char info)//'A'grade 출력용
{ 
	Node *p;
	p = head;
	while (p) 
	{
		if (p->data[9] == info)//'A'grade라면
		{
			cout << p->data << endl;//그 줄을 출력
		}
		p = p->next;
	}
}
void List::printCS(char *info)//'CS'major 출력용
{
	Node *p;
	p = head;
	while (p) 
	{
		if (p->data[6] == info[0] && p->data[7] == info[1])//major가 2글자라서 각 알파벳 비교용으로 구현
		{
			cout << p->data << endl;
		}
		p = p->next;
	}
}
bool List::isEmpty()//list 비어있는지 판단용
{
	if (head == 0) return true;
	else return false;
}
void List::display()//list 출력용
{ 
	if (isEmpty())//비어있다면
	{
		cout << "List empty" << endl;//해당 문장 출력
	}
	else//아니라면
	{
		Node *p;
		p = head;
		while (p)//list 전체 출력
		{
			cout << p->data;
			p = p->next;
			cout << endl;
		}
	}
}
void List::sort()//오름차순 정렬용
{
	Node *temp;
	int cnt = 0;
	int i = 0;
	int j = 0;
	temp = head;
	while (temp != NULL)//list의 갯수 체크용
	{
		cnt++;
		temp = temp->next;
	}
	Node **p = (Node**)malloc(sizeof(Node*) * cnt);
	temp = head;
	for (i = 0; i < cnt; i++)//p에 list의 값을 넣음
	{
		p[i] = temp;
		temp = temp->next;
	}
	for (i = 0; i < cnt; i++)
	{
		for (j = i + 1; j < cnt; j++)
		{
			if (p[j]->data < p[i]->data)//앞의 값이 크다면 순서 바꿈
			{
				temp = p[i];
				p[i] = p[j];
				p[j] = temp;
			}
		}
	}
	head = p[0];
	temp = head;
	for (i = 0; i < cnt - 1; i++)//순서가 바뀐 값을 list에 다시 넣음
	{
		temp->next = p[i + 1];
		temp = temp->next;
	}
	temp->next = 0;
	free(p);
}

int main() 
{
	ifstream instream1("data1.txt");//data1을 불러옴
	if (instream1.fail())//파일 유무 검사용
	{
		cerr << "data1.txt X" << endl;
		exit(1);//문제시 종료
	}
	ifstream instream2("data2.txt");//data2를 불러옴
	if (instream2.fail())//파일 유무 검사용
	{
		cerr << "data2.txt X" << endl;
		exit(1);//문제시 종료
	}
	List L;
	string info;
	char grade = 'A';//'A'grade 출력을 위한 값
	char major[] = "CS";//'CS'major 출력을 위한 값

	cout << "1) 학생 이름(Name)의 알파벳 오름차순으로 리스트를 만들어서 출력하라. " << endl;
	while (getline(instream1, info))
	{
		L.insert(info);//data1의 값을 list에 넣어줌
	}
	L.sort();//name을 알파벳 오름차순으로 정렬
	L.display();//list 출력
	cout << "2) 1)에서 만든 list에서 Grade 'A' 성적을 받은 사람만 출력하라." << endl;
	L.printA(grade);//'A'grade 출력
	cout << "3) 'data2' 파일과 'data1'을 합쳐서 하나의 리스트로 만들고, 그 중 CS 전공 학생들만 출력하라." << endl;
	while (getline(instream2, info))
	{
		L.insert(info);//data2의 값을 list에 넣어줌
	}
	L.sort();//name을 알파벳 오름차순으로 정렬
	L.printCS(major);//'CS'major 출력
	return 0;
}
