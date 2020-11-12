#include <string>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

int solution(int n)
{
    int answer = 0;
    vector<int> v;
    while (1)
    {
        v.push_back(n % 3);
        n /= 3;
        if (n == 1)
        {
            v.push_back(i);
            break;
        }
    }
    reverse(v.begin(), v.end());
    for (int i = 0; i < v.size(); i++)
    {
        answer += v[i] * pow(3, i);
    }
    return answer;
}