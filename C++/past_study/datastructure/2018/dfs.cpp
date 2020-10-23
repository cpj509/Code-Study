#include <iostream>

#define MAXVERT 255
#define SIZE 6

using namespace std;

class node {
	node *next;
	int key;
	int vertex;
	node(int num) { vertex = num; next = 0; }
	friend class Graph;
};

class Graph {
private:
	node *graph[MAXVERT];
	bool visited[MAXVERT];
public:
	void init();
	void insert(int val1, int val2);
	void display(int val);
	void DFS(int v);
};

int ADJM[SIZE][SIZE] = {
	{ 0, 1, 1, 0, 0, 0 },
	{ 1, 0, 1, 1, 0, 0 },
	{ 1, 1, 0, 0, 0, 1 },
	{ 0, 1, 0, 0, 1, 1 },
	{ 0, 0, 0, 1, 0, 1 },
	{ 0, 0, 1, 1, 1, 0 }
};
char str[6] = { '0', '1', '2', '3', '4', '5' };

void Graph::init() {
	for (int i = 0; i < MAXVERT; i++) {
		graph[i] = NULL;
		visited[i] = false;
	}
}
void Graph::insert(int val1, int val2) {
	node *w;
	for (int i = 0; i < val1; i++) {
		int cnt = 0;
		for (int j = 0; j < val2; j++) {
			if (ADJM[i][j] == 0)
				cnt++;
			else {
				w = new node(j);
				if (graph[i] == NULL) {
					graph[i] = w;
					node *p = graph[i];
					p->key = cnt;
				}
				else {
					node *p = graph[i];
					while (1) {
						if (p->next == NULL) {
							p->next = w;
							p->next->key = cnt;
							break;
						}
						else
							p = p->next;
					}
				}
				cnt++;
			}
		}
	}
}
void Graph::display(int val) {
	for (int i = 0; i < val; i++) {
		cout << "V" << str[i] << ": ";
		node *p = graph[i];
		cout << str[p->key];
		if (p->next != NULL)
			cout << "->";
		while (p->next != NULL) {
			p = p->next;
			cout << str[p->key];
			if (p->next != NULL)
				cout << "->";
		}
		cout << endl;
	}
}
void Graph::DFS(int v) {
	node *w;
	visited[v] = true;
	cout << "V" << str[v] << " ";
	for (w = graph[v]; w != NULL; w = w->next) {
		if (visited[w->key] == false) {
			DFS(w->key);
		}
	}
}

int main() {
	Graph G;

	G.init();
	G.insert(SIZE, SIZE);
	cout << "1) Graph Data" << endl;
	G.display(SIZE);
	cout << endl << "2) Depth First Search Output (Starting from v0)" << endl;
	G.DFS(0);
	cout << endl;

	return 0;
}
