#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> array, vector<vector<int>> commands) {
    vector<int> answer;
    for (vector<int> i : commands) {
        vector<int> temp1;
        int a = i[0];
        int b = i[1];
        int c = i[2];
        for (; a <= b; a++) {
            temp1.push_back(array[a - 1]);
        }
        sort(temp1.begin(), temp1.end());
        answer.push_back(temp1[c - 1]);
    }
    return answer;
}