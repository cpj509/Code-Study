// Day 6: Let's Review

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int t = 0;
    vector<char> even;
    vector<char> odd;
    string str;
    cin >> t;
    while (t--)
    {
        cin >> str;
        for (int i = 0; i < str.size(); i++)
        {
            if ((i & 1) == 0)
            {
                even.push_back(str[i]);
            }
            else
            {
                odd.push_back(str[i]);
            }
        }
        for (int i = 0; i < even.size(); i++)
        {
            cout << even[i];
        }
        cout << " ";
        for (int i = 0; i < odd.size(); i++)
        {
            cout << odd[i];
        }
        even.clear();
        odd.clear();
        cout << endl;
    }
    return 0;
}
