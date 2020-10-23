#include <iostream>

using namespace std;

#define max 8//행렬의 크기 설정

int ADJM[max][max] = {//인접행렬
	{ 0,1,1,0,0,0,0,0 },//v0
	{ 1,0,0,1,1,0,0,0 },//v1
	{ 1,0,0,0,0,1,1,0 },//v2
	{ 0,1,0,0,0,0,0,1 },//v3
	{ 0,1,0,0,0,0,0,1 },//v4
	{ 0,0,1,0,0,0,0,1 },//v5
	{ 0,0,1,0,0,0,0,1 },//v6
	{ 0,0,0,1,1,1,1,0 }//v7
};
class Node {//node의 class
public:
	int vertex;
	Node *next;
	Node(int value) {
		vertex = value;
		next = 0;
	}
	friend class Graph;
};
class Graph {//graph의 class(queue기능이 들어가있음.)
private:
	Node *front;
	Node *rear;
public:
	Node *graph[max];
	bool visited[max];
	Graph() { front = 0; rear = 0; }//graph(queue)를 형성
	void enqueue(int);
	int dequeue();
	bool isEmpty();
	void BFS(int v);
};

void Graph::enqueue(int value){
	Node *temp = new Node(value);

	if (isEmpty())	{//비어있는지 검사
		front = temp;
		rear = temp;
	}
	else {//아니라면
		rear->next = temp;
		rear = temp;
	}
}

int Graph::dequeue() {
	Node *p;
	int num;

	if (isEmpty()) 	{//비어있는지 검사
		cout << "Queue is empty!";
		return 0;
	}
	num = front->vertex;
	p = front;
	if (front == rear) {
		front = 0;
		rear = 0;
	}
	else {
		front = front->next;
	}
	delete p;
	return num;
}

bool Graph::isEmpty() {
	if (front == 0) {//비어있다면
		return true;
	}
	else {//아니라면
		return false;
	}
}

int vertexlist(int num) {//
	if (num == 0) return 0;
	if (num == 1) return 1;
	if (num == 2) return 2;
	if (num == 3) return 3;
	if (num == 4) return 4;
	if (num == 5) return 5;
	if (num == 6) return 6;
	if (num == 7) return 7;
}

void Graph::BFS(int v) {
	Node *p;

	visited[v] = true;
	enqueue(v);
	cout << "v" <<vertexlist(v) << ' ';

	while (front) {
		v = dequeue();
		for (p = graph[v]; p; p = p->next) {
			if (!visited[p->vertex]) 
			{
				enqueue(p->vertex);
				visited[p->vertex] = true;
				cout << "v" << vertexlist(p->vertex) << ' ';
			}
		}
	}
}

void printAdjacentMatrix() {
	for (int i = 0; i < max; i++) {
		cout << "v" << vertexlist(i) << "  ";
		for (int j = 0; j < max; j++) {
			cout << ADJM[i][j] << "  ";
		}
		cout << endl;
	}
}

int main(){
	Graph *g = new Graph();
	Node *p = new Node(0);

	for (int i = 0; i < max; i++){
		int temp = 0;
		for (int j = 0; j < max; j++){
			if (ADJM[i][j] == 1){
				(g->graph + temp)[i] = new Node(j);
				if (temp != 0){
					(g->graph + temp - 1)[i]->next = (g->graph + temp)[i];
				}
				temp++;
			}
		}
	}

	for (int i = 0; i < max; i++){
		g->visited[i] = false;
	}
	
	cout << "***** Adjacent Matrix" << endl;
	cout << "    v0 v1 v2 v3 v4 v5 v6 v7" << endl;
	printAdjacentMatrix();//인접행렬 출력
	cout << endl;
	cout << "***** Breadth First Search (BFS)" << endl;
	g->BFS(0);//BFS수행(시작점은 0)
	cout << endl;

	return 0;
}