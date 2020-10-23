#include <iostream>

#define MAXVERT 255
#define SIZE 6

using namespace std;

class Graph {
private:
	bool visited[MAXVERT];
public:
	void init();
	void display();
	void primG(int val);//greedy
	void primR(int val);
};

int graphdata[SIZE][SIZE] = {
	{ 0, 5, 100, 12, 100, 100 },
	{ 5, 0, 6, 10, 24, 100 },
	{ 100, 6, 0, 17, 100, 30 },
	{ 12, 10, 17, 0, 20, 100 },
	{ 100, 24, 100, 20, 0, 13 },
	{ 100, 100, 30, 100, 13, 0 } 
}; 

char vertex[SIZE] = {'A', 'B', 'C', 'D', 'E', 'F'};

void Graph::init() {
	for (int i = 0; i < MAXVERT; i++) {
		visited[i] = false;
	}
}

void Graph::display() {
	cout << "	";
	for (int i = 0; i < SIZE; i++) 
		cout << vertex[i] << "	";
	cout << endl;
	for (int i = 0; i < SIZE; i++) {
		cout << vertex[i] << "	";
		for (int j = 0; j < SIZE; j++) {
			cout << graphdata[i][j] << "	";
		}
		cout << endl;
	}
}

void Graph::primG(int val) {
	cout << "MST: ";
	visited[val] = true;
	
	int start = val;
	int temp = 0;
	int temp2 = 0;
	int temp3 = 0;
	int weight = 0;
	
	while (temp2 < SIZE - 1) {
		int min = 100;
		temp = start;
		for (int i = 0; i < SIZE; i++) {
			if (min > graphdata[start][i] && visited[i] == false) {
				min = graphdata[start][i];
				temp3 = i;
				weight = weight + min;
			}
		}
		start = temp3;
		visited[start] = true;
		cout << "(" <<vertex[temp] << "," << vertex[start] << ")";
		if (temp2 != SIZE - 2)
			cout << " -> ";
		temp2++;
	}
	cout << endl;
	cout << "Weight: " << weight;
}

void Graph::primR(int val) {
	cout << "MST: ";
	visited[val] = true;
	
	int start = val;
	int temp = 0;
	int temp2 = 0;
	int temp3 = 0;
	int weight = 0;
	int cnt = 0;
	int cost = 0;
	
	for (int i = 0; i < SIZE-2; i++) {
		if (graphdata[1][i] != 0 && graphdata[1][i] != 100) {
			cnt = i;
			cost = graphdata[1][i];
		}
	}

	while (temp2 < SIZE - 1) {
		int min = 100;
		temp = start;
		for (int i = 0; i < SIZE; i++) {
			if (min > graphdata[start][i] && visited[i] == false) {
				if (i == cnt) {
					if (cost < graphdata[start][i]) {
						min = cost;
						temp3 = i;
						weight = weight + min;
						temp = 1;
					}
				}
				else {
					min = graphdata[start][i];
					temp3 = i;
					weight = weight + min;
				}
			}
		}
		start = temp3;
		visited[start] = true;
		cout << "(" <<vertex[temp] << "," << vertex[start] << ")";
		if (temp2 != SIZE - 2)
			cout << " -> ";
		temp2++;
	}
	cout << endl;
	cout << "Weight: " << weight;
}

int main() {
	Graph G;

	G.init();
	cout << "Weighted Graph" << endl;
	G.display();
	cout << endl;
	cout << "Minimal Spanning Tree (start at A, Greedy algorithm)" << endl;
	G.primG(0);
	cout << endl << endl;
	
	G.init();
    cout << "Revised Prim’s Algorithm (start at A)" << endl;
	G.primR(0);
	cout << endl;

	return 0;
}