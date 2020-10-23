#include <iostream>
#include <vector>

using namespace std;

int binarySearch(vector<int> data, int num, int left, int right);

int main()
{
    int msize;
    cin >> msize;

    vector<int> data(msize);
    for (int i = 0; i < msize; i++) {
        cin >> data[i];
    }

    int num, found;

    cin >> num;

    found = binarySearch(data, num, 0, msize - 1);

    if (found == -1)
        cout << "X" << endl;
    else
        cout << found + 1 << endl;
}

int binarySearch(vector<int> data, int num, int left, int right)
{
    int middle;
    while (left <= right)
    {
        middle = (right + left) / 2;
        if (num < data[middle])
        {
            right = middle - 1;
        }
        else if (num == data[middle])
        {
            return middle;
        }
        else
        {
            left = middle + 1;
        }
    }
    return -1;
}