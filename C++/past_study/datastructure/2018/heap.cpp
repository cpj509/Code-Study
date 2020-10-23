#include <iostream>
#include <cstdlib>

#define maxsize 9
using namespace std;

class Heap {
public:
	int key;
	int* H;

	Heap() {
		key = 0;
		H = new int[maxsize];
	}
	int heapFull(int key) 
	{
		if (key == maxsize-1)
		{
			return 1;
		}
		else return 0;
	}
	int heapEmpty(int key)
	{
		if (key == 0)
		{
			return 1;
		}
		else return 0;
	}
	void insert_maxheap(int data) 
	{
		int i;
		if (heapFull(key))
			cout << "Heap is Full" << endl;
		else {
			i = ++key;
			while ((i != 1) && (data > H[i / 2])) 
			{
				H[i] = H[i / 2];
				i = i / 2;
			}
			H[i] = data;
		}
	}
	int delete_maxheap() 
	{
		int parent, child;
		int item, temp;
		item = H[1]; temp = H[key--];
		parent = 1;
		child = 2;
		while (child <= key) 
		{
			if (child < key && (H[child] < H[child + 1]))
			{
				child++;
			}
			if (temp >= H[child]) break;
			H[parent] = H[child];
			parent = child;
			child = child * 2;
		}
		H[parent] = temp;
		return item;
	}
  void leveltest()
  {
          int level = 1;
          int temp = 0;
          if(heapEmpty(key))
          {
                  cout << "Heap is empty" << endl;
          }
          else
          {
                  temp = key;
                  if(key==1)
                  {
                          cout << "Heap level " << level << endl;
                  }
                  else
                          while(temp > 1)
                          {
                                  temp = temp/2;
                                  level++;
                          }
                  cout << "Heap level " << level << endl;
          }
  }
	void Print()
	{
		if (heapEmpty(key))
		{
			cout << "Heap is empty" << endl;
		}
		else
		{
			for (int a = 1; a <= key; a++)
			{
				cout << H[a] << ' ';
			}
			cout << endl;
		}
	}
};

int main()
{
	Heap* ptr = new Heap();
	ptr->H[1] = 8;
	ptr->H[2] = 6;
	ptr->H[3] = 4;
	ptr->H[4] = 2;
	ptr->H[5] = 5;
	ptr->H[6] = 3;
	ptr->key = 6;

	int num = 0;
	int sel = 0;
	while (1)
	{
		cout << "1.insert 2.delete 3.empty 4.full 5.print 6.quit 7.leveltest" << endl;
		cin >> sel;
		switch (sel)
		{
		case 1:
			cin >> num;
			ptr->insert_maxheap(num);
			break;
		case 2:
			ptr->delete_maxheap();
			break;
		case 3:
			if (ptr->heapEmpty(ptr->key))
			{
				cout << "Heap is empty" << endl;
			}
			break;
		case 4:
			if (ptr->heapFull(ptr->key))
			{
				cout << "Heap is full" << endl;
			}
			break;
		case 5:
			ptr->Print();
			break;
		case 6:
			exit(1);
      break;
    case 7:
      ptr->leveltest();
      break;
		}
	}
}
