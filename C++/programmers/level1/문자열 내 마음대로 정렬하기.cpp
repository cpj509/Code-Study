#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<string> solution(vector<string> strings, int n) {
    vector<string> answer = strings;
    sort(answer.begin(), answer.end());
    for (int j = 0; j < answer.size(); j++) {
        for (int i = 0; i < answer.size() - j - 1; i++) {
            string temp = "";
            if (answer[i][n] > answer[i + 1][n]) {
                temp = answer[i];
                answer[i] = answer[i + 1];
                answer[i + 1] = temp;
            }
        }
    }
    return answer;
}