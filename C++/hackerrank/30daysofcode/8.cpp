// Day 8: Dictionaries and Maps

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <map>
using namespace std;

int main()
{
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int t = 0;
    map<string, long> m;
    string name;
    cin >> t;
    for (int i = 0; i < t; i++)
    {
        long value;
        cin >> name >> value;
        m[name] = value;
    }
    while (cin >> name)
    {
        if (m[name] != NULL)
        {
            cout << name << "=" << m[name] << endl;
        }
        else
        {
            cout << "Not found" << endl;
        }
    }
    return 0;
}