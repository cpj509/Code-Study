// Day 25: Running Time and Complexity

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int tcase = 0;
    cin >> tcase;

    while (tcase--)
    {
        int num = 0;
        int p = 0;
        cin >> num;
        if (num <= 1)
        {
            cout << "Not prime" << endl;
            continue;
        }
        for (int i = 2; i <= sqrt(num); i++)
        {
            if (num % i == 0)
            {
                p = 1;
                cout << "Not prime" << endl;
                break;
            }
        }
        if (p != 1)
        {
            cout << "Prime" << endl;
        }
    }
    return 0;
}
