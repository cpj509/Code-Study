// Day 10: Binary Numbers

#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    int answer = 0;
    int temp = 0;
    while (n != 0)
    {
        if (n % 2 == 1)
        {
            temp++;
            if (temp > answer)
            {
                answer = temp;
            }
        }
        if (n % 2 == 0)
        {
            temp = 0;
        }
        n /= 2;
    }
    cout << answer << endl;

    return 0;
}