#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> arr)
{
    vector<int> answer;
    vector<int>::iterator iter;
    for (iter = arr.begin(); iter != arr.end(); iter++) {
        if (iter == arr.begin()) {
            answer.push_back(*iter);
            continue;
        }
        if (*iter == *(iter - 1))   continue;
        answer.push_back(*iter);
    }
    return answer;
}