// Day 16: Exceptions - String to Integer

#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;

int main()
{
    string S;
    cin >> S;
    try
    {
        int a = stoi(S);
        cout << a << endl;
    }
    catch (invalid_argument a)
    {
        cout << "Bad String" << endl;
    }
    return 0;
}