// Day 14: Scope

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

class Difference
{
private:
    vector<int> elements;

public:
    int maximumDifference;

    // Add your code here
    Difference(vector<int> _elements)
    {
        elements = _elements;
    }
    void computeDifference()
    {
        int minint = *min_element(elements.begin(), elements.end());
        int maxint = *max_element(elements.begin(), elements.end());
        maximumDifference = maxint - minint;
    }

}; // End of Difference class

int main()
{
    int N;
    cin >> N;

    vector<int> a;

    for (int i = 0; i < N; i++)
    {
        int e;
        cin >> e;

        a.push_back(e);
    }

    Difference d(a);

    d.computeDifference();

    cout << d.maximumDifference;

    return 0;
}