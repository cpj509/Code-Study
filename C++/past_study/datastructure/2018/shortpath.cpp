#include <iostream>
#include <cstdlib>

using namespace std;

#define MAX 7

int cost[][MAX] =
{
	{ 100, 2, 4, 5, 100, 100, 100 },
	{ 100, 100, 100, 2, 7, 100, 100 },
	{ 100, 100, 100, 1, 100, 4, 100 },
	{ 100, 2, 1, 100, 4, 3, 100 },
	{ 100, 7, 100, 4, 100, 1, 5 },
	{ 100, 100, 4, 3, 1, 100, 7 },
	{ 100, 100, 100, 100, 7, 5, 100 }
};

static void ShortestP(int input, int cost[][MAX], int distance[], int num, short found[]);
static void Printp(int * distance);

int main()
{
	int input = 0;
	int distance[MAX];
	short int found[MAX] = { 0 };
	cout << "1) Cost matrix" << endl;

	cout << "  ";
	for (int i = 0; i < MAX; i++)
	{
		cout << i << " ";
	}
	cout << endl;
	for (int i = 0; i < MAX; i++) 
	{
		cout << i << " ";
		for (int j = 0; j < MAX; j++) 
		{
			cout << cost[i][j] << " ";
		}
		cout << endl;
	}
	cout << endl;

	cout << "2) Shortest path distance" << endl;
	ShortestP(input, cost, distance, MAX, found);

	return 0;
}

void ShortestP(int input, int cost[][MAX], int distance[], int num, short found[])
{
	int minVal, minIndex;
	int i, j, k;

	for (i = 0; i<num; i++) {
		found[i] = 0;
		distance[i] = cost[input][i];
	}
	found[input] = 1;
	for (k = 0; k < num; k++) 
	{
		if (k != 6)
		{
			Printp(distance);
		}
		minVal = 999;
		for (i = 0; i<num; i++) 
		{
			if (found[i]) continue;
			if (distance[i] < minVal) 
			{
				minVal = distance[i];
				minIndex = i;
			}
		}
		found[minIndex] = 1;
		for (int i = 0; i<num; i++)
		{
			if (found[i]) continue;

			if (distance[i] > distance[minIndex] + cost[minIndex][i])
			{
				distance[i] = distance[minIndex] + cost[minIndex][i];
			}

		}
	}
}
void Printp(int * distance)
{
	int i;
	cout << "Dist : ";
	for (i = 0; i<MAX; i++)
	{
		if (i != 0)
		{
			cout << distance[i] << ' ';
		}
		else
		{
			cout << "0 ";
		}
	}
	cout << endl;
}
